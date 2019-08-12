package IOStream;

import java.io.*;

/**
 * Created by FY on 16/12/16.
 */
public class PerformanceTest {
    public static void stream() throws Exception {
        InputStream ip=new FileInputStream("/Users/FY/Desktop/java/workspace/javaFile/Test3.txt");
        OutputStream op=new FileOutputStream("/Users/FY/Desktop/java/workspace/javaFile/Test3receive.txt");
        int b=0;
        long startTime=System.currentTimeMillis();
        while((b=ip.read())!=-1){
            op.write(b);
        }
        ip.close();
        op.close();
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }

    public static void bufferStream() throws Exception { //在内存中开辟了缓冲区,大幅提升效率
        BufferedInputStream bip=new BufferedInputStream(new FileInputStream("/Users/FY/Desktop/java/workspace/javaFile/Test4.txt"));
        BufferedOutputStream bop=new BufferedOutputStream(new FileOutputStream("/Users/FY/Desktop/java/workspace/javaFile/Test4receive.txt"));
        int b=0;
        long startTime=System.currentTimeMillis();
        while((b=bip.read())!=-1){
            bop.write(b);
        }
        bip.close();
        bop.close();
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }

    public static void main(String[] args) throws Exception {
        stream();
        bufferStream();
    }
}
