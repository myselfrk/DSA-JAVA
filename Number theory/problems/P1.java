import java.io.*;
import java.util.*;

public class P1 {
  public static void main(String[] args) throws IOException {
    int maxSize = 1000005;
    BitSet isCubeFree = new BitSet(maxSize);
    isCubeFree.set(1, maxSize);

    for (int div = 2; div * div * div < maxSize; ++div) {
      if (isCubeFree.get(div)) {
        int cubeOfDiv = div * div * div;
        for (int multiple = 1; cubeOfDiv * multiple < maxSize; ++multiple) {
          isCubeFree.set(cubeOfDiv * multiple, false);
        }
      }
    }

    int[] positionArr = new int[maxSize];
    int countPosition = 1;

    for (int i = 1; i < maxSize; ++i) {
      if (isCubeFree.get(i)) {
        positionArr[i] = countPosition++;
      }
    }

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    int caseCount = 1;
    while (T-- > 0) {
      int num = Integer.parseInt(br.readLine());

      if (positionArr[num] > 0) {
        System.out.println("Case " + caseCount + ": " + positionArr[num]);
      } else {
        System.out.println("Case " + caseCount + ": Not Cube Free");
      }
      caseCount++;
    }
  }
}

// https://www.spoj.com/problems/CUBEFR/
