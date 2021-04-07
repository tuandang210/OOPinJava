
import java.util.Scanner;

public class findMinIn2dArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử arr: ");
        int size1 = sc.nextInt();
        System.out.println("Nhập số lượng phần tử arr[0]: ");
        int size2 = sc.nextInt();
        int index1=0;
        int index2=0;
        int arr[][] = new int[size1][size2];
        int min = arr[0][0];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Nhập phần tử " + i + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(min>arr[i][j]){
                    min = arr[i][j];
                    index1+=i;
                    index2+=j;
                }
            }
        }

        System.out.println("Giá trị lớn nhất: "+min+" Vị trí: "+index1+" "+index2);

    }
}
