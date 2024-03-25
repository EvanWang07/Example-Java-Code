package com.examples;

import java.util.ArrayList;

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

    public void flipCoinSimulation(int flipsPerTrial, int amountOfTrials, String graphType) {
        ArrayList<Integer> headsInPastTrials = new ArrayList<Integer>();
        ArrayList<Integer> tailsInPastTrials = new ArrayList<Integer>();
        ArrayList<Integer> differenceInPastTrails = new ArrayList<Integer>();
        for (int trialsFinished = 0; trialsFinished < amountOfTrials; trialsFinished++) {
            flipCoin(flipsPerTrial, true);
            headsInPastTrials.add(heads);
            tailsInPastTrials.add(tails);
            differenceInPastTrails.add(heads - tails);
        }
        if (graphType.equals("HEADS") || graphType.equals("heads") || graphType.equals("Heads")) {
            System.out.println("HEADS DATA FROM " + amountOfTrials + " TRIALS INVOLVING " + flipsPerTrial + " FLIPS PER TRIAL:");
            for (int a = 0; a <= flipsPerTrial; a++) {
                System.out.print(a + ": ");
                for (int b = 0; b < headsInPastTrials.size(); b++) {
                    if (headsInPastTrials.get(b) == a) {
                        System.out.print("X");
                    }
                }
                System.out.println("");
            }
        } else if (graphType.equals("TAILS") || graphType.equals("tails") || graphType.equals("Tails")) {
            System.out.println("TAILS DATA FROM " + amountOfTrials + " TRIALS INVOLVING " + flipsPerTrial + " FLIPS PER TRIAL:");
            for (int a = 0; a <= flipsPerTrial; a++) {
                System.out.print(a + ": ");
                for (int b = 0; b < tailsInPastTrials.size(); b++) {
                    if (tailsInPastTrials.get(b) == a) {
                        System.out.print("X");
                    }
                }
                System.out.println("");
            }
        } else {
            System.out.println("[flipCoinSimulation] ERROR: Invalid graphType used, check the parameters used in the method calling!");
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


