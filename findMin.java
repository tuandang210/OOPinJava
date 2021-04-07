public class findMin {

    public static int minValue(int[] arr) {
        int index = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (index > arr[i]) {
                index = arr[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 6, 7, 4, 7};
        int a = minValue(arr);
        System.out.println("The smallest element in the array is: " + a);
    }
}
