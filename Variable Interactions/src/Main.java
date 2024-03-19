public class Main {
    public static void main(String[] args) {
        double interestRate = 0.50;
        double principal = 10000;
        double amountInOneYear;
        amountInOneYear = principal * (1 + interestRate);
        
        int derekAge = 14;
        int evanAge = 17;
        int ageDifference = Math.abs(evanAge - derekAge);
        if (evanAge > derekAge) {
            System.out.println("Derek, imagine not being old. Get better and be " + ageDifference + " years older!");
        } else if (evanAge == derekAge) {
            System.out.println("Derek, imagine not being older. Get better and get older!");
        } else {
            System.out.println("Derek, imagine not being young. Get better and be " + ageDifference + " years younger");
        }
    }
}
