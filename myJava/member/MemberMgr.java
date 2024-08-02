package member;
import java.util.*;
import java.sql.*;

public class MemberMgr {
	private DBConnectionMgr pool;
	
	public MemberMgr() {
		//�̱��� ����
		pool = DBConnectionMgr.getInstance();
	}
	
	//���� : insert, post
	public boolean insertMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "insert tblMember values(null, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			//?����
			pstmt.setString(1, bean.getName()); //'��浿'
			pstmt.setString(2, bean.getPhone()); //'��浿'
			pstmt.setString(3, bean.getAddress()); //'��浿'
			pstmt.setString(4, bean.getTeam()); //'��浿'
			//DML : insert, update, delete
			//select : executeQuery()
			int cnt = pstmt.executeUpdate(); 
			if(cnt==1) flag = true;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	//����Ʈ
	public Vector<MemberBean> listMember(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<MemberBean>vlist = new Vector<MemberBean>();
		try {
			con = pool.getConnection();
			sql = "select * from tblMember";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberBean bean = new MemberBean();
				bean.setNum(rs.getInt(1)); //1�� ù��° �÷�
				bean.setName(rs.getString(2));
				bean.setPhone(rs.getString(3));
				bean.setAddress(rs.getString(4));
				bean.setTeam(rs.getString(5));
				vlist.addElement(bean);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	//���ڵ� �ϳ� : select(db1)
	public MemberBean getMember(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		MemberBean bean = new MemberBean();
		try {
			con = pool.getConnection();
			sql = "select * from tblMember where num = ?";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()){ //2�� �̻��� ���ڵ�� ���� ���� ���� ����
				bean.setNum(rs.getInt(1)); //1�� ù��° �÷�
				bean.setName(rs.getString(2));
				bean.setPhone(rs.getString(3));
				bean.setAddress(rs.getString(4));
				bean.setTeam(rs.getString(5));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return bean;
	}
	
	//���� : update(db2)
	public boolean updateMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "update tblMember set name=?, phone=?, "
					+ "address=?, team=? where num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getName()); //'��浿'
			pstmt.setString(2, bean.getPhone()); 
			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getTeam()); 
			pstmt.setInt(5, bean.getNum());
			if(pstmt.executeUpdate()==1) 
				flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	//���� : delete(db2)
	public boolean deleteMember(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "delete from tblmember"
					+ " where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			if (pstmt.executeUpdate() == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	//���̸� ����Ʈ(�ߺ�����)
	public Vector<String>getTeamList(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<String> vlist = new Vector<String>();
		try {
			con = pool.getConnection();
			sql = "select distinct team from tblMember";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vlist.addElement(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	//�����ȣ �˻�
	public Vector<ZipcodeBean> zipcodeSearch(String area3){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<ZipcodeBean> vlist = new Vector<ZipcodeBean>();
		try {
			//pool���� Connection ������
			con = pool.getConnection();
			sql = "select * from tblzipcode where area3 like ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + area3 + "%");
			rs = pstmt.executeQuery();
			//����� ���� ������ Ŀ���� ù��° ���ڵ� ���� ����
			while(rs.next()) {
				ZipcodeBean bean = new ZipcodeBean();
				//String zipcode = rs.getString("zipcode");
				//String area1 = rs.getString("area1");
				//String area2 = rs.getString("area2");
				//String area33 = rs.getString("area3");
				//System.out.println(zipcode + "\t" + area1 + "\t" + area2 + "\t" + area33);
				bean.setZipcode(rs.getString("zipcode"));
				bean.setArea1(rs.getString("area1"));
				bean.setArea2(rs.getString("area2"));
				bean.setArea3(rs.getString("area3"));
				//bean�� ���Ϳ� ����
				vlist.addElement(bean);
			}
			// System.out.println(vlist.size());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//con �ݳ�, pstmt�� rs close
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	public static void main(String[] args) {
		MemberMgr mgr = new MemberMgr();
		//mgr.zipcodeSearch("�����");
		MemberBean bean = new MemberBean();
		bean.setName("������");
		bean.setPhone("010-5555-2323");
		bean.setAddress("�λ�� ������");
		bean.setTeam("���Ǵ�");
		boolean result = mgr.insertMember(bean);
		System.out.println(result);
	}
}