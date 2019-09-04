package YM;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection book = new ArrayList();
		for(int i = 0;i < 10;i++) {
			book.add("下饭"+i);
		}
		Iterator it = book.iterator();
		while(it.hasNext()) {
			String bo = (String) it.next();
			System.out.print(bo+" ");
			if(bo.equals("下饭6")) {
				it.remove();
			}
		}
		System.out.println();
		System.out.print(book);
	}

}
