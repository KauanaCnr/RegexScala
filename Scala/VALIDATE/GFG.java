package VALIDATE;

// Java program to validate
// HTML tag using regex.
 
import java.util.regex.*;
 
class GFG {
 
    // Function to validate
    // HTML tag using regex.
    public static boolean
    isValidHTMLTag(String str)
    {
        // Regex to check valid HTML tag.
        String regex
            = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";
 
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
 
        // If the string is empty
        // return false
        if (str == null) {
            return false;
        }
 
        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(str);
 
        // Return if the string
        // matched the ReGex
        return m.matches();
    }
 
    // Driver Code.
    public static void main(String args[])
    {
 
        // Test Case 1:
        String str1 = "<input value = '>'>";
        System.out.println(isValidHTMLTag(str1));
 
        // Test Case 2:
        String str2 = "<br/>";
        System.out.println(isValidHTMLTag(str2));
 
        // Test Case 3:
        String str3 = "br/>";
        System.out.println(isValidHTMLTag(str3));
 
        // Test Case 4:
        String str4 = "<'br/>";
        System.out.println(isValidHTMLTag(str4));
 
        // Test Case 5:
        String str5 = "<input value => >";
        System.out.println(isValidHTMLTag(str5));
    }
}