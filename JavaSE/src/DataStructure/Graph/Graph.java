package DataStructure.Graph;

/**
 * Created by FY on 17/3/15.
 */
public class Graph {

    private final int MAX_VERTEXS=20;
    private Vertex[] vertexList;
    private int adjoinMatrix[][];
    private int vertexCount;
    private StackX theStack;
    private QueueX theQueue;

    public Graph(){
        vertexList=new Vertex[MAX_VERTEXS];
        adjoinMatrix=new int[MAX_VERTEXS][MAX_VERTEXS];
        vertexCount=0;
        for (int i = 0; i < MAX_VERTEXS; i++) {
            for (int j = 0; j < MAX_VERTEXS; j++) {
                adjoinMatrix[i][j]=0;
            }
        }
        theStack=new StackX();
        theQueue=new QueueX();
    }

    public void addVertex(char label){
        vertexList[vertexCount++]=new Vertex(label);
    }

    public void addEdge(int start,int end){
        adjoinMatrix[start][end]=1;
        adjoinMatrix[end][start]=1;
    }

    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }

    public int getAdjoinUnvisitedVertex(int v){
        for (int i = 0; i < vertexCount; i++) {
            if((adjoinMatrix[v][i]==1)&&(vertexList[i].isVisited==false))
                return i;
        }
        return -1;
    }

    public void depthFirstSearch(){
        vertexList[0].isVisited=true;
        displayVertex(0);
        theStack.push(0);
        while (!theStack.isEmpty()){
            int v=getAdjoinUnvisitedVertex(theStack.peek());
            if(v==-1)
                theStack.pop();
            else{
                vertexList[v].isVisited=true;
                displayVertex(v);
                theStack.push(v);
            }
        }
        for (int i = 0; i < vertexCount; i++) {
            vertexList[i].isVisited=false;
        }
    }

    public void breadthFirstSearch(){
        vertexList[0].isVisited=true;
        displayVertex(0);
        theQueue.insert(0);
        int v2;
        while (!theQueue.isEmpty()){
            int v1=theQueue.remove();
            while ((v2=getAdjoinUnvisitedVertex(v1))!=-1){
                vertexList[v2].isVisited=true;
                displayVertex(v2);
                theQueue.insert(v2);
            }
        }
        for (int i = 0; i < vertexCount; i++) {
            vertexList[i].isVisited=false;
        }
    }
}
