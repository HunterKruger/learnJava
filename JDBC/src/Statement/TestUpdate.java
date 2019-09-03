package Statement;

import LinkToSQL.DatabaseUtility;
import LinkToSQL.ModelOfStudent;

import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by FY on 17/3/30.
 */
public class TestUpdate {
    private static DatabaseUtility dbu2=new DatabaseUtility();

    private static int updateStudent(ModelOfStudent student) throws Exception{
        Connection con2=dbu2.getConnection();
        String sql="UPDATE db_student.t_student SET stuName='"+student.getStuName()+"',age='"+student.getAge()+"',sex='"+student.getSex()+"',gradeName='"+student.getGradeName()+"'WHERE id="+student.getId();
        Statement st2=con2.createStatement();
        int result2=st2.executeUpdate(sql);
        dbu2.close(st2,con2);
        return result2;
    }


    public static void main(String[] args) throws Exception{
        ModelOfStudent stu=new ModelOfStudent(16,"genji",24,"male","three");
        int result=updateStudent(stu);
        if(result==1){
            System.out.println("Update success!");
        }else {
            System.out.println("Update failed!");
        }
    }
}
