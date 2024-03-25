public class Main {
    public static void main(String[] args) {
        int numerator = 500; // Creates an int variable called numerator with a value of 500
        int denominator = 1000; // Creates an int variable called denominator with a value of 1000
        double badResult = numerator / denominator;

        /* In Java, variables can also be created by having previously declared variables interact with each other
         * Here, we are creating a double variable, badResult, by dividing numerator by denominator
         * There is an issue, however; it is that we are doing integer division
         * Integer division involves dividing an int variable by another int variable
         * When integer division occurs, the resulting value is equal to the result rounded DOWN
         * Rounding will ALWAYS be down in integer division
         * That means that since badResult = 500 / 1000, the result will be 0.5 rounded down, or 0
         * To fix this issue, you can make either the numerator or denominator a double
         * This can be done through casting or by having one of the variables used be a double
         * Casting a variable involves putting the variable type desired in parenthesis next to what will be casted
         * An example is shown below
         */

        double goodResult = (double) numerator / denominator;

        /* In this example, we put (double) next to the variable numerator, converting it from an int to double
         * Now, numerator will have the value of 500.0 instead of 500
         * This allows for the correct result of 0.5 to be found
         * One note is that casting will NOT work if double goodResult = (double) (numerator / denominator)
         * In this case, casting will occur only AFTER numerator is divided by denominator, leading to the same problem as before
         */

        double badResultAgain = (double) (numerator / denominator);

        /* Printing the resulting variable values for each of the three examples from above */
        System.out.println(badResult);
        System.out.println(goodResult);
        System.out.println(badResultAgain);

        /* In general, casting will not be used too much in our team robotics code
         * The real moral-of-the-story is that you should not be mixing int and double variables together
         * Even if done properly, it likely is unnecessary and may indicate scrappy variable usage
         * And if you are having issues relating to variables, casting will almost NEVER be the solution
         * Your issue likely lies beyond shallow variable mismatches!
         */

        int numberOne = 5; // Creates an int variable called numberOne with a value of 5
        int numberTwo = 10; // Creates an int variable called numberTwo with a value of 10
        double numberThree = Math.PI; // Creates a double variable called numberThree with a value of PI (3.14)
        double sumOfNumbersOneTwo = numberOne + numberTwo;
        int sumOfNumbersTwoThree = numberTwo + (int) numberThree;

        /* Here, we are once again setting the value of a double variable (sumOfNumbersOneTwo) based on two int variables
         * With addition and subtraction, assuming that we are setting the value to a double, things should be mostly fine
         * No matter if you are setting it based on int variables or not, the value should be correct
         * HOWEVER, if you are trying to add double variables together to create a int variable, such as with sumOfNumbersTwoThree, issues come again
         * The issue is that you cannot make an int variable have decimals (as int variables only store integers)
         * To solve this, all double variables involved in setting the new int variable must be casted to an int
         * Doing so, however, means that the casted variable will have its value rounded DOWN to the nearest int
         * This means that sumOfNumbersTwoThree will equal 10 + 3 = 13
         */

        /* Printing the resulting variable values for each of the two examples from above */
        System.out.println(sumOfNumbersOneTwo);
        System.out.println(sumOfNumbersTwoThree);

        /* ONCE AGAIN (AND I HIGHLY EMPHASIZE THIS):
         * In general, casting will not be used too much in our team robotics code
         * The real moral-of-the-story is that you should not be mixing int and double variables together
         * Even if done properly, it likely is unnecessary and may indicate scrappy variable usage
         * And if you are having issues relating to variables, casting will almost NEVER be the solution
         * Your issue likely lies beyond shallow variable mismatches!
         */

        /* As some final notes for int and double variables:
         * Their values can be set based on essentially every other math operation as well
         * In addition, their values can be based on multiple operations as well, for example:
         * double totalPoints = pointMultiplier * (baseEarnedPoints - penaltyPoints);
         * That being said, if you are using multiple operations, just remember that PEMDAS still applies
         * PEMDAS: Parenthesis -> Exponents -> Multiplication -> Division -> Addition -> Subtraction
         * There is also the modulus operation (symbol being the percent sign ["%"])
         * Modulus finds the remainder of something; for example, 10 % 3 = 1
         * Modulus is not going to be very useful for robotics, but it is good to mention for general Java knowledge
         */

        String messageOne = "Water"; // Creates a String "variable" named messageOne containing "Water"
        String messageTwo = "melon"; // Creates a String "variable" named messageTwo containing "melon"
        String combinedMessages = messageOne + messageTwo;

        /* This example involves creating three String "variables": messageOne, messageTwo, and combinedMessages
         * messageOne and messageTwo are set as shown above, but combinedMessages is set to messageOne + messageTwo
         * Doing this simply merges the two String "variables," doing so by (essentially) "smushing" them together
         * This means that in this example, combinedMessages will be "Water" + "melon"
         * This makes the combinedMessages contain "Watermelon"
         */

        /* Printing the resulting variable value from the example involving Strings shown above */
        System.out.println(combinedMessages);

        /* As some final notes for String "variables":
         * Declaring them can also be based on booleans, doubles, and ints IF they come with String variables or literals
         * Doing so leads to the booleans, doubles, and ints having their values becoming a literal part of the message
         * For example, if:
         * String str1 = "Hello";
         * String str2 = "World";
         * int integer = 1;
         * String combinedStr = str1 + integer + str2;
         * This would mean combinedStr would contain "Hello1World"
         * IMPORTANT NOTE: This logic is the EXACT same as how print statements work!
         */

        int num1 = 5;
        int num2 = 5;
        boolean booleOne = (num1 == num2);

        /* Notice that when instantiating booleOne, we set it equal to (num1 == num2)
         * Doing so simply asks if the value of num1 is the same as the value of num2
         * In this case, num1 and num2 are both equal to 5, so they both have the same value
         * This means that booleOne will be equal to true
         */

        /* Note that as observed, when comparing int variables (which also applies to doubles) USE "=="
         * Do NOT use "=" as it will create a syntax error!
         */

        int num3 = 10;
        int num4 = 20;
        int num5 = 20;
        boolean booleTwo = (num3 < num4);
        boolean booleThree = (num3 > num4);
        boolean booleFour = (num5 >= num4);
        boolean booleFive = (num4 <= num5);
        
        /* For booleTwo, booleThree, booleFour, and booleFive, we use typical math expressions
         * "<" checks if the number on the left is less than the number on the right
         * ">" checks if the number on the left is greater than the number on the right
         * ">=" checks if the number on the left is greater than or equal to the number on the right
         * "<=" checks if the number on the left is less than or equal to the number on the right
         * booleTwo is true as num3 IS less than num4
         * booleThree is false as num3 IS NOT greater than num4
         * booleFour is true as even though num5 is not greater than num4, num5 equals num4
         * booleFive is true as even though num4 is not less than num5, num4 equals num5
         */

        /* Note that these math expressions only work for number-based variables such as int and double */

        String str1 = "Hello";
        String str2 = "World";
        boolean booleSix = str1.equals(str2);

        /* For booleSix, we set it equal to str1.equals(str2)
         * ".equals()" acts essentially the same way as "==" but for Strings
         * In this example, "Hello" is definitely not the same as "World"
         * That means that booleSix will have a value of false
         */
 
        /* That being said: DO NOT USE "==" FOR STRINGS, ALWAYS USE ".equals()"
         * USING "==" FOR STRINGS MAY RESULT IN LOGIC ERRORS INVOLVING THE WRONG BOOLEAN VALUE
         * The reasons are a little too complex to explain for now
         * Just remember to use ".equals()" for Strings
         */

        boolean booleSeven = !true;

        /* Notice the exclamation mark next to true in the declaration line for boolean booleSeven
         * Adding the exclamation mark is essentially like adding "not"
         * In this situation, it means booleSeven is NOT true, meaning it is false
         */

        boolean booleEight = (booleOne || booleSix);

        /* For booleEight, we now introduce "||" into our code and use our previous booleans, booleOne and booleSix
         * Adding the "||" is essentially like adding "or"
         * It checks if the values on EITHER the left OR right side of the "||" is true
         * This means that even though booleSix is false, booleEight is still true as booleOne is true
         * Note that the equivalent of booleEight is ((num1 == num2) || str1.equals(str2))
         */

        boolean booleNine = (booleEight && booleSeven);

        /* For booleNine, we now introduce "&&" into our code and use our previous booleans, booleEight and booleSeven
         * Adding the "&&" is essentially like adding "and"
         * It checks if the values on BOTH the left AND right side of the "&&" is true
         * This means that while booleEight is true, booleNine will still be false as booleSeven is false
         * Note that the equivalent of booleNine is (((num1 == num2) || str1.equals(str2)) && !true)
         */

        boolean booleTen = !(booleNine && !booleEight);

        /* For booleTen, we re-introduce the exclamation mark into our code
         * To figure out the value of booleTen, you can either distribute the "!" or evaluate the insides first
         * Distribution of the "!" involves De Morgan's Law which I will not use; feel free to research it
         * For this situation, I will use the strategy of evaluating the insides first:
         *   1. From the previous examples, we know booleNine is false and booleEight is true
         *   2. The exclamation mark next to booleEight means "NOT booleEight"
         *      This leads to !booleEight being false
         *   3. The "&&" checks if booleNine and !booleEight are both true
         *      This means that we get false as neither booleNine or !booleEight is true
         *   4. Finally, the exclamation mark at the beginning affects everything inside the parenthesis
         *      This means we have "NOT [everything in the parenthesis]" or "NOT false"
         *      This leads to booleTen being true
         */

        /* Printing the resulting variable values from the examples involving booleans shown above */
        System.out.println(booleOne);
        System.out.println(booleTwo);
        System.out.println(booleThree);
        System.out.println(booleFour);
        System.out.println(booleFive);
        System.out.println(booleSix);
        System.out.println(booleSeven);
        System.out.println(booleEight);
        System.out.println(booleNine);
        System.out.println(booleTen);
    }
}
