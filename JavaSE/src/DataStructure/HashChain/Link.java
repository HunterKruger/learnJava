package DataStructure.HashChain;

/**
 * Created by FY on 17/3/10.
 */
public class Link {
    private int iData;
    public Link next;
    public Link(int iData){
        this.iData=iData;
    }
    public int getKey(){
        return iData;
    }
    public void displayLink(){
        System.out.print(iData+" ");
    }

}
