// Scala program for Regular 
// Expressions
  
// Creating object
object GfG 
{
  
    // Main method
    def main(args: Array[String]) 
    {
      
        // Applying r() method
        val portal = "GeeksforGeeks".r
        val CS = "GeeksforGeeks is a CS portal."
  
        // Displays the first match
        println(portal findFirstIn CS)
    }
}

//////////////////////////////////////////////////////////////

// Scala program for Regular 
// Expressions
import scala.util.matching.Regex
  
// Creating object
object GfG 
{
  
    // Main method
    def main(args: Array[String]) 
    {
      
        // Applying Regex class
        val x = new Regex("Nidhi")
        val myself = "My name is Nidhi Singh."
  
        // replaces first match with the
        // String given below
        println(x replaceFirstIn(myself, "Rahul"))
    }
}
 
///////////////////////////////////////////////////////////////////

// Scala program for Regular 
// Expressions
import scala.util.matching.Regex
  
// Creating object
object GfG 
{
  
    // Main method
    def main(args: Array[String]) 
    {
      
        // Applying Regex class
        val Geeks = new Regex("(G|g)fG")
        val y = "GfG is a CS portal. I like gfG"
  
        // Displays all the matches separated
        // by a separator
        println((Geeks findAllIn y).mkString(", "))
    }
}

/////////////////////////////////////////////////////////////////////////////

// Java program to check URL is valid or not
// using Regular Expression
 
import java.util.regex.*;
 
class GFG {
 
    // Function to validate URL
    // using regular expression
    public static boolean
    isValidURL(String url)
    {
        // Regex to check valid URL
        String regex = "((http|https)://)(www.)?"
              + "[a-zA-Z0-9@:%._\\+~#?&//=]"
              + "{2,256}\\.[a-z]"
              + "{2,6}\\b([-a-zA-Z0-9@:%"
              + "._\\+~#?&//=]*)";
 
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
 
        // If the string is empty
        // return false
        if (url == null) {
            return false;
        }
 
        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(url);
 
        // Return if the string
        // matched the ReGex
        return m.matches();
    }
 
    // Driver code
    public static void main(String args[])
    {
        String url
            = "https://www.geeksforgeeks.org";
        if (isValidURL(url) == true) {
            System.out.println("Yes");
        }
        else
            System.out.println("NO");
    }
}
