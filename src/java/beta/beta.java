
package beta;

import java.sql.*;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "beta")
public class beta {

    String total;
    String connectionURL =
            "jdbc:mysql://83.212.240.15:3306/it20818?user=it20818&password=changeit";
    Connection connection = null;
    Statement statement = null;
    ResultSet rs = null;

    @WebMethod(operationName = "transfer")
    public String transfer(@WebParam(name = "pass") String pass, @WebParam(name = "usr") String usr, @WebParam(name = "acc_from") String acc_from, @WebParam(name = "acc_to") String acc_to, @WebParam(name = "amount") double amount) {
        int ret = ConnectionNE(pass, usr, acc_from, acc_to, amount);
        switch (ret) {
            case 0:
                return "Transfer failed incompatable amounts."+ '\n' + total;

            case 1:
                return "Transfer completed."+'\n'+ total;

            case -1:
                return "Invalid account IDs. Transfer failed."+'\n';

            default:
                return null;
        }

    }

    public int ConnectionNE(String pass, String usr, String accF, String accT, double amount) {
        double howmuchf = 0, howmucht = 0;
        double res = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(connectionURL);
            statement = connection.createStatement();

            //get the amount of from account
            rs = statement.executeQuery("SELECT H.accBALANCE FROM HasACCOUNT H "
                    + "JOIN ACTOR A ON (H.ActAFM = A.AFM) "
                    + "WHERE A.PASSWORD='" + pass + "' AND H.ActAFM='" + usr + "' AND H.AccID='" + accF + "'");
            if (rs.next()) {
                howmuchf = Double.parseDouble(rs.getString("accBALANCE"));
            }
            //get the value of the to account
            rs = statement.executeQuery("SELECT H.accBALANCE FROM HasACCOUNT H "
                    + "JOIN ACTOR A ON (H.ActAFM = A.AFM) "
                    + "WHERE A.PASSWORD='" + pass + "' AND H.ActAFM='" + usr + "' AND H.AccID='" + accT + "'");
            if (rs.next()) {
                howmucht = Double.parseDouble(rs.getString("accBALANCE"));
            }
            //info for account balance
            total = toString(howmuchf, howmucht);

            //check if valid transaction
            if (amount > howmuchf) {
                return 0;
            } else {
                //exequte updates
                total = toString(howmuchf-amount, howmucht+amount);
                res = howmuchf - amount;
                statement.executeUpdate("UPDATE HasACCOUNT SET accBALANCE='" + res + "'WHERE AccID='" + accF + "';");
                res = howmucht + amount;
                statement.executeUpdate("UPDATE HasACCOUNT SET accBALANCE='" + res + "'WHERE AccID='" + accT + "';");
                statement.executeUpdate("INSERT INTO TRANSACTION  VALUES ('WITHDRAW', CURRENT_TIMESTAMP,'"+accF+"','"+usr+"',"+amount+" );");
                statement.executeUpdate("INSERT INTO TRANSACTION  VALUES ('DEPOSIT', CURRENT_TIMESTAMP,'"+accT+"','"+usr+"',"+amount+" );");
                return 1;
            }


        } catch (Exception ex) {
            return -1;
        }

    }

    private String toString(double howmuchf, double howmucht) {
        return ("retreaving account Balanced = " + howmuchf + " recieving account Balanced = " + howmucht);
    }

    
}
