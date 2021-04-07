import java.util.Arrays;
import java.util.Scanner;

public class findMaxIn2dArray {

    public static void main(String[] args) {
        int index1=0;
        int index2=0;
        int arr[][] = new int[5][5];
        int max = arr[0][0];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Nhập phần tử " + i + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               if(max<arr[i][j]){
                   max = arr[i][j];
                   index1+=i;
                   index2+=j;
               }
            }
        }

        System.out.println("Giá trị lớn nhất: "+max+" Vị trí: "+index1+" "+index2);

    }
}
