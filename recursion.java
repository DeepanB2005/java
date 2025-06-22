
public class recursion {
static void printIncreasingOrder(int[] arr, int index) {
            if (index == arr.length) {
                return;
            }
            System.out.print(arr[index] + " ");
            printIncreasingOrder(arr,index + 1);
        }
static void printDecreasingOrder(int[] arr, int index) {
            if (index < 0) {
                return;
            }
            System.out.print(arr[index] + " ");
            printDecreasingOrder(arr, index - 1);
        }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        printIncreasingOrder(arr, 0);
        System.out.println();
        printDecreasingOrder(arr, arr.length - 1);
    }
}
