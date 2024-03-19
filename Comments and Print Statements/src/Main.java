public class Main {
    public static void main(String[] args) {

        // This is a one line comment

        /* You can make multiple comment lines like this
         * The slashes and asterisks (stars) indicate where the comment begins and ends
         * A comment begins after /* and ends with * / (no space between the asterisk and slash)
         * Asterisks that start each line that do are not a part of the beginning or end of a comment are for readability
         */

         /* With that in mind, you can also create a one line comment like this */

        System.out.println("Hello, World!"); 
        /* ALL statements that are not class or if-else related MUST have a semicolon at the end
         * Think of the semicolon as being like a period for Java statements
         */

        /* This is a System.out.println() statement
         * It prints either a literal or a variable value based on the stuff within the parenthesis AND THEN prints a new line
         * To print a literal, the statement needs to be surrounded by quotation marks
         * Printing a literal will (quite literally) print what is inside the quotation marks
         * Not adding the quotation marks results in the given variable value being printed
         * If no variable with the given name exists, an error is thrown
         */

        System.out.print("Water");
        /* This is a System.out.print() statement
         * It does the same thing as System.out.println() but does NOT print a new line
         * Once again, not adding the quotation marks results in the given variable value being printed with an error being thrown if the variable does not exist
         */

        System.out.print("melon");

        // The code will print out "Hello, World!" in the first line followed by "Watermelon" in the second line
    }
}
