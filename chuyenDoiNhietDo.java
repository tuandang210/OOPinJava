import java.util.Scanner;

public class chuyenDoiNhietDo {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        int choice;
        Scanner sc =new Scanner(System.in);
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");

            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập độ F: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Chuyển sang độ C là: "+fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Nhập độ C: ");
                    celsius = sc.nextDouble();
                    System.out.println("Chuyển sang độ F là: "+celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }
}
