package chapter8;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		apple<Integer> a = new apple<Integer>(5);
		System.out.println(a);
		apple<String> s = new apple<String>("好兄弟");
		System.out.println(s);
	}

}
///泛型
class apple<unknown>{
	public unknown info;

	public unknown getInfo() {
		return info;
	}

	public void setInfo(unknown info) {
		this.info = info;
	}

	public apple(unknown info) {
		super();
		this.info = info;
	}

	@Override
	public String toString() {
		return "apple [info=" + info + "]";
	}
	
}