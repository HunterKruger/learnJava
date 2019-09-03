package Statement;

import LinkToSQL.DatabaseUtility;

import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by FY on 17/3/31.
 */
public class TestDelete {
    private static DatabaseUtility dbu3=new DatabaseUtility();
    private static int deleteStudent(int id) throws Exception{
        Connection con3=dbu3.getConnection();
        String sql="DELETE FROM db_student.t_student WHERE id="+id;
        Statement st3=con3.createStatement();
        int result2=st3.executeUpdate(sql);
        dbu3.close(st3,con3);
        return result2;
    }
    public static void main(String[] args) throws Exception{
        int result=deleteStudent(1);
        if(result==1){
            System.out.println("Delete success!");
        }else {
            System.out.println("Delete failed!");
        }
    }
}
