package PreparedStatement;

import LinkToSQL.DatabaseUtility;
import LinkToSQL.ModelOfStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by FY on 17/4/1.
 */
public class TestDelete {

    public static void main(String[] args) throws Exception{
        int result=deleteStudent(21);
        if(result==1){
            System.out.println("Delete success!");
        }else {
            System.out.println("Delete failed!");
        }
    }

    private static DatabaseUtility dbu=new DatabaseUtility();

    private static int deleteStudent(int id) throws Exception{
        Connection con=dbu.getConnection();
        String sql="DELETE FROM db_student.t_student WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,id);
        int result=ps.executeUpdate();
        dbu.close(ps,con);
        return result;
    }
}