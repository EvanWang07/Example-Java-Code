import com.examples.Coin;

public class Main {

    public static void main(String[] args) {
        Coin goldCoin = new Coin();

        goldCoin.flipUntilPerfect(15);
        goldCoin.displayCoinStats();

        goldCoin.flipCoin(10, true);
        goldCoin.displayCoinStats();

        goldCoin.flipUntilAmount(5, true);
        goldCoin.displayCoinStats();
    }

}
