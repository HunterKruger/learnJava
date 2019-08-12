package IOStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * Created by FY on 16/12/16.
 */
public class ByteTest2 {
    //一个一个读取
    public static void main(String[] args) throws Exception {
        File file=new File("/Users/FY/Desktop/java/workspace/javaFile/Test2.txt");
        Reader reader=new FileReader(file);
        char c[]=new char[1024];
        int temp=0;
        int i=0;
        while ( (temp=reader.read())!=-1){
            c[i++]=(char)temp;
        }

        reader.close();
        System.out.println(new String(c,0,i));
    }
}
