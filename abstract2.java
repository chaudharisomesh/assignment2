package assignment2;

abstract class Marks{
    abstract double getPercentage();
}
class A extends Marks {
    private float sub1, sub2, sub3;

    public A(float s1, float s2, float s3) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

    double getPercentage() {
        return (sub1 + sub2 + sub3) / 300.0 * 100;
    }
}
class B extends Marks{
    private float sub1, sub2, sub3, sub4;
    public B(float s1, float s2, float s3, float s4) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
    }
    double getPercentage() {
        return (sub1 + sub2 + sub3 +sub4)/400.0 * 100;
    }
}
public class abstract2 {
    public static void main(String[] args) {
        A a = new A(47, 74, 22);
        B b = new B(74, 47, 56, 22);
        double p1 = a.getPercentage();
        double p2 = b.getPercentage();
        System.out.println("Percentage of student A : " + p1);
        System.out.println("Percentage of student B : " + p2);
    }
}
