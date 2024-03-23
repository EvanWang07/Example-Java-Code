package com.examples;

public class Coin {
    private int heads;
    private int tails;
    private static int totalHeads;
    private static int totalTails;
    private static int totalFlips;

    public Coin() {
        heads = 0;
        tails = 0;
        totalHeads = 0;
        totalTails = 0;
        totalFlips = 0;
    }

    public void resetCoin() {
        tails = 0;
        heads = 0;
    }

    private int getCurrentHeads() {
        return heads;
    }

    private int getCurrentTails() {
        return tails;
    }

    private static int getTotalHeads() {
        return totalHeads;
    }

    private static int getTotalTails() {
        return totalTails;
    }

    private static int getTotalFlips() {
        return totalFlips;
    }

    public void displayCoinStats() {
        System.out.println("Current # of Heads: " + getCurrentHeads());
        System.out.println("Current # of Tails: " + getCurrentTails());
        System.out.println("Total # of Heads: " + getTotalHeads());
        System.out.println("Total # of Tails: " + getTotalTails());
        System.out.println("Total # of Flips: " + getTotalFlips());
    }

    public void flipCoin(int trials, boolean reset) {
        if (reset) {
            resetCoin();
        }
        int randomNumber = (int) (2 * Math.random());
        for (int i = 0; i < trials; i++) {
            if (randomNumber == 0) {
                tails++;
                totalTails++;
            } else {
                heads++;
                totalHeads++;
            }
            randomNumber = (int) (2 * Math.random());
        }
        totalFlips += trials;
    }
    
    public void flipUntilPerfect(int target) {
        int flipsTaken = 0;
        int trialsTaken = 0;
        while ((heads < target) && (tails < target)) {
            flipCoin(target, true);
            flipsTaken += target;
            trialsTaken += 1;
            System.out.println("flipUntilPerfect Running. Total trials: " + trialsTaken);
        }
        System.out.println("Successfully got " + getCurrentHeads() + " heads and " + getCurrentTails() + " tails in " + trialsTaken + " trials, totalling " + flipsTaken + " flips");
    }

    public void flipUntilAmount(int target, boolean reset) {
        if (reset) {
            resetCoin();
        }
        int flipsTaken = 0;
        int trialsTaken = 0;
        while ((heads < target) && (tails < target)) {
            flipCoin(1, false);
            flipsTaken++;
            trialsTaken++;
            System.out.println("flipUntilAmount Running. Total trials: " + trialsTaken);
        }
        if (heads > tails) {
            System.out.println("Successfully reached the target amount for heads in " + trialsTaken + " trials, totalling " + flipsTaken + " flips");
        } else {
            System.out.println("Successfully reached the target amount for tails in " + trialsTaken + " trials, totalling " + flipsTaken + " flips");
        }
    }

    /*
    public void flipUntil(int target) {
       
       while ((heads != target) && (tails != target)){
            int flip = (int) (2 * Math.random());
            if (flip == 1){
                heads++;
            } else {
                tails++;
            }
            
            if ((heads > 0) && (tails > 0)){
            heads = 0;
            tails = 0;
            }
        }

        if (heads == target || tails == target){
            System.out.println("Success!!!");
        }
        
    }
    */
    
}


