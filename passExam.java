
import java.util.Scanner;

public class passExam {
    public static void main(String[] args) {
        int size;
        int[] arr;
        int count =0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng học sinh: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Quá giới hạn");
            }
        } while (size > 30);

        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập điểm học sinh: ");
            int score = sc.nextInt();
            while ((score > 10) || (score < 0)) {
                System.out.println("Nhập sai điểm");
                System.out.println("Nhập điểm học sinh: ");
                score = sc.nextInt();
            }
            arr[i]=score;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=5){
                count++;
            }
        }
        System.out.println("Số lượng học sinh pass là: "+count);
    }
}
