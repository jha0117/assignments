package com.samsung.hw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.samsung.hw.utils.JDBCUtils;
import com.samsung.hw.vo.hUserVO;

public class hUserDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	public void addhUser(hUserVO vo){
		try {
			conn = JDBCUtils.getConnection();
			String sql ="insert into husers(seq, name, password, email, age, gender) "+
					"values( (select nvl(max(seq), 0)+1 from husers), ?, ?, ?, ?, ?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, vo.getName());
			stmt.setString(2, vo.getPassword());
			stmt.setString(3, vo.getEmail());
			stmt.setInt(4, vo.getAge());
			stmt.setInt(5, vo.getGender());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBCUtils.close(conn, stmt);
		}
	}
	
	public ArrayList<hUserVO> gethUserList(){
		ArrayList<hUserVO> hUserList = new ArrayList<hUserVO>();
		try {
			conn = JDBCUtils.getConnection();
			String sql ="select * from husers order by seq desc";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			hUserVO hUser = null;
			while(rs.next()){
				hUser = new hUserVO();
				hUser.setSeq(rs.getInt("seq"));
				hUser.setName(rs.getString("name"));
				hUser.setPassword(rs.getString("password"));
				hUser.setEmail( rs.getString("email"));
				hUser.setAge(rs.getInt("age"));
				hUser.setGender(rs.getInt("gender"));
				hUserList.add(hUser);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBCUtils.close(conn, stmt, rs);
		}
		return hUserList;
	}
}
