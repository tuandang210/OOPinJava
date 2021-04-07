
import java.util.Scanner;

public class ptBacHai {
    double a;
    double b;
    double c;

    public ptBacHai() {
    }

    public ptBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double delta = b * b - 4 * a * c;
        return (-b + Math.pow(delta, 0.5)) / (2 * a);
    }

    public double getRoot2() {
        double delta = b * b - 4 * a * c;
        return (-b - Math.pow(delta, 0.5)) / (2 * a);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập vào b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập vào c: ");
        double c = sc.nextDouble();

        ptBacHai pt = new ptBacHai(a, b, c);

        double delta = pt.getDiscriminant();
        if (delta<0){
            System.out.println("Phương trình vô nghiệm");
        } else if (delta==0){
            System.out.println("Phương trình có 1 nghiệm: "+ pt.getRoot1());
        } else {
            System.out.println("Phương trình có nghiệm: "+pt.getRoot1()+" "+pt.getRoot2());
        }
    }
}
