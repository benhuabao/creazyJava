package Chapter7;

import java.util.Hashtable;

class ABB{
	int count;

	public ABB(int count) {
		super();
		this.count = count;
	}
	@Override
	public int hashCode() {
		// TODO ABButo-generated method stub
		return count;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO ABButo-generated method stub
		if(obj==this) {
			return true;
		}
		if(obj!=null && obj.getClass()==ABB.class) {
			ABB a = (ABB) obj;
			if(this.count == a.count) {
				return true;
			}
		}
		return false;
	}
}
class BB{
	@Override
	public boolean equals(Object obj) {
		// TODO ABButo-generated method stub
		return true;
	}
}
public class TestMap {

	public static void main(String[] args) {
		// TODO ABButo-generated method stub
		Hashtable ht = new Hashtable();
		ht.put(new ABB(12306),"花果山");
		ht.put(new ABB(110),"英雄联盟赛事");
		ht.put(new ABB(1803),new BB());
		System.out.println(ht);
		//因为B不管怎样都会返回true,所以任意字符串都会返回true
		System.out.println(ht.containsValue("测试"));
		System.out.println(ht.containsKey(new ABB(12306)));
		ht.remove(new ABB(110));
		for (Object key : ht.keySet()) {
			System.out.println(key+"   ");
			System.out.println(ht.get(key)+"\n");
		}
		System.out.println(ht.size());
	}

}
