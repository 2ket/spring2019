package com.bit.day06.model;

import java.util.List;

import com.bit.day06.model.entity.BbsVo;

public interface BbsDao {

   List<BbsVo> selectAll();
   BbsVo selectOne(int num);
   void insertOne(BbsVo bean);
   int updateCnt(int num); //맨앞 int 해도되고 안해도되고
   int updateOne(BbsVo bean);
   int deleteOne(int num);
}