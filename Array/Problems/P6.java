public class P6 {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 20, 30, 30, 30 };
    removeDuplicates2(arr);
  }

  public static void removeDuplicates1(int[] arr) {
    // T.C. -> O(n)
    // S.C. -> O(n)
    int copyArr[] = new int[arr.length];
    copyArr[0] = arr[0];
    int i = 0, j = 1;

    while (j < arr.length) {
      if (copyArr[i] != arr[j]) {
        copyArr[++i] = arr[j];
      }
      j++;
    }

    for (int num : copyArr) {
      System.out.print(num + " ");
    }
  }

  public static void removeDuplicates2(int[] arr) {
    // T.C. -> O(n)
    // S.C. -> O(1)
    int i = 0, j = 1;

    while (j < arr.length) {
      if (arr[i] != arr[j]) {
        arr[++i] = arr[j];
      }
      j++;
    }

    while (i < arr.length - 1) {
      arr[++i] = 0;
    }

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}

// https://www.geeksforgeeks.org/remove-duplicates-sorted-array/
