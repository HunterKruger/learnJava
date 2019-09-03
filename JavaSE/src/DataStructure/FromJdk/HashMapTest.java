package DataStructure.FromJdk;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by FY on 16/12/12.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,Student> hm=new HashMap<String,Student>();
        hm.put("num1", new Student("Ben",16));
        hm.put("num2", new Student("Bill",33));
        hm.put("num3", new Student("Burn",41));
        //通过key获取value
        Student s=hm.get("num1");
        System.out.println(s.getName()+" "+s.getAge());
        //获取key集合，再获取迭代器
        Iterator<String> it=hm.keySet().iterator();
        while(it.hasNext()){
            String key=it.next();
            Student student=hm.get(key);
            System.out.println("key="+key+" value["+student.getName()+" "+student.getAge()+"]");
        }



    }
}