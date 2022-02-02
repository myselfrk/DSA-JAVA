import java.util.*;

public class P2 {
  static ArrayList<Integer> primes = new ArrayList<>();
  static int modulo = 1000000007;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    primeSieve();
    while (T-- > 0) {
      int N = sc.nextInt();
      System.out.println(countDivisors(N));
    }
    sc.close();
  }

  public static int countDivisors(int num) {
    int result = 1;
    for (int i = 0; primes.get(i) <= num; ++i) {
      int prime = primes.get(i);
      int count = 0;
      while (num / prime > 0) {
        count = count + (num / prime);
        prime *= primes.get(i);
      }
      result = (result * (count + 1)) % modulo;
    }
    return result;
  }

  public static void primeSieve() {
    int max = 50005;
    BitSet primeSet = new BitSet(max);
    primeSet.set(2, max);

    for (int i = 2; i * i <= max; ++i) {
      if (primeSet.get(i)) {
        for (int j = i * i; j <= max; j = i + j) {
          primeSet.set(j, false);
        }
      }
    }

    for (int i = 2; i < primeSet.length(); ++i) {
      if (primeSet.get(i)) {
        primes.add(i);
      }
    }
  }
}

// https://www.spoj.com/problems/DIVFACT/

// 6 -> 6 * 5 * 4 * 3 * 2 * 1
