import java.util.BitSet;

class Main {
  public static void main(String[] args) {
    System.out.println(isPrime4(5));
  }

  /**
   * T.C. = O(n)
   * S.C. = O(1)
   */
  public static boolean isPrime1(int num) {
    if (num == 1) {
      return false;
    }

    for (int i = 2; i < num; ++i) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * T.C. = O(√n)
   * S.C. = O(1)
   */

  public static boolean isPrime2(int num) {
    if (num == 1) {
      return false;
    }

    for (int i = 2; i * i < num; ++i) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean isPrime3(int num) {
    if (num == 1 || num % 2 == 0 || num % 3 == 0) {
      return false;
    }

    // every prime number can be represented as (6n-1) or (6n+1)
    // let n = 1 -> 5 , 7
    // n = 2 -> 11 , 13
    // n = 3 -> 17 , 19

    for (int i = 5; i * i < num; i = i + 6) {
      if (num % i == 0 || num % (i + 2) == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean isPrime4(int num) {
    int max = 100000;
    BitSet isPrimeSet = new BitSet(max);
    isPrimeSet.set(2, max);

    for (int i = 2; i * i <= max; ++i) {
      if (isPrimeSet.get(i)) {
        for (int j = i * i; j <= max; j = i + j) {
          isPrimeSet.set(j, false);
        }
      }
    }

    return isPrimeSet.get(num);
  }

}