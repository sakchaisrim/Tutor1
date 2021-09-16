public class Wage {
    public int h;
    public float r;

    public float calWage(int h, float r){
        // statment;
        return (40*r)+(h-40)*(1.5f*r);

    }

    // Setter & Getter
    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
}
