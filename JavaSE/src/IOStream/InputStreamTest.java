package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by FY on 16/12/16.
 */
public class InputStreamTest {
    public static void main(String[] args) throws Exception {
        //一起读取
        File file=new File("/Users/FY/Desktop/java/workspace/javaFile/Test2.txt");
        InputStream ip=new FileInputStream(file);
        byte b[]=new byte[1024];
        int length=ip.read(b);
        ip.close();
        System.out.println("读取:"+new String(b,0,length));

        //一个字节一个字节读取
        File file2=new File("/Users/FY/Desktop/java/workspace/javaFile/Test2.txt");
        InputStream ip2=new FileInputStream(file2);
        int length2=(int)file2.length();
        byte b2[]=new byte[length2];
        int temp=0;
        int i=0;
        while((temp=ip2.read())!=-1){ //判断是否读取完毕
            b2[i++]=(byte)temp;
        }
        ip2.close();
        System.out.println("读取:"+new String(b2));


    }
}
