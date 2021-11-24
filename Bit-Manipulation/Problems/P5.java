public class P5 {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 5 };

    missingNum(arr);

  }

  public static void missingNum(int[] arr) {
    int missing = 0;

    for (int i = 1; i <= arr.length + 1; ++i) {
      missing ^= i;
    }

    for (int i = 0; i < arr.length; ++i) {
      missing ^= arr[i];
    }

    System.out.println(missing);
  }
}

// https://www.geeksforgeeks.org/find-the-missing-number/
