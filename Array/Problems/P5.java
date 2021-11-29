public class P5 {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    reverseArray1(arr);
  }

  public static void reverseArray1(int[] arr) {
    for (int i = 0; i < arr.length / 2; ++i) {
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }

  public static void reverseArray2(int[] arr) {
    int low = 0, high = arr.length - 1;

    while (low < high) {
      int temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;

      low++;
      high--;
    }

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}

// https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
