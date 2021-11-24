public class P3 {
  public static void main(String[] args) {
    usingLookUpTable(8);

    usingCountSetBit2(8);

    method1(32);
  }

  public static void method1(int num) {
    // based on Brian Kerningam's Algo
    boolean isPowerOf2 = (num & (num - 1)) == 0;

    if (isPowerOf2 && num != 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  public static void usingLookUpTable(int num) {

    if (P2.lookUpTable(num) == 1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  public static void usingCountSetBit2(int num) {
    // using Brian Kerningam's Algo

    if (P2.countSetBit2(num) == 1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

}

// https://www.geeksforgeeks.org/program-to-find-whether-a-given-number-is-power-of-2/
