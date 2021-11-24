public class Main {
  public static void main(String[] args) {
    System.out.println("BITWISE AND Operator -> 3 & 6 = " + (3 & 6));
    System.out.println("BITWISE OR Operator -> 3 | 6 = " + (3 | 6));
    System.out.println("BITWISE XOR Operator -> 3 ^ 6 = " + (3 ^ 6));
    System.out.println("BITWISE NOT Operator -> ~5 = " + ~5);

    System.out.println("LEFT SHIFT BY 1 -> 6 << 1 = " + (6 << 1));
    System.out.println("RIGHT SHIFT BY 1 -> 6 >> 1 = " + (6 >> 1));

    System.out.println("LEFT SHIFT BY 2 -> 6 << 2 = " + (6 << 2));
    System.out.println("RIGHT SHIFT BY 2 -> 6 >> 2 = " + (6 >> 2));

    System.out.println("LEFT SHIFT BY 1 OF -VE -> -6 << 1 = " + (-6 << 1));
    System.out.println("RIGHT SHIFT BY 1 OF -VE -> -6 >> 1 = " + (-6 >> 1));

    System.out.println("UNSIGNED RIGHT SHIFT BY 1 -> -6 >>> 1 = " + (-6 >>> 1));
  }
}

/*
 * AND Truth Table : 0 & 0 -> 0 , 1 & 0 -> 0 , 0 & 1 -> 0 , 1 & 1 -> 1
 * 
 * OR Truth Table : 0 | 0 -> 0 , 1 | 0 -> 1 , 0 | 1 -> 1 , 1 | 1 -> 1
 * 
 * XOR Truth Table : 0 ^ 0 -> 0 , 1 ^ 0 -> 1 , 0 ^ 1 -> 1 , 1 ^ 1 -> 0
 * 
 * NOT : It just invert the every bit of the number.
 * 
 * LEFT SHIFT BY 1: 0...000110 << 1 -> 0...001100
 * 
 * RIGHT SHIFT BY 1: 0...000110 >> 1 -> 0...000011
 * 
 * LEFT SHIFT BY 2: 0...000110 << 2 -> 0...011000
 * 
 * RIGHT SHIFT BY 2: 0...000110 << 2 -> 0...000001
 * 
 * LEFT SHIFT BY 1: 1...111001 << 1 -> 1...110011
 * 
 * RIGHT SHIFT BY 1: 1...111001 >> 1 -> 1...111100
 * 
 * UNSIGNED RIGHT SHIFT BY 1: 1...111001 >>> 1 -> 0...111100 (got converted to a
 * +ve number)
 */