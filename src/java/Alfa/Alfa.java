
package Alfa;

import java.sql.*;
import java.util.regex.*;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "Alfa", serviceName = "AlfaService")
public class Alfa {
    String connectionURL =
            "jdbc:mysql://83.212.240.15:3306/it20818?user=it20818&password=changeit";
    Connection connection = null;
    Statement statement = null;
    ResultSet rs = null;

    @WebMethod(operationName = "Info")
    public String Info(@WebParam(name = "password") String password, @WebParam(name = "username") String username, @WebParam(name = "account") String account, @WebParam(name = "mail") String email) {
        if (mailCheck(email)) {
            return ConnectionNQ(password, username, account);
        }
        return null;
    }

    public boolean mailCheck(String email) {

        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher m = p.matcher(email);
        boolean matchFound = m.matches();

        return matchFound;

    }

    public String ConnectionNQ(String pass, String usr, String acc) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(connectionURL);
            statement = connection.createStatement();
            rs = statement.executeQuery("SELECT H.accBALANCE FROM HasACCOUNT H " +
                    "JOIN ACTOR A ON (H.ActAFM = A.AFM) " +
                    "WHERE A.PASSWORD='"+pass+"' AND H.ActAFM='"+usr+"' AND H.AccID='"+acc+"'");
            if (rs.next()) {
                return rs.getString("accBALANCE");
            }
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
            return ex.getLocalizedMessage();
        }
        return null;
    }
}
