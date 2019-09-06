package chapter7;

import java.util.HashSet;
import java.util.Set;
class A{
	private int a;
	
	public A(int a) {
		super();
		this.a = a;
	}
	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
}

class B{
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 2;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
}
class C{
	
}
public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		//set.add(new A(12306));
		//boolean boo = set.add(new A(12306));
		//set.add(new B());
		//boolean boo = set.add(new B());
		set.add(new C());
		boolean boo = set.add(new C());
		System.out.println(boo);
		System.out.println(set);
	}
}
