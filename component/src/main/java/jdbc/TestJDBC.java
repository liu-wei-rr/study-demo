package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author liuw
 * @date 2020/9/7
 */
public class TestJDBC {

    public static void main(String[] args) throws Exception {
        // 用户名
        String username = "root";
        // 密码
        String password = "1qazXSW@";
        // 数据库url
        String url = "jdbc:mysql://101.201.254.58:3306/management?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
        // 加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 获取连接
        Connection con = DriverManager.getConnection(url, username, password);
        // 根据连接获取 statement 用来执行 sql
        Statement statement = con.createStatement();
        // 执行sql，获得结果集
        ResultSet rs = statement.executeQuery("select * from system_user ");
        // 遍历结果集
        while (rs.next()) {
            String username1 = rs.getString(1);
            String password1 = rs.getString(2);
            System.out.println(username1 + ", " + password1);
        }
    }
}
