package IOStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by FY on 16/12/16.
 */
public class ByteTest3 {
    public static void main(String[] args) throws Exception {
        File file=new File("/Users/FY/Desktop/java/workspace/javaFile/Test2.txt");
        Writer writer=new FileWriter(file,true);
        String str="听见风就是雨";
        writer.write(str);
        writer.close();

    }
}
