public class P2 {
  public static int table[] = new int[256];

  public static void main(String[] args) {
    System.out.println(countSetBit1(3));
    System.out.println(countSetBit2(3));

    System.out.println(lookUpTable(8));
  }

  public static int countSetBit1(int num) {
    int setBits = 0;

    while (num > 0) {
      setBits += num & 1;
      num = num >> 1;
    }

    return setBits;
  }

  public static int countSetBit2(int num) {
    // Brian Kerningam's Algo
    int setBits = 0;

    while (num > 0) {
      num = num & (num - 1); // turned off the last bit
      setBits++;
    }

    return setBits;
  }

  // using look-up table

  public static void initializeTable() {
    table[0] = 0;
    for (int i = 1; i < table.length; ++i) {
      table[i] = (i & 1) + table[i / 2];
    }
  }

  public static int lookUpTable(int num) {
    initializeTable();
    return table[num & 0xff] + table[(num >> 8) & 0xff] + table[(num >> 16) & 0xff] + table[num >> 24];
  }
}

/**
 * Time Complexity :-
 * 
 * countSetBit1 -> O(total bit) , θ(total bit).
 * 
 * countSetBit2 -> O(total bit) , θ(count of set bit)
 * 
 * lookUpTable -> O(1)
 */

// https://www.geeksforgeeks.org/count-set-bits-in-an-integer/
// https://practice.geeksforgeeks.org/problems/set-bits0143/1