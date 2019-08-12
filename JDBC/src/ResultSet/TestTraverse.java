package ResultSet;

import LinkToSQL.DatabaseUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by FY on 17/4/2.
 */
public class TestTraverse {

    public static void main(String[] args) throws Exception{
        //listStudent();
        listStudent2();
    }

    private static DatabaseUtility dbu=new DatabaseUtility();

    public static void listStudent() throws Exception{
        Connection con = dbu.getConnection();
        String sql = "SELECT * FROM db_student.t_student ";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            int id=rs.getInt(1);
            String stuName = rs.getString(2);
            int age = rs.getInt(3);
            String sex = rs.getString(4);
            String gradeName = rs.getString(5);
            System.out.println("id="+id+" name="+stuName+" age="+age+" sex="+sex+" grade="+gradeName);
            System.out.println("-----------------------------------------------------------");
        }
    }

    public static void listStudent2() throws Exception{
        Connection con = dbu.getConnection();
        String sql = "SELECT * FROM db_student.t_student ";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            int id=rs.getInt("id");
            String stuName = rs.getString("stuName");
            int age = rs.getInt("age");
            String sex = rs.getString("sex");
            String gradeName = rs.getString("gradeName");
            System.out.println("id="+id+" name="+stuName+" age="+age+" sex="+sex+" grade="+gradeName);
            System.out.println("-----------------------------------------------------------");
        }
    }

}
