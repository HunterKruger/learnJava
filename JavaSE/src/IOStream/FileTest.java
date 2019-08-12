package IOStream;

import java.io.File;
import java.io.IOException;

/**
 * Created by FY on 16/12/16.
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File file =new File("/Users/FY/Desktop/java/workspace/javaFile2");

        if(file.mkdir()){  //判断创建路径是否成功
            System.out.println("Success");
            file=new File("/Users/FY/Desktop/java/workspace/javaFile2/Test.txt");
            if(file.createNewFile()){  //判断创建文件是否成功
                System.out.println("Success again");
            }else{
                System.out.println("Failed");
            }
        }else System.out.println("Failed");

    }




}
