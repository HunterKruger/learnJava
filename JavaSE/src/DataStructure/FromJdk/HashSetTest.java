package DataStructure.FromJdk;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by FY on 16/12/12.
 */
//哈希集合不循序重复的值
//哈希集合元素是无序的
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("apple");
        hs.add("banana");
        hs.add("pear");
        hs.add("orange");

        Iterator<String> it=hs.iterator();
        while(it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }

        System.out.println(hs.size());


    }
}
