package chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//同步集合对象,这样获取的就是线程安全版本的List Set Map了
		List list = Collections.synchronizedList(new ArrayList());
		Set s = Collections.synchronizedSet(new HashSet());
		Map m = Collections.synchronizedMap(new HashMap());
		
	}

}
