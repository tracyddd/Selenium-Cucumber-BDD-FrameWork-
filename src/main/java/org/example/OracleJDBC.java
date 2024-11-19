package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
<dependency>
    <groupId>com.oracle.database.jdbc</groupId>
    <artifactId>ojdbc8</artifactId>
    <version>19.8.0.0</version> <!-- 根据需要调整版本 -->
</dependency>
* */

public class OracleJDBC {
    public static void main(String[] args) {
        // 数据库连接参数
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 数据库URL
        String user = "your_username"; // 数据库用户名
        String password = "your_password"; // 数据库密码

        Connection connection = null;

        try {
            // 加载 Oracle JDBC 驱动程序
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 建立数据库连接
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Oracle Database!");

            // 执行简单查询
            String query = "SELECT * FROM employees WHERE ROWNUM <= 5"; // 示例表名和查询
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            // 输出结果
            while (resultSet.next()) {
                System.out.println("Employee ID: " + resultSet.getInt("employee_id") +
                        ", Name: " + resultSet.getString("name"));
            }

            // 关闭结果集和语句
            resultSet.close();
            preparedStatement.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error while connecting to database: " + e.getMessage());
        } finally {
            // 关闭连接
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

