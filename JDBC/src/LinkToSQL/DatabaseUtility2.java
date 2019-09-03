package LinkToSQL;

import java.sql.*;

/**
 * Created by FY on 17/3/30.
 */
public class DatabaseUtility2 {

    private static String dbUrl="jdbc:mysql://localhost:3306/db_bank?useUnicode=true&characterEncoding=utf-8&useSSL=false"; //地址
    private static String dbUserName="root";
    private static String dbPassword="000000";
    private static String jdbcName="com.mysql.jdbc.Driver";//驱动名称

    //获取数据库连接
    public Connection getConnection() throws Exception{
        Class.forName(jdbcName);  //加载驱动
        Connection con = DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
        return con;
    }

    //关闭连接
    public void close(Statement st,Connection con) throws Exception{
        if(st!=null){
            st.close();
            if(con!=null) {
                con.close();
            }
        }
    }
    public void close(PreparedStatement ps, Connection con) throws Exception{
        if(ps!=null){
            ps.close();
            if(con!=null) {
                con.close();
            }
        }
    }

    public void close(CallableStatement cs, Connection con) throws Exception{
        if(cs!=null){
            cs.close();
            if(con!=null) {
                con.close();
            }
        }
    }

}
