package MataData;

import LinkToSQL.DatabaseUtility;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

/**
 * Created by FY on 17/5/10.
 */
public class Demo {

    public static void main(String[] args) throws Exception{
        DatabaseUtility dbu = new DatabaseUtility();
        Connection con = dbu.getConnection();
        DatabaseMetaData dmd = con.getMetaData();  //获取元数据
        System.out.println("数据库名称: "+dmd.getDatabaseProductName());
        System.out.println("数据库版本: "+dmd.getDatabaseMajorVersion()+"."+dmd.getDatabaseMinorVersion());
    }
}
