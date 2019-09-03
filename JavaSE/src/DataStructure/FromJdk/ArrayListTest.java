package DataStructure.FromJdk;

import java.util.ArrayList;
import java.util.Iterator;
//ArrayList 采用的是数组形式来保存对象的，这种方式将对象放在连续的位置中，所以最大的缺点就是插入删除时非常麻烦

public class ArrayListTest {
	private static void print(ArrayList<String> al){
		System.out.println("now:");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
	}
	
    public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Apple");
		al.add("Pear");
		al.add("Banana");
		print(al);
		
		al.add(1, "Gun");
		print(al);
		System.out.println("Gun at index "+al.indexOf("Gun"));
		al.remove("Gun");
		print(al);
		
		al.set(2, "newBanana");
		print(al);
		
		System.out.println(al.size());
	
		Iterator<String> it=al.iterator();
		System.out.println("Use iterator");
		while(it.hasNext()){
			String s1=it.next();
			System.out.println(s1);
		}
	
	}
}