/*
 * Author: Mathis Dehez
 * Date: 18 févr. 2019
*/

public class Preconditions {
	
	private Preconditions() {}
	
	/**
	 * throw IAE if argument is false
	 * @param b
	 * @throws IllegalArgumentException
	 */
	public static void checkArgument(boolean b) throws IllegalArgumentException{
		if (!b) throw new IllegalArgumentException();	
	}
	
	/**
	 * check if an index is in the good range and throw IOOBE if not, otherwise return index
	 * @param index
	 * @param size
	 * @return index
	 * @throws IndexOutOfBoundsException
	 */
	public static int checkIndex(int index, int size) throws IndexOutOfBoundsException{
		if (index >=size || index <0) throw new IndexOutOfBoundsException();
		else return index;
	}
	
}
