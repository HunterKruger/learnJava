package LinkToSQL;

import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by FY on 17/3/30.
 */
public class Test {

    public static void main(String[] args) throws Exception{

        DatabaseUtility dbu=new DatabaseUtility();
        String sql="INSERT INTO db_student.t_student VALUES ('14','john','23','male','three')";
        Connection con=dbu.getConnection();  //获取数据连接
        Statement st=con.createStatement();  //获取statement
        int result=st.executeUpdate(sql);
        System.out.println(result+" data executed.");
        st.close();   //关闭statement
        con.close();  //关闭数据连接
    }

}
