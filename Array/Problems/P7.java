public class P7 {
  public static void main(String[] args) {
    int[] arr = { 0, 0, 0, 0, 0, 2, 10, 0, 0, 0, 1 };
    method2(arr);
  }

  public static void method1(int[] arr) {
    int i = 0, j = 0, copyArr[] = new int[arr.length];

    while (j < arr.length) {
      if (arr[j] != 0) {
        copyArr[i++] = arr[j];
      }
      j++;
    }

    for (int num : copyArr) {
      System.out.print(num + " ");
    }
  }

  public static void method2(int[] arr) {
    int i = 0, j = 0;

    while (j < arr.length) {
      if (arr[j] != 0) {
        arr[i++] = arr[j];
        arr[j] = 0;
      }
      j++;
    }

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}

// https://www.geeksforgeeks.org/move-zeroes-end-array/