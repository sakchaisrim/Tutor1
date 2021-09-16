public class Wage_Noparam_Void {
    public static void main(String[] args) {
        Wage emp_wage = new Wage();
//        emp_wage.h= 50;
//        emp_wage.r= 100.0f;
//        emp_wage.setH(50);
//        emp_wage.setR(100.0f);
//        emp_wage.calWage(50, 100.0f);
        float total = emp_wage.calWage(50,100.0f);
        System.out.println("ค่าแรง= " + total+ "บาท");
    }
}
