package com.jxufe.springboot.mapper;

import com.jxufe.springboot.pojo.PoemsDynasty;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//注解这是一个Mybatis的Mapper类
@Mapper
@Repository
public interface PoemsDynastyMapper {
    List<PoemsDynasty> queryDynastyList();
//    int addDynasty(PoemsDynasty poemsDynasty);
//    int updateDynasty(PoemsDynasty poemsDynasty);
//    int deleteUser(int id);
}
