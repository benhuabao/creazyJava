package YM;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		for(int i =0 ;i < 10 ;i++) {
			list.add("进击"+i);
		}
		System.out.println(list);
		list.add(3, "艾伦耶格尔");
		System.out.println(list);
		for(int i = 0 ; i < list.size() ; i++ ) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		list.remove(9);
		System.out.println(list);
		System.out.println();
		list.set(6, "兵长");
		System.out.println(list);
		
		for (String li : list) {
			System.out.print(li);
		}
		System.out.println();
		System.out.println(list.indexOf("兵长"));
		System.out.println(list.indexOf(new String("兵长")));
		//两者都是返回的6，说明List判断两个对象只要通过equals方法比较
		//返回的是true就行
	}

}
