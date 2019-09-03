package PreparedStatement;


import LinkToSQL.DatabaseUtility;
import LinkToSQL.ModelOfStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by FY on 17/4/1.
 */
public class TestAdd {

    public static void main(String[] args) throws Exception {
        ModelOfStudent stu=new ModelOfStudent(17,"DJ",23,"male","three");
        int result=addStudent(stu);
        if(result==1){
            System.out.println("Add success!");
        }else {
            System.out.println("Add failed!");
        }
    }

    private static DatabaseUtility dbu=new DatabaseUtility();

    private static int addStudent(ModelOfStudent student) throws Exception{
        Connection con=dbu.getConnection();
        String sql="insert into db_student.t_student values (null,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,student.getStuName());
        ps.setInt(2,student.getAge());
        ps.setString(3,student.getSex());
        ps.setString(4,student.getGradeName());

        int result=ps.executeUpdate();
        dbu.close(ps,con);
        return result;

    }


}
