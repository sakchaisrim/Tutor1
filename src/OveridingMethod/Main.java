package OveridingMethod;

class Shape{
    public float calArea(float x, float y){
        return 0;
    }
}

class Tri extends Shape{
    // Polymorphism
    @Override
    public float calArea(float x, float y) {
        return 0.5f*x*y;
    }
}
class Rec extends Shape{
    @Override
    public float calArea(float x, float y) {
        return x*y;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Tri area=" + new Tri().calArea(2,2));
        System.out.println("Rec area=" + new Rec().calArea(2,2));
    }
}
