package day28_Review_Encapslation;

public class MathUtilzObj {

	public static void main(String[] args) {

        int sum = MathUtilz.add(5, 2);
        double area = MathUtilz.circleArea(2.5);
        double pi = MathUtilz.PI;
//        Cannot call the subtract() by class name since 
        // it is non-static method
//        int subtraction = MathUtilz.subtract(3,1);
        
        System.out.println("SUM: " + sum);
        System.out.println("area: " + area);
        System.out.println("PI: " + pi);

        MathUtilz utilz = new MathUtilz();//to recall it was non static
        System.out.println("Subtract: " + utilz.subtract(3, 1));
        

	}

}
