import java.util.Scanner;

public class countElement {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        a = sc.nextLine();

        System.out.print("Nhập kí tự cần đếm: ");
        String b = sc.next();
        char c = b.charAt(0);
        char[] aArr = new char[a.length()];
        for (int j = 0; j < aArr.length; j++) {
            aArr[j] = a.charAt(j);
        }
        int count = 0;
        int index = -1;
        for (int i = 0; i < aArr.length; i++) {
            if (c == (aArr[i])) {
                count++;
                index = i;
            }
        }
        System.out.println("Phần tử " + aArr[index] + " xuất hiện " + count + " lần");
    }
}
