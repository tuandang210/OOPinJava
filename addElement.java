import java.util.Arrays;
import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 7, 8, 3};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phần tử cần chèn: ");
        int number = sc.nextInt();
        System.out.print("Nhập vị trí cần chèn: ");
        int index = sc.nextInt();
//        if ((index <= 1) && (index >= (arr.length - 1))) {
//            System.out.println("Không chèn được phần tử vào mảng");
//        }
        int[] newArr = new int[arr.length+1];
        for(int i = 0; i<index;i++){
            newArr[i]=arr[i];
        }
        newArr[index]=number;
        for (int i=index+1;i<newArr.length;i++){
            newArr[i]=arr[i-1];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
