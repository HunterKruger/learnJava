package DataStructure.FromJdk;

import java.util.Iterator;
import java.util.LinkedList;

//LinkedList 采用的将对象存放在独立的空间中，而且在每个空间中还保存下一个链接的索引  但是缺点就是查找非常麻烦 要从第一个索引开始


public class LinkedListTest {

	public static void print(LinkedList<Man> ll){
		System.out.println("now:");
		for(int i=0;i<ll.size();i++){
			Man m=ll.get(i);
			System.out.println(m.getName()+" "+m.getAge()+" "+m.getHeight());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<Man> ll=new LinkedList<Man>();
        
        ll.add(new Man(21,"Sam",176));
        ll.add(new Man(24,"Tom",189));
        ll.add(new Man(25,"Jon",145));
        
        print(ll);
        
        Iterator<Man> it=ll.iterator();
        System.out.println("now:");
        while(it.hasNext()){
        	Man n=it.next();
        	System.out.println(n.getName()+" "+n.getAge()+" "+n.getHeight());
        }
        
        ll.pop();
        print(ll);
        
        ll.push(new Man(10,"Baby",10));
        print(ll);
        

	}

}