package Tax;
class Tax{

    public  static float calVat(float m){
        return 0.07f*m;
    }
    public  static float calFuel(float m){
        return 0.03f*m;
    }
}

public class Main {
    public static void main(String[] args) {
        float money = 5000;
//        Tax t = new Tax();
        float c1 = Tax.calVat(5000);
        float c2 = Tax.calFuel(5000);
        System.out.println("Product Price: " + money + "bath" + "Vat 7%= " +c1);
        System.out.println("Tax Oil 3%: " + c2 + "bath" + "Total= " + (c1+c2));
    }
}
