package IOStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by FY on 16/12/16.
 */
public class OutputStreamTest {
    //覆盖方式
    public static void main(String[] args) throws Exception {
        File file=new File("/Users/FY/Desktop/java/workspace/javaFile/Test2.txt");
        OutputStream op=new FileOutputStream(file,true);//true可以将字节写入文件末尾处
        String str="再搞个大新闻";
        byte b[]=str.getBytes(); //转型成byte
        op.write(b);
        op.close();

    }


}
