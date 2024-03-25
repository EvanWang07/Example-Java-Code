public class Main {
    public static void main(String[] args) {
        /* VERY IMPORTANT VARIABLE TYPES */
        int integer = 1; // Creates the int variable "integer" and sets its value to 1
        double decimal = Math.PI; // Creates the double variable "decimal" and sets its value to PI (3.14)
        boolean boole = true; // Creates the boolean variable "boole" and sets its value to true
        String word = "Word"; // Creates the String "variable" "word" and sets its value to "Word"

        /* Notice that the variable type goes before the name and its value is set using " = VALUE"
         * Similar to print statements, declatory statements always end with a semicolon!
         * int variables only hold integer values (that being, numbers such as -100, -1, 0, 1, 100 etc.)
         * double variables can hold any number, including all numbers held by int variables
         * boolean variables only holds either true or false
         * String "variables" hold any literal (remember: a literal is literally the stuff held in quotes)
         * In terms of storage, int variables take 32 bits, doubles 64 bits, and booleans a minimum of 1 bit
         */

        /* ANOTHER NOTE: ALL variables must be named in ONE "word"
         * As such, you cannot make an int variable with the name "Random Number"
         * You can, however, make an int variable with the name "RandomNumber" (no spaces used!)
         */

        /* ALSO: When naming variables, use camel-case!
         * Camel-case involves naming the variables where each starting letter of a word within the 
         * variable name is capitalized EXCEPT for the first word within the variable name
         * EX #1: String randomString
         * EX #2: double chanceOfRain
         * EX #3: int numberOfWatermelons
         * EX #4: boolean motorInverted
         */

        integer = 2; // Changes the value of integer to 2
        decimal = Math.E; // Changes the value of decimal to E (2.72)
        boole = false; // Changes the value of boole to false
        word = "Not a word"; // Changes the value of word to "Not a word"

        /* Changing variables involves a similar process as declaring them, HOWEVER:
         * DO NOT add the variable type before the name as that is ONLY for DECLARING variables
         */

        integer++; // Adds 1 to the value of integer
        integer--; // Subtracts 1 from the value of integer
        integer += 5; // Adds 5 to the value of integer
        integer -= 5; // Subtracts 5 from the value of integer
        integer *= 2; // Multiplies the value of integer by 2
        integer /= 2; // Divides the value of integer by 2

        decimal++; // Adds 1 to the value of decimal
        decimal--; // Subtracts 1 from the value of decimal
        decimal += 5; // Adds 5 to the value of decimal
        decimal -= 5; // Subtracts 5 from the value of decimal
        decimal *= 2; // Multiplies the value of decimal by 2
        decimal /= 2; // Divides the value of decimal by 2

        /* int AND double variables can also be changed using ++, --, +=, -=, *=, or /=
         * ++ adds 1 to the current variable value
         * -- subtracts 1 from the current variable value
         * += adds the number on the right to the current variable value
         * -= subtracts the number on the right from the current variable value
         * *= multiplies the current variable value by the number on the right
         * /= divides the current variable value by the number on the right
         */

        System.out.println(integer); // Prints the CURRENT value of integer
        System.out.println(decimal); // Prints the CURRENT value of decimal
        System.out.println(boole); // Prints the CURRENT value of boole
        System.out.println(word); // Prints the CURRENT value of word

        // Notice that the stuff inside the parenthesis do NOT have quotation marks, making the print statement print the variable value instead

        // To make the print statements print some context along with the info:
        System.out.println("integer value: " + integer);
        System.out.println("decimal value: " + decimal);
        System.out.println("boole value: " + boole);
        System.out.println("word value: " + word);

        /* Now, when running the first print statement out of this group of print statements:
         * Both "integer value: " and integer will be printed on the same line
         * Similar outcomes will happen with the rest of the print statements in the group
         * Printing information out this way tells the coder what they are actually printing, making debugging much easier when used properly
         */
    }
}
