package chapter13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数据库连接
		Connection connection = null;
		//预编译Statement
		PreparedStatement ps = null;
		//结果集
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/name?characterEncoding=utf-8", "root", "Lt6868688@");
				String sql = "select * from user where username = ?";
				ps = connection.prepareStatement(sql);
	            //设置参数，第一个参数为sql语句中参数的序号（从1开始），第二个参数为设置的参数值
	            ps.setString(1, "王五");
	            //向数据库发出sql执行查询，查询出结果集
	            rs =  ps.executeQuery();
	            //遍历查询结果集
	            while(rs.next()){
	                System.out.println(rs.getString("id")+"  "+rs.getString("username"));
	            }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
