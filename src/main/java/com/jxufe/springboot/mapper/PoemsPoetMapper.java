package com.jxufe.springboot.mapper;

import com.jxufe.springboot.pojo.PoemsPoet;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//注解这是一个Mybatis的Mapper类
@Mapper
@Repository
public interface PoemsPoetMapper {
    int addPoemsPoet(PoemsPoet poemsPoet);
    List<PoemsPoet> queryAllPoemsPoet();
    PoemsPoet queryPoemsPoemById(int id);
    int updatePoemsPoet(PoemsPoet poemsPoet);
    int deletePoemsPoet(int id);
}
