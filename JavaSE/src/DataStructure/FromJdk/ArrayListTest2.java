package DataStructure.FromJdk;
import java.util.ArrayList;

/**
 * Created by FY on 16/12/12.
 */


public class ArrayListTest2 {
    private static void print(ArrayList<String> arrayList){
        System.out.println("当前元素为：");
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<String> arrayList=new ArrayList<String>();
        //添加元素
        arrayList.add("Jack");
        arrayList.add("John");
        arrayList.add("Jane");
        print(arrayList);
        //将指定元素插入列表指定位置
        arrayList.add(2, "Peter");
        print(arrayList);
        //将指定元素替换列表指定位置的元素
        arrayList.set(2, "Tom");
        print(arrayList);
        //移除列表指定位置的元素
        arrayList.remove(2);
        print(arrayList);
        //移除指定的列表上第一次出现的元素
        arrayList.remove("Jane");
        print(arrayList);

    }

}