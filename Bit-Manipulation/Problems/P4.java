
public class P4 {
  public static void main(String[] args) {
    int arr[] = { 2, 3, 2, 3, 4, 5, 5, 4, 4 };

    oddOnes(arr);

  }

  public static void oddOnes(int[] arr) {
    int oddNum = 0;
    for (int i = 0; i < arr.length; ++i) {
      oddNum ^= arr[i];
    }

    System.out.println(oddNum);
  }
}

// https://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/