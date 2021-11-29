public class P3 {
  public static void main(String[] args) {
    int arr[] = { 1, 4, 3, 6, 7, 2, 9, 0, 8 };

    System.out.println(isSorted(arr));
  }

  public static boolean isSorted(int[] arr) {
    for (int i = 1; i < arr.length; ++i) {
      if (arr[i - 1] > arr[i]) {
        return false;
      }
    }
    return true;
  }
}

// https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/