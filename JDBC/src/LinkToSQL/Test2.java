package LinkToSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by FY on 17/3/29.
 */
public class Test2 {

    private static String dbUrl="jdbc:mysql://localhost:3306/db_book?useUnicode=true&characterEncoding=utf-8&useSSL=false"; //地址
    private static String dbUserName="root";
    private static String dbPassword="000000";
    private static String jdbcName="com.mysql.jdbc.Driver";//驱动名称

    public static void main(String[] args) {

        try {
            Class.forName(jdbcName);
            System.out.println("Driver load success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Driver load failed!");
        }

        Connection connection=null;
        try {
            //获取数据库连接
            connection=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
            System.out.println("SQL LinkToSQL access got!");
            System.out.println("Operating SQL!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();  //用完要关闭
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
