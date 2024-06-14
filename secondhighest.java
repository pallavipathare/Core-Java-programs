public class secondhighest {

    public static int secLargeNo(int[] arr, int length) {
        int temp;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[length - 2];
    }

    public static void main(String[] args) {
        int[] arr = {14, 104, 78, 27, 94, 65, 12, 106, 96, 37, 89};
        int secLarge = secLargeNo(arr, arr.length);
        System.out.println(secLarge);
    }
}
