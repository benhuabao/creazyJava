package YM;

import java.util.HashSet;
import java.util.Set;

public class testSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set book = new HashSet();
		book.add(new String("真龙"));
		boolean result = book.add(new String("真龙"));
		System.out.println(result);
	}

}
