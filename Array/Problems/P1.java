public class P1 {
  public static void main(String[] args) {
    int arr[] = { 1, 4, 3, 6, 7, 2, 9, 0 };

    System.out.println(largestElement(arr));
  }

  public static int largestElement(int[] arr) {
    int largest = Integer.MIN_VALUE;

    for (int num : arr) {
      largest = Math.max(largest, num);
    }

    return largest;
  }
}

// https://www.geeksforgeeks.org/c-program-find-largest-element-array/
