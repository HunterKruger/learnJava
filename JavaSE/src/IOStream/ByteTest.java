package IOStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * Created by FY on 16/12/16.
 */
public class ByteTest {
    //一起读取
    public static void main(String[] args) throws Exception {
        File file=new File("/Users/FY/Desktop/java/workspace/javaFile/Test2.txt");
        Reader reader=new FileReader(file);
        char c[]=new char[1024];
        int length=reader.read(c);
        reader.close();
        System.out.println(new String(c,0,length));
    }
}
