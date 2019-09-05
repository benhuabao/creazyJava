package Chapter7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array
		String [] str1 = new String[900000];
		for (int stri = 0; stri < str1.length; stri++) {
			str1[stri] = String.valueOf(stri);
		}
		//ArrayList
		ArrayList alist = new ArrayList();
		for (int i = 0; i < 900000; i++) {
			alist.add(str1[i]);
		}
		//ArrayList
		LinkedList llist = new LinkedList();
		for (int i = 0; i < 900000; i++) {
		llist.add(str1[i]);
		}
		
		long stime1 = System.currentTimeMillis();
		for(Iterator it = alist.iterator();it.hasNext();) {
			it.next();
		}
		long etime1 = System.currentTimeMillis();
		System.out.println("ArrayList"+(etime1-stime1));
		
		long stime2 = System.currentTimeMillis();
		for(Iterator it = llist.iterator();it.hasNext();) {
			it.next();
		}
		long etime2 = System.currentTimeMillis();
		System.out.println("LinkedList"+(etime2-stime2));
		
		long stime3 = System.currentTimeMillis();
		for (int i = 0; i < alist.size(); i++) {
			alist.get(i);
		}
		long etime3 = System.currentTimeMillis();
		System.out.println("ArrayListFor"+(etime3-stime3));
	}

}
