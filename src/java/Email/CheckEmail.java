
package Email;

import java.util.regex.*;


public class CheckEmail {

    public static boolean checkGivenEmail ( String mail ){
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher m = p.matcher(mail);
        boolean matchFound = m.matches();
        return matchFound;
    }
}
