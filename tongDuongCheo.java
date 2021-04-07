import java.util.Scanner;

public class tongDuongCheo {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử arr: ");
        int size1 = sc.nextInt();

        int arr[][] = new int[size1][size1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Nhập phần tử " + i + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==j){
                sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính: " + sum);
    }
}
