package org.zerock.security;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.AuthVO;
import org.zerock.domain.MemberVO;
import org.zerock.mapper.MemberMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/security-context.xml"
})
@Log4j
public class MemberTests {
	
	@Autowired
	private PasswordEncoder pwencoder;
	
	@Autowired
	private DataSource ds;
	
	@Autowired
	private MemberMapper mapper;

//	@Test
//	public void test() {
//		
//		String sql = "insert into tbl_member(userid, userpw, username) values(?,?,?)";
//		
//		for(int i = 0; i < 100; i++) {
//			Connection con = null;
//			PreparedStatement pstmt = null;
//			
//			
//			try {
//				con = ds.getConnection();
//				pstmt = con.prepareStatement(sql);
//				
//				pstmt.setString(2, pwencoder.encode("pw" + i));
//				
//				if(i<80) {
//					pstmt.setString(1, "user"+i);
//					pstmt.setString(3, "일반사용자"+i);
//				}else if(i<90){
//					pstmt.setString(1, "manager"+i);
//					pstmt.setString(3, "운영자"+i);
//				}else {
//					pstmt.setString(1, "admin"+i);
//					pstmt.setString(3, "관리자"+i);
//				}
//				
//				pstmt.executeUpdate();
//				
//			} catch (Exception e) {
//				
//			}finally {
//				if(pstmt != null) {
//					try {
//						pstmt.close();
//					} catch (Exception e2) {}
//				}
//				if(con != null) {
//					try {
//						con.close();
//					} catch (Exception e2) {}
//				}
//			}
//		}
//	}
	
	@Test
	public void testInsertAuth() {
		
		String sql = "insert into tbl_member_auth(userid, auth) values(?,?)";
		
		for(int i = 0; i < 100; i++) {
			Connection con = null;
			PreparedStatement pstmt = null;
			
			
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				
				pstmt.setString(2, pwencoder.encode("pw" + i));
				
				if(i<80) {
					pstmt.setString(1, "user"+i);
					pstmt.setString(2, "ROLE_USER");
				}else if(i<90){
					pstmt.setString(1, "manager"+i);
					pstmt.setString(2, "ROLE_MEMBER");
				}else {
					pstmt.setString(1, "admin"+i);
					pstmt.setString(2, "ROLE_ADMIN");
				}
				
				pstmt.executeUpdate();
				
			} catch (Exception e) {
				
			}finally {
				if(pstmt != null) {
					try {
						pstmt.close();
					} catch (Exception e2) {}
				}
				if(con != null) {
					try {
						con.close();
					} catch (Exception e2) {}
				}
			}
		}
	}
	
//	@Test
//	public void testRead() {
//		
//		MemberVO vo = mapper.read("admin90");
//		log.info(vo);
//		vo.getAuthList().forEach(authVO -> log.info(authVO));
//	}

}
