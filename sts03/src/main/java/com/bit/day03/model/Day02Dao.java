package com.bit.day03.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.day03.model.entity.Day02Vo;

public interface Day02Dao {

	public List<Day02Vo> selectAll() throws SQLException;

	public void insertOne(Day02Vo day02Vo);
}