package YM;

import java.util.ArrayList;
import java.util.Collection;

public class TestForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new ArrayList();
		for(int i = 0;i < 10;i++) {
			books.add("下饭"+i);
		}
		for (Object object : books) {
			String book = (String) object;
			System.out.print(book);
			if(book.equals("下饭2")){
				books.remove(book);
			}
		}
		System.out.println();
		System.out.print(books);
	}

}
