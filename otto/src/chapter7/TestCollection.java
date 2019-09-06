package chapter7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection set = new HashSet();
		set.add("铁汁");
		set.add(12306);
		System.out.println("set里面元素的个数"+set.size());
		set.remove("铁汁");
		System.out.println("set里面元素的个数"+set.size());
		System.out.println("12306永不为奴"+set.contains(12306));
		set.add("想要好好学习");
		System.out.println(set);
		
		Collection collection = new ArrayList();
		collection.addAll(set);
		collection.add("coll");
		System.out.println(collection);
	}

}
