package Statement;

import LinkToSQL.DatabaseUtility;
import LinkToSQL.ModelOfStudent;

import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by FY on 17/3/30.
 */
public class TestAdd {

    private static DatabaseUtility dbu2=new DatabaseUtility();

    public static int addStudent(int id,String stuName,int age,String sex,String gradeName) throws Exception{
        Connection con2=dbu2.getConnection();
        String sql="INSERT INTO db_student.t_student VALUES ('"+id+"','"+stuName+"','"+age+"','"+sex+"','"+gradeName+"')";
        Statement st2=con2.createStatement();
        int result2=st2.executeUpdate(sql);
        dbu2.close(st2,con2);
        return result2;
    }

    public static int addStudent2(ModelOfStudent student) throws Exception{
        Connection con2=dbu2.getConnection();
        String sql="INSERT INTO db_student.t_student VALUES ('"+student.getId()+"','"+student.getStuName()+"','"+student.getAge()+"','"+student.getSex()+"','"+student.getGradeName()+"')";
        Statement st2=con2.createStatement();
        int result2=st2.executeUpdate(sql);
        dbu2.close(st2,con2);
        return result2;
    }

    public static void main(String[] args) throws Exception{

//        int result2=addStudent(15,"fy",22,"male","four");
//        if(result2==1){
//            System.out.println("Add success!");
//        }else {
//            System.out.println("Add failed!");
//        }

        ModelOfStudent stu=new ModelOfStudent(16,"fyy",21,"female","two");
        int result2=addStudent2(stu);
        if(result2==1){
            System.out.println("Add success!");
        }else {
            System.out.println("Add failed!");
        }
    }
}
