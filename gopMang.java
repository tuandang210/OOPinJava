import java.util.Arrays;
import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[6];
        int[] arrAll = new int[11];
        Scanner sc =new Scanner(System.in);

        for (int i=0; i<arr1.length;i++){
            System.out.print("Nhập phần tử "+i+ " cho mảng arr1: ");
            arr1[i]=sc.nextInt();
        }
        for (int i=0; i<arr2.length;i++){
            System.out.print("Nhập phần tử "+i+ " cho mảng arr2: ");
            arr2[i]=sc.nextInt();
        }
        for (int i =0; i<arr1.length;i++){
            arrAll[i]=arr1[i];
        }
        for (int i=5; i<arrAll.length;i++){
            arrAll[i]=arr2[i-5];
        }
        System.out.println(Arrays.toString(arrAll));
    }
}
