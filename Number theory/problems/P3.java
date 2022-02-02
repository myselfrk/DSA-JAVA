import java.util.*;

public class P3 {
  static int[] ansArr = new int[100005];
  static int modulo = 1000000007;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    troublesomeHarsha();
    int T = sc.nextInt();
    while (T-- > 0) {
      int num = sc.nextInt();
      System.out.println(ansArr[num] - 1);
    }
    sc.close();
  }

  public static void troublesomeHarsha() {
    Arrays.fill(ansArr, 1);
    for (int i = 1; i < ansArr.length; ++i) {
      for (int j = i; j < ansArr.length; j += i) {
        ansArr[j] = (ansArr[j] * (i + 1)) % modulo;
      }
    }
  }

}

// https://www.codechef.com/problems/COWA19C

// 4 -> 1 2 4 -> {1},{2},{4},{1*2},{1*2*4},{1*4},{2*4} = 1 + 2 + 4 + 2 + 8 + 4 +
// (1+1)*(1+2)*(1+4)

// {2,4} -> {2}, {4} , {2*4} , {1}