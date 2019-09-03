package IOStream;

import java.io.File;

/**
 * Created by FY on 16/12/16.
 */
public class FileTest4 {
    public static void show(File file){
        if(file!=null){    //如果file存在
            if(file.isDirectory()){    //如果file是目录
                File files[]=file.listFiles();
                for (int i = 0; i <files.length ; i++) {
                    System.out.println(files[i]);
                }
            }else{
                System.out.println(file);
            }
        }
    }
    public static void main(String[] args) {
        File file=new File("/Users/FY/Installs/Eclipse Installer.app");
        show(file);

        System.out.println();

        File file2=new File("/Users/FY/Installs");
        show(file2);
    }
}
