package kosta.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.catalina.Context;



public class BoardDao {
	private static BoardDao dao = new BoardDao();
	
	public static BoardDao getInstance() {
		return dao;
	}
	
	public Connection getDBCPConnection() {
		DataSource ds = null;
		try {
			javax.naming.Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
			
			return ds.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}
	
	public void listBoard() {
		Connection conn = null;
		
		try {
			conn = getDBCPConnection();
			System.out.println("dbcp : " + conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int insertBoard(Board board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		//url, user, password 
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "kosta236";
		String password = "1234";
		
		String sql = "insert into board values(board_seq.nextval,?,?,?,sysdate,0)";
		int re = -1;
		
		
		try {
			//1단계 : JDBC 드라이버 로딩 => 어떤 DB?
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계 : DB 연결 (Connenction 객체 생성)
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn);
			
			//3단계 : PrepareStatement 객체 생성(SQL 질의)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContents());
			
			//4단계 : SQL문 실행(re => 실행된 row 갯수)
			re = pstmt.executeUpdate(); //insert, update, delete
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e2) {}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e2) {}
			}
		}//end finally
		
		return re;
	}//end insertBoard
}//end class
