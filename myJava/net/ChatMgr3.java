package net;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import member.MemberBean;

public class ChatMgr3 {
	
	private DBConnectionMgr pool;
	
	public ChatMgr3() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public static void main(String[] args) {
		
	}

	// 로그인
	public boolean loginCheck(String id, String pwd) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "select id from tblRegister where id = ? and pwd = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			
			rs = pstmt.executeQuery();
			flag = rs.next();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs); // con은 반납, pstmt/rs는 close
		}
		return flag;
	}
	
	// 메시지 insert
	public void insertMsg(MessageBean3 bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			con = pool.getConnection();
			sql = "insert tblMessage values(null, ?, ?, ?, now())";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getFid());
			pstmt.setString(2, bean.getTid());
			pstmt.setString(3, bean.getMsg());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
	}
	
	// 메시지 list : 조건의 id가 보낸 쪽지, 받은 쪽지
	public Vector<MessageBean3> getMsgList(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<MessageBean3> vlist = new Vector<MessageBean3>();
		try {
			con = pool.getConnection();
			sql = "select * from tblMessage where fid = ? or tid = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MessageBean3 bean = new MessageBean3();
				bean.setNo(rs.getInt(1));
				bean.setFid(rs.getString(2));
				bean.setTid(rs.getString(3));
				bean.setMsg(rs.getString(4));
				bean.setMdate(rs.getString(5));
				
				vlist.addElement(bean); // 리턴 안하는 경우 사용
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs); // con은 반납, pstmt/rs는 close
		}
		
		return vlist;
	}
	
	// 메시지 read : 하나의 쪽지
	public MessageBean3 getMsg(int no) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		MessageBean3 bean = new MessageBean3();
		try {
			con = pool.getConnection();
			sql = "select * from tblMessage where no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				bean.setNo(rs.getInt(1));
				bean.setFid(rs.getString(2));
				bean.setTid(rs.getString(3));
				bean.setMsg(rs.getString(4));
				bean.setMdate(rs.getString(5));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs); // con은 반납, pstmt/rs는 close
		}
		return bean;
	}
}
