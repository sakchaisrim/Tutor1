package PassByRef;

class Coins{
    int ten, five, one;
}
class ExChagneCoin{
    public void findCoin(Coins c, int m){
        c.ten = m/10;
        c.five = m%10/5;
        c.one = m%10%5;
    }

}

public class Main {
    public static void main(String[] args) {
        int money = 29;
        Coins coin = new Coins();

        ExChagneCoin coinData = new ExChagneCoin();

        coinData.findCoin(coin,money);

        System.out.println("เงิน "+ money + " บาท แลกได้" + "เหรียญสิบ " +
                coin.ten + "เหรียญ เหรียญห้า "+ coin.five + "เหรียญ เหรียญบาท " + coin.one
        + "เหรียญ");
    }
}
