package com.jxufe.springboot.controller;

import com.jxufe.springboot.mapper.PoemsDynastyMapper;
import com.jxufe.springboot.pojo.PoemsDynasty;
import com.jxufe.springboot.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping("/poemsDynasty")
@RestController
public class PoemsDynastyController {
    @Autowired
    PoemsDynastyMapper poemsDynastyMapper;
    @GetMapping("/selectAllDynasty")
    public ResultEntity<List> queryDynastyList(){
        List<PoemsDynasty> dynastyList=poemsDynastyMapper.queryDynastyList();
        return new ResultEntity<List>(200,"获取朝代信息成功",dynastyList);
    }
}
