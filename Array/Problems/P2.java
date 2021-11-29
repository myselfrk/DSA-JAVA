public class P2 {
  public static void main(String[] args) {
    // int arr[] = { 1, 4, 3, 6, 7, 2, 9, 0, 8 };
    int arr[] = { 1, 1, 1, 1, 1 };

    System.out.println(secondLargestElement1(arr));
    System.out.println(secondLargestElement2(arr));
  }

  public static int secondLargestElement1(int[] arr) {
    int firstLargest = P1.largestElement(arr);
    int secondLargest = -1;

    for (int num : arr) {
      if (secondLargest < num && num < firstLargest) {
        secondLargest = num;
      }
    }

    return secondLargest;
  }

  public static int secondLargestElement2(int[] arr) {
    int firstLargest = -1;
    int secondLargest = -1;

    for (int num : arr) {
      if (firstLargest < num) {
        secondLargest = firstLargest;
        firstLargest = num;
      }

      if (secondLargest < num && num < firstLargest) {
        secondLargest = num;
      }
    }

    return secondLargest;
  }
}

// https://www.geeksforgeeks.org/find-second-largest-element-array/