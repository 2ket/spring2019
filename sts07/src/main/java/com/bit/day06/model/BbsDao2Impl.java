package com.bit.day06.model;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.bit.day06.model.entity.BbsVo;
import com.ibatis.sqlmap.client.SqlMapClient;

@Repository
public class BbsDao2Impl implements BbsDao {
	@Inject
	SqlMapClient sqlMapClient; //여기에 있는 SqlMapClient는 applicationContext.xml에 bean에 추가해줘야 사용가능하다
	
	
	@Override
	public List<BbsVo> selectAll() {
		// TODO Auto-generated method stub
		try {
			return sqlMapClient.queryForList("selectAll");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public BbsVo selectOne(int num) {
		try {
			return (BbsVo)sqlMapClient.queryForObject("selectOne", num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insertOne(BbsVo bean) {
		try {
			sqlMapClient.insert("insertOne", bean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int updateCnt(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateOne(BbsVo bean) {
		try {
			return sqlMapClient.update("updateOne", bean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteOne(int num) {
		System.out.println(num);
		try {
			return sqlMapClient.update("deleteOne", num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
