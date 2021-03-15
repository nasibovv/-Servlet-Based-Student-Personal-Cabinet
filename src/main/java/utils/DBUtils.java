package utils;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
    static DataSource dataSource;
    static {
        System.out.println("Entered to the block...");
        try {
            Context initContext = new InitialContext();
            Context webContext = (Context) initContext.lookup("java:/comp/env");
            dataSource = (DataSource) webContext.lookup("jdbc/datasource");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
    public static ResultSet query(String sql) {
        try {
            Connection connection = DBUtils.dataSource.getConnection();
            Statement statement = connection.createStatement();
            boolean result = statement.execute(sql);
            return statement.getResultSet();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
