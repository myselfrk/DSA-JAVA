public class P1 {
  public static void main(String[] args) {
    System.out.println(checkKthBit1(39, 5));
    System.out.println(checkKthBit2(39, 5));
  }

  public static boolean checkKthBit1(int n, int k) {
    return ((n >> (k - 1)) & 1) == 1;
  }

  public static boolean checkKthBit2(int n, int k) {
    return (n & (1 << (k - 1))) != 0;
  }
}

// bit count start from right to left and LSB is counted as 0;

// https://www.geeksforgeeks.org/check-whether-k-th-bit-set-not/