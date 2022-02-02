import java.util.*;
import java.io.*;

public class Segmented_Sieve_Prime {
  public static void main(String[] args) {
    int max = 1000000;
    BitSet sieveSet = new BitSet(max);
    sieveSet.set(2, max - 1);

    for (int i = 2; i * i < max; ++i) {
      if (sieveSet.get(i)) {
        for (int j = i * i; j < max; j = i + j) {
          sieveSet.set(j, false);
        }
      }
    }

    ArrayList<Integer> primes = new ArrayList<>();

    for (int i = 2; i < sieveSet.length(); ++i) {
      if (sieveSet.get(i)) {
        primes.add(i);
      }
    }

    Scanner sc = new Scanner(System.in);
    long m = sc.nextLong();
    long n = sc.nextLong();
    sc.close();
    int range = (int) (n - m + 1);
    BitSet segmentedSieve = new BitSet(range);
    segmentedSieve.set(0, range - 1);

    for (int i = 0; primes.get(i) * primes.get(i) <= n; ++i) {
      int prime = primes.get(i);
      long nextNum = (m / prime) * prime;
      if (nextNum < m) {
        nextNum += prime;
      }
      if (m == 1) {
        m++;
      }

      for (; nextNum <= n; nextNum += prime) {
        if (prime < nextNum)
          segmentedSieve.set((int) (nextNum - m), false);
      }

    }

    ArrayList<Long> extendedPrimes = new ArrayList<>();

    for (int i = 0; i < segmentedSieve.length(); ++i) {
      if (segmentedSieve.get(i)) {
        extendedPrimes.add(i + m);
      }
    }

    for (Long num : extendedPrimes) {
      System.out.println(num);
    }
  }
}
