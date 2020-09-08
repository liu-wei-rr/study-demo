package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author liuw
 * @date 2020/9/7
 */
public class JdbcMain {

    public static void main(String[] args) throws Exception {
        String username = "root";
        String password = "1qazXSW@";
        String url = "jdbc:mysql://101.201.254.58:3306/management?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("select * from system_user ");
        while(rs.next()) {
            String username1 = rs.getString(1);
            String password1 = rs.getString(2);
            System.out.println(username1 + ", " + password1);
        }
    }
}
