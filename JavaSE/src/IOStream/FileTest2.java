package IOStream;

import java.io.File;

/**
 * Created by FY on 16/12/16.
 */
public class FileTest2 {
    public static void main(String[] args) {
        File file =new File("/Users/FY/Desktop/java/workspace/javaFile2/Test.txt");
        if(file.exists()){ //判断文件是否存在
            if(file.delete()){ //判断文件是否删除成功,内部必须为空才能删除
                System.out.println("Delete Success");
            }else{
                System.out.println("Delete failed");
            }
        }

        file=new File("/Users/FY/Desktop/java/workspace/javaFile2");
        if(file.exists()){ //判断目录是否存在
            if(file.delete()){ //判断目录是否删除成功
                System.out.println("Delete Success again");
            }else{
                System.out.println("Delete failed");
            }
        }
    }
}
