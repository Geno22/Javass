/*
 * Author: Mathis Dehez
 * Date: 19 févr. 2019
*/

package bits;

public final class Bits32 {
private Bits32() {}

public static int mask(int start, int size) throws IllegalArgumentException{
	int values=start+size;
	int indexBit=0b0;
	if(start>31 || start <0 || start+size > 31 || size <0) throw new IllegalArgumentException();
	for (int i = start; i<values;i++) {
		int mask = 1 << i;
		indexBit = indexBit | mask;
	}
	return indexBit;
}

public static int extract(int bits, int start, int size) throws IllegalArgumentException{
	int values=start+size;
	int extractedBits;
	if(start>31 || start <0 || start+size > 31 || size <0) throw new IllegalArgumentException() ;
	bits=bits>>>start;
		bits=bits<<Integer.SIZE-values-1;
		bits=bits>>>Integer.SIZE-values-1; //c'est un peu fouilli de devoir faire comme ca non?
		extractedBits=0 | bits;
		return extractedBits;
}

public static int pack(int v1, int s1, int v2, int s2) throws IllegalArgumentException{
	int packedBits;
	try {
		checkSizeValue(v1,s1);
		checkSizeValue(v2,s2);
	}
	catch(IllegalArgumentException e) {
		throw new IllegalArgumentException();
	}
	if(s1+s2>Integer.SIZE)throw new IllegalArgumentException();

	packedBits=v2<<s1;
	packedBits=packedBits | v1;
	
	return packedBits;
}

private static boolean checkSizeValue(int v1, int s1) throws IllegalArgumentException{
	if (v1<=Math.pow(2, s1) && 1<=s1 && s1<=31) return true;
	else throw new IllegalArgumentException();
}

}
