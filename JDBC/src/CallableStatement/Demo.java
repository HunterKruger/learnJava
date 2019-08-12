package CallableStatement;

import LinkToSQL.DatabaseUtility;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

/**
 * Created by FY on 17/5/9.
 */
public class Demo {

    private static DatabaseUtility dbu = new DatabaseUtility();

    public static String getBookNameById (int id) throws Exception{
        Connection con = dbu.getConnection();
        String sql="{call pro_getBookNameById(?,?)}";
        CallableStatement cs = con.prepareCall(sql);
        cs.setInt(1,id);
        cs.registerOutParameter(2, Types.VARCHAR);
        cs.execute();
        String bookName = cs.getString("bN");
        dbu.close(cs,con);
        return bookName;
    }

    public static void main(String[] args) throws Exception{
        System.out.println(getBookNameById(12));
    }
}
