package InstanceMethod;

import java.util.Base64;

class Bonus{
    public static float calBonus(float s){
        return 0.05f*s;
    }
}

public class Main {
    public static void main(String[] args) {
//        Bonus cal = new Bonus();
//        System.out.println("Bonus= "+
//                cal.calBonus(50000) +
//                " bath"
//                );

        System.out.println("Bonus= "+
               Bonus.calBonus(50000)+
                " bath"
                );
    }
}
