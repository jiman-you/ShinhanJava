package aproject.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.shinhan.dbutil.OracleUtil;

import aproject.vo.DeptVO;

public class DeptDAO {
	Connection conn;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	int resultCout;
	
	public List<DeptVO> selectALL(){
		String sql = "select * from departments";
		List<DeptVO> deptlist = new ArrayList<>();
		conn = OracleUtil.getConnection();
		try {
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				DeptVO dept = makeDept(rs);
				deptlist.add(dept);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptlist;
	}

	public DeptVO selectById(int deptid){
		String sql = "select * from departments_id = "+deptid;
		DeptVO dept = null;
		conn = OracleUtil.getConnection();
		try {
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				 dept = makeDept(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dept;
	}
	
	public List<DeptVO> selectByTitle(String title){
		String sql = "select * from departments where department_title"+title;
		List<DeptVO> deptlist = new ArrayList<>();
		conn = OracleUtil.getConnection();
		try {
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				DeptVO dept = makeDept(rs);
				deptlist.add(dept);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptlist;
	}
	
	
	private DeptVO makeDept(ResultSet rs) throws SQLException {
		DeptVO dept = new DeptVO();
		dept.setDEPARTMENT_ID(rs.getInt("DEPARTMENT_ID"));
		dept.setDEPARTMENT_NAME(rs.getString("DEPARTMENT_NAME"));
		dept.setLOCATION_ID(rs.getInt("LOCATION_ID"));
		dept.setMANAGER_ID(rs.getInt("MANAGER_ID"));
		return null;
	}
}
