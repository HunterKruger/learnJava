package DataStructure.Hash;

/**
 * Created by FY on 17/2/27.
 */
public class HashTable {

    private DataItem[] hashArray;
    private int arraySize;
    private DataItem deletedItem;

    public HashTable(int size){
        arraySize=size;
        hashArray=new DataItem[arraySize];
        deletedItem=new DataItem(-1);
    }

    public void displayTable(){
        System.out.print("Table: ");
        for (int i = 0; i < arraySize; i++) {
            if (hashArray[i]!= null)
                System.out.print(hashArray[i].getKey() + " ");
            else
                System.out.print("** ");
        }
        System.out.println();
    }

    public int hashFunction(int key){
        return key%arraySize;
    }

    public void insert(DataItem item){
        int key=item.getKey();
        int hashValue=hashFunction(key);
        while (hashArray[hashValue]!=null&&hashArray[hashValue].getKey()!=-1){
            ++hashValue;
            hashValue%=arraySize;
        }
        hashArray[hashValue]=item;
    }

    public DataItem delete(int key){
        int hashValue=hashFunction(key);
        while (hashArray[hashValue]!=null){
            if(hashArray[hashValue].getKey()==key){
                DataItem temp=hashArray[hashValue];
                hashArray[hashValue]=deletedItem;
                return temp;
            }
            ++hashValue;
            hashValue%=arraySize;
        }
        return null;
    }

    public DataItem find(int key){
        int hashValue=hashFunction(key);
        while (hashArray[hashValue]!=null){
            if(hashArray[hashValue].getKey()==key)
                return hashArray[hashValue];
            ++hashValue;
            hashValue%=arraySize;
        }
        return null;
    }
}
