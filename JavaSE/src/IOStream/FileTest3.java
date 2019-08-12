package IOStream;

import java.io.File;

/**
 * Created by FY on 16/12/16.
 */
//遍历文件
public class FileTest3 {
    public static void main(String[] args) {
        File file=new File("/Users/FY/Installs");
        File files[]=file.listFiles();
        for(int i=0;i<files.length;i++){
            System.out.println(files[i]);
        }
    }

}
