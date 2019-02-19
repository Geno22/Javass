/*
 * Author: Mathis Dehez
 * Date: 19 févr. 2019
*/

package bits;

public class testBits {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(Bits32.mask(0,6)));
		System.out.println(Integer.toBinaryString(Bits32.extract(0b00000000011111000,2,6)));
		System.out.println(Integer.toBinaryString(Bits32.pack(0b1101_0000,9,0b1111_1111,9)));
	}
}
