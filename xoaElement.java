import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class xoaElement {
    public static void main(String[] args) {
        int[] arr= {1,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phần tử cần xóa: ");
        int x = sc.nextInt();
        int[] newArr = new int[arr.length-1];
        int index;
        for(int i=0;i <arr.length;i++){
            if(x==arr[i]){
                for(int j=0; j<i;j++){
                    newArr[j]=arr[j];
                }
                for (int b=i+1;b<arr.length;b++){
                    newArr[b-1]=arr[b];
                }
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
