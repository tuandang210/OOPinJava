import java.util.Scanner;

public class sumInRow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử arr: ");
        int size1 = sc.nextInt();
        System.out.println("Nhập số lượng phần tử arr[0]: ");
        int size2 = sc.nextInt();

        int arr[][] = new int[size1][size2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Nhập phần tử " + i + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < arr[0].length; j++) {
            int sum=0;
            for (int i = 0; i < arr.length; i++) {
                sum+=arr[i][j];
            }
            System.out.print("Tổng cột "+j+" là: "+sum);
            System.out.println();
        }
    }
}