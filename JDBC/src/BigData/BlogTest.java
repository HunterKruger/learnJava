package BigData;

import LinkToSQL.DatabaseUtility;
import LinkToSQL.ModelOfStudent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;

/**
 * Created by FY on 17/4/19.
 */
public class BlogTest {

    public static void main(String[] args) throws Exception {

        File context = new File("/Users/FY/Desktop/java/workspace/JDBC/helloWorld.txt");
        File picture = new File("/Users/FY/Desktop/java/workspace/JDBC/kiana.png");
        ModelOfStudent stu = new ModelOfStudent("Steven",42,"male","four",context,picture);
        int result = addStudent(stu);
        if (result==1)
            System.out.println("Add success!");
        else
            System.out.println("Add failure!");

        getStudent(20);

    }

    private static DatabaseUtility dbu=new DatabaseUtility();

    private static int addStudent(ModelOfStudent student) throws Exception{

        Connection con=dbu.getConnection();
        String sql="insert into db_student.t_student values (null,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,student.getStuName());
        ps.setInt(2,student.getAge());
        ps.setString(3,student.getSex());
        ps.setString(4,student.getGradeName());

        File context = student.getContext();  //获取文件
        InputStream is = new FileInputStream(context);
        ps.setAsciiStream(5,is,context.length());

        File picture = student.getPicture();
        InputStream is2 = new FileInputStream(picture);
        ps.setBinaryStream(6,is2,picture.length());

        int result=ps.executeUpdate();
        dbu.close(ps,con);
        return result;

    }

    public static void getStudent(int id) throws Exception{

        Connection con = dbu.getConnection();
        String sql = "SELECT * FROM db_student.t_student where id=? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            String stuName = rs.getString("stuName");
            int age = rs.getInt("age");
            String sex = rs.getString("sex");
            String gradeName = rs.getString("gradeName");
            Clob clob = rs.getClob("context");  //字符大对象

            Blob blob = rs.getBlob("picture");  //二进制对象
            FileOutputStream fos = new FileOutputStream(new File("/Users/FY/Desktop/java/workspace/JDBC/src/BigData/kiana2.png")); //输出
            fos.write(blob.getBytes(1,(int)blob.length()));
            fos.close();

            String context = clob.getSubString(1,(int)clob.length());
            System.out.println("Student name: "+stuName);
            System.out.println("Gentle: "+sex);
            System.out.println("Grade: "+gradeName);
            System.out.println("Context: "+context);

        }

        dbu.close(ps,con);

    }
}
