package MataData;

import LinkToSQL.DatabaseUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;

/**
 * Created by FY on 17/5/10.
 */
public class Demo2 {

    public static void main(String[] args) throws Exception {
        DatabaseUtility dbu = new DatabaseUtility();
        Connection con = dbu.getConnection();
        String sql = "select * from t_book";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSetMetaData rsmd = ps.getMetaData();
        int count = rsmd.getColumnCount();
        System.out.println("数据库共"+count+"列");
        for (int i = 1; i <= count ; i++) {
            System.out.println(rsmd.getColumnName(i)+","+rsmd.getColumnTypeName(i));
        }

    }
}
