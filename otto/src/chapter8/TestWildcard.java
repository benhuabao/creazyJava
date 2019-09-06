package chapter8;

import java.util.ArrayList;
import java.util.List;

public class TestWildcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strlist = new ArrayList<String>();
		test(strlist);
		//但是通配符只能作为各个泛型的父类,并不能把元素加入其中
		//List<?> strlist2 = new ArrayList<String>();
		//strlist2.add("yoxi");
	}
	//使用通配符以后,我们可以使用任何的类型的集合来调用该方法
	public static void test(List<?> strlist) {
		for (int i = 0; i < strlist.size(); i++) {
			System.out.println(strlist.get(i));
		}
	}

}
