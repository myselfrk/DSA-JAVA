import java.util.*;
import java.io.*;

public class Sieve_Prime {
  public static void main(String[] args) {
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

    Scanner sc = new Scanner(System.in);
    System.out.println(isPrimeSet.get(sc.nextInt()));

  }
}
