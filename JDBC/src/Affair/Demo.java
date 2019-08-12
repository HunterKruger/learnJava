package Affair;

import LinkToSQL.DatabaseUtility2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

/**
 * Created by FY on 17/5/10.
 */
public class Demo {

    private static DatabaseUtility2 dbu = new DatabaseUtility2();

    public static void outCount(Connection con,String accountName,int account) throws Exception {
        String sql = "update t_account set accountBalance = accountBalance - ? where accountName = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,account);
        ps.setString(2,accountName);
        ps.executeUpdate();
    }

    public static void inCount(Connection con,String accountName,int account) throws Exception {
        String sql = "update t_account set accountBalance = accountBalance + ? where accountName = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,account);
        ps.setString(2,accountName);
        ps.executeUpdate();
    }

    public static void main(String[] args) throws Exception {
        Connection con = null;
        Savepoint sp = null;
        try {
            con = dbu.getConnection();
            con.setAutoCommit(false);  //禁止自动提交
            System.out.println("Jack开始给Tom钱");
            int account = 500;
            outCount(con,"jack",account);
            sp = con.setSavepoint();  //设置保存点
            inCount(con,"tom",account);
            System.out.println("Success!");
        } catch (Exception e) {
            try {
                con.rollback(sp);     //遇到异常,回滚到sp
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                con.commit();  //提交事务
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
