package BigData;

import LinkToSQL.DatabaseUtility;
import LinkToSQL.ModelOfStudent;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by FY on 17/4/19.
 */
public class ClogTest {

    public static void main(String[] args) throws Exception {
        File context = new File("/Users/FY/Desktop/java/workspace/JDBC/helloWorld.txt");
        ModelOfStudent stu = new ModelOfStudent("Aaron",21,"male","three",context);
        int result = addStudent(stu);
        if (result==1)
            System.out.println("Add success!");
        else
            System.out.println("Add failure!");

        getStudent(17);
    }

    private static DatabaseUtility dbu=new DatabaseUtility();

    private static int addStudent(ModelOfStudent student) throws Exception{

        Connection con=dbu.getConnection();
        String sql="insert into db_student.t_student values (null,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,student.getStuName());
        ps.setInt(2,student.getAge());
        ps.setString(3,student.getSex());
        ps.setString(4,student.getGradeName());

        File context = student.getContext();  //获取文件
        InputStream is = new FileInputStream(context);
        ps.setAsciiStream(5,is,context.length());

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
            Clob clob= rs.getClob("context");  //字符大对象
            String context = clob.getSubString(1,(int)clob.length());
            System.out.println("Student name: "+stuName);
            System.out.println("Gentle: "+sex);
            System.out.println("Grade: "+gradeName);
            System.out.println("Context: "+context);


        }
        dbu.close(ps,con);

    }
}
