package PreparedStatement;

import LinkToSQL.DatabaseUtility;
import LinkToSQL.ModelOfStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by FY on 17/4/1.
 */
public class TestUpdate {

    public static void main(String[] args) throws Exception{
        ModelOfStudent student=new ModelOfStudent(17,"DDJJ",42,"male","three");
        int result=updateStudent(student);
        if(result==1){
            System.out.println("Update success!");
        }else {
            System.out.println("Update failed!");
        }
    }

    private static DatabaseUtility dbu=new DatabaseUtility();

    private static int updateStudent(ModelOfStudent student) throws Exception{
        Connection con=dbu.getConnection();
        String sql="update db_student.t_student set stuName=?,age=?,sex=?,gradeName=? where id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,student.getStuName());
        ps.setInt(2,student.getAge());
        ps.setString(3,student.getSex());
        ps.setString(4,student.getGradeName());
        ps.setInt(5,student.getId());
        int result=ps.executeUpdate();
        dbu.close(ps,con);
        return result;
    }
}
