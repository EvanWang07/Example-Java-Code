public class Main {
    public static void main(String[] args) {
        /* Initialize all variables */
        int kennedyTestMinScore = 0;
        int kennedyTestMaxScore = 50;
        int validTests = 0;
        double kennedyTestAvgScore;
        double evanScore = 234879;
        double ethanScore = -3472387;
        double lukeScore = 50;
        double derekScore = 49;
        double lukasScore = 41;
        double chrisScore = 7;
        double totalScore = 0;

        if ((evanScore >= kennedyTestMinScore) && (evanScore <= kennedyTestMaxScore)) {
            totalScore += evanScore;
            validTests++;
        }

        /* Lines 16-21 showcase an if-statement
         * If-statements will execute the code inside of its curly braces if a given condition is satisfied
         * For ALL if-statements, to satisfy the condition, what is in the parenthesis following "if" must be true
         * Remember that the value of true is a boolean
         * This means that you could literally put a single boolean inside that the parenthesis and have the condition met
         * As such, the general syntax of an if-statement is as follows:
         * if () {
         *    EXECUTE_CODE;
         * }
         * "if" indicates the use of an if-statement
         * The stuff inside () is the condition needed to execute the code inside the if-statement
         * The curly braces "{}" hold the code that will be executed if the condition is met
         * Notice that if-statements do NOT end with a semicolon!
         */

        /* Going back to our if-statement in lines 16-21, let us identify the components:
         *   1. "if" indicates the use of an if-statement
         *   2. (evanScore >= kennedyTestMinScore) && (evanScore <= kennedyTestMaxScore) is our condition, where it must equal true to execute the internal code
         *   3. "totalScore += evanScore;" and "validTests++;" is the code execute if the condition is met
         *   4. The curly braces contain the internal code, with the right curly brace "}" ending the if-statement
         */

        if ((evanScore >= kennedyTestMinScore) && (evanScore <= kennedyTestMaxScore)) {
            System.out.println("Evan's score was registered");
        } else {
            System.out.println("INVALID SCORE DETECTED! Evan's score was not registered");
            System.out.println("Evan's score failed to fit within the range of " + kennedyTestMinScore + " to " + kennedyTestMaxScore + " points");
        }

        /* In addition to lines 43-45 showcases an if-statement, lines 45-47 showcases an else-statement
         * else statements execute the code inside its curly braces if the if-statement's condition is not met
         * In this case, if kennedyTestMinScore <= evanScore <= kennedyTestMaxScore, the if-statement's internal code will execute
         * If evanScore does not fit those parameters, the else-statement's internal code will execute
         * For example, if evanScore is 40, the code "System.out.println("Evan's score was registered");" will execute
         * If evanScore is -10, the following code executes:
         *    "System.out.println("INVALID SCORE DETECTED! Evan's score was not registered");"
         *    "System.out.println("Evan's score failed to fit within the range of " + kennedyTestMinScore + " to " + kennedyTestMaxScore + " points");"
         */

        /* To add additional potential outcomes, use else if (condition) {}
         * else-if-statements involves executing code if the previous conditional statements did not execute and the conditions for the else-if-statement are met
         * This means the general structure of if-else statements are as follows:
         * if () {
         *    EXECUTE_CODE_1;
         * } else if () {
         *    EXECUTE_CODE_2;
         * } else {
         *    EXECUTE_CODE_3;
         * }
         * "if" indicates the use of an if-statement
         * EXECUTE_CODE_1 is executed if the conditions for the if-statement are met
         * "else if" indicates the use of an else-if-statement
         * EXECUTE_CODE_2 is executed if the conditions for the if-statement are not met, but the conditions for the else-if statement are met
         * "else" indicates the use of an else-statement
         * EXECUTE_CODE_3 is executed if neither the conditions of the if-statement or else-if-statement are met
         */

        /* Attempted registration for Ethan's score */
        if ((ethanScore >= kennedyTestMinScore) && (ethanScore <= kennedyTestMaxScore)) {
            /* Executes if the if-statement's conditions are met */
            totalScore += ethanScore;
            validTests++;
            System.out.println("Ethan's score was registered");
        } else if (ethanScore < kennedyTestMinScore) {
            /* Executes if the if-statement's conditions are NOT met but the else-if-statement's conditions ARE met */
            System.out.println("INVALID SCORE DETECTED! Ethan's score was not registered");
            System.out.println("Ethan's score was below the minimum score of " + kennedyTestMinScore);
        } else {
            /* Executes if neither the if-statement's or else-statement's conditions are met */
            System.out.println("INVALID SCORE DETECTED! Ethan's score was not registered");
            System.out.println("Ethan's score was above the maximum score of " + kennedyTestMaxScore);
        }

        /* Attempted registration for Luke's score */
        if ((lukeScore >= kennedyTestMinScore) && (lukeScore <= kennedyTestMaxScore)) {
            /* Executes if the if-statement's conditions are met */
            totalScore += lukeScore;
            validTests++;
            System.out.println("Luke's score was registered");
        } else if (lukeScore < kennedyTestMinScore) {
            /* Executes if the if-statement's conditions are NOT met but the else-if-statement's conditions ARE met */
            System.out.println("INVALID SCORE DETECTED! Luke's score was not registered");
            System.out.println("Luke's score was below the minimum score of " + kennedyTestMinScore);
        } else {
            /* Executes if neither the if-statement's or else-statement's conditions are met */
            System.out.println("INVALID SCORE DETECTED! Luke's score was not registered");
            System.out.println("Luke's score was above the maximum score of " + kennedyTestMaxScore);
        }

        /* Attempted registration for Derek's score */
        if ((derekScore >= kennedyTestMinScore) && (derekScore <= kennedyTestMaxScore)) {
            /* Executes if the if-statement's conditions are met */
            totalScore += derekScore;
            validTests++;
            System.out.println("Derek's score was registered");
        } else if (derekScore < kennedyTestMinScore) {
            /* Executes if the if-statement's conditions are NOT met but the else-if-statement's conditions ARE met */
            System.out.println("INVALID SCORE DETECTED! Derek's score was not registered");
            System.out.println("Derek's score was below the minimum score of " + kennedyTestMinScore);
        } else {
            /* Executes if neither the if-statement's or else-statement's conditions are met */
            System.out.println("INVALID SCORE DETECTED! Derek's score was not registered");
            System.out.println("Derek's score was above the maximum score of " + kennedyTestMaxScore);
        }

        /* Attempted registration for Lukas's score */
        if ((lukasScore >= kennedyTestMinScore) && (lukasScore <= kennedyTestMaxScore)) {
            /* Executes if the if-statement's conditions are met */
            totalScore += lukasScore;
            validTests++;
            System.out.println("Lukas's score was registered");
        } else if (lukasScore < kennedyTestMinScore) {
            /* Executes if the if-statement's conditions are NOT met but the else-if-statement's conditions ARE met */
            System.out.println("INVALID SCORE DETECTED! Lukas's score was not registered");
            System.out.println("Lukas's score was below the minimum score of " + kennedyTestMinScore);
        } else {
            /* Executes if neither the if-statement's or else-statement's conditions are met */
            System.out.println("INVALID SCORE DETECTED! Lukas's score was not registered");
            System.out.println("Lukas's score was above the maximum score of " + kennedyTestMaxScore);
        }

        /* Attempted registration for Chris's score */
        if ((chrisScore >= kennedyTestMinScore) && (chrisScore <= kennedyTestMaxScore)) {
            /* Executes if the if-statement's conditions are met */
            totalScore += chrisScore;
            validTests++;
            System.out.println("Chris's score was registered");
        } else if (chrisScore < kennedyTestMinScore) {
            /* Executes if the if-statement's conditions are NOT met but the else-if-statement's conditions ARE met */
            System.out.println("INVALID SCORE DETECTED! Chris's score was not registered");
            System.out.println("Chris's score was below the minimum score of " + kennedyTestMinScore);
        } else {
            /* Executes if neither the if-statement's or else-statement's conditions are met */
            System.out.println("INVALID SCORE DETECTED! Chris's score was not registered");
            System.out.println("Chris's score was above the maximum score of " + kennedyTestMaxScore);
        }

        /* Test result calculation and feedback */
        kennedyTestAvgScore = totalScore / validTests;
        System.out.println("The average score for Mrs. Kennedy's test was " + kennedyTestAvgScore + " out of a total of " + validTests + " valid tests...");
        if (kennedyTestAvgScore >= 45) {
            /* Executes if kennedyTestAvgScore => 45 */
            System.out.println("Mrs. Kennedy is very impressed! Good job!");
        } else if ((kennedyTestAvgScore >= 40) && (kennedyTestAvgScore < 45)) {
            /* Executes if 40 <= kennedyTestAvgScore < 45 */
            System.out.println("Mrs. Kennedy seems to be neither impressed or disappointed...");
        } else if ((kennedyTestAvgScore >= 35) && (kennedyTestAvgScore < 40)) {
            /* Executes if 35 <= kennedyTestAvgScore < 40 */
            System.out.println("Mrs. Kennedy seems to be quite disappointed...could've been worse...");
        } else if ((kennedyTestAvgScore >= 30) && (kennedyTestAvgScore < 35)) {
            /* Executes if 30 <= kennedyTestAvgScore < 35 */
            System.out.println("Mrs. Kennedy is VERY disappointed! Half the class has been put in detention!");
        } else {
            /* Executes if kennedyTestAvgScore < 30 */
            System.out.println("WOW, everyone really did THAT BAD!? Mrs. Kennedy is IMMEDIATELY emailing all parents about this abomination of a score!");
        }
    }
}
