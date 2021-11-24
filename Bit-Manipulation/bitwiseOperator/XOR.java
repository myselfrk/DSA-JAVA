public class XOR {
  public static void main(String[] args) {
    int x = 3;
    int y = 4;
    int z = 5;

    System.out.println((x ^ 0) == x);
    System.out.println((x ^ x) == 0);
    System.out.println("Commutative property -> " + ((x ^ y) == (y ^ x)));
    System.out.println("Associative property -> " + ((x ^ (y ^ z)) == ((x ^ y) ^ z)));

  }
}
