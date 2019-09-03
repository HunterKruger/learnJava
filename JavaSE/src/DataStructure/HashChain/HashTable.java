package DataStructure.HashChain;

/**
 * Created by FY on 17/3/11.
 */
public class HashTable {
    private SortedList[] hashArray;
    private int arraySize;
    public HashTable(int arraySize){
        this.arraySize=arraySize;
        hashArray=new SortedList[arraySize];
        for (int i = 0; i < arraySize ; i++)
            hashArray[i]=new SortedList();
    }
    public void displayTable(){
        for (int i = 0; i < arraySize ; i++) {
            System.out.print(i+".");
            hashArray[i].displayList();
        }
    }
    public int hashFunction(int key){
        return key%arraySize;
    }
    public void insert(Link theLink){
        int key=theLink.getKey();
        int hashValue=hashFunction(key);
        hashArray[hashValue].insert(theLink);
    }
    public void delete(int key){
        int hashValue=hashFunction(key);
        hashArray[hashValue].delete(key);
    }
    public Link find(int key){
        int hashValue=hashFunction(key);
        Link theLink=hashArray[hashValue].find(key);
        return theLink;
    }
}
