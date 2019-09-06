package chapter8;

public class TestT <T extends Number>{
	T col;
	public static void main(String[] args) {
		TestT<Integer> ai = new TestT<Integer>();
		TestT<Double> di = new TestT<Double>();
		//z不是number的子类,编译通不过
		TestT<String> as = new TestT<String>();
	}
}
