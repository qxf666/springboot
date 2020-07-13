package com.jxufe.springboot.controller;

import com.jxufe.springboot.mapper.PoemsPoetMapper;
import com.jxufe.springboot.pojo.PoemsPoet;
import com.jxufe.springboot.util.ResultEntity;
import org.apache.ibatis.javassist.bytecode.stackmap.BasicBlock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;
@RequestMapping("/poemsPoet")
@RestController
public class PoemsPoemController {
    @Autowired
    PoemsPoetMapper poemsPoetMapper;
    @GetMapping("/addPoemsPoet")
    public ResultEntity addPoemsPoet(@RequestBody PoemsPoet poemsPoet){
        System.out.println(poemsPoet.getName());
        UUID uuid  =  UUID.randomUUID();
        String s = UUID.randomUUID().toString();
        poemsPoet.setUid(s);
        try{
            System.out.println(poemsPoet);
            poemsPoetMapper.addPoemsPoet(poemsPoet);
            return new ResultEntity(200,"添加诗人信息成功");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultEntity(500,"添加诗人信息失败");
        }
    }
    @GetMapping("/selectAllPoemPoet")
    public ResultEntity<List> queryPoemPoetList(){
        try{
            List<PoemsPoet> poemsPoets=poemsPoetMapper.queryAllPoemsPoet();
            return new ResultEntity(200,"查询诗人信息成功",poemsPoets);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultEntity(500,"查询诗人信息失败");
        }
    }
    @GetMapping("/queryPoemsPoemById")
    public ResultEntity<List> queryPoemsPoemById(@RequestParam int id){
        try{
            PoemsPoet poemsPoets=poemsPoetMapper.queryPoemsPoemById(id);
            return new ResultEntity(200,"查询诗人信息成功",poemsPoets);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultEntity(500,"查询诗人信息失败");
        }
    }
    @GetMapping("/updatePoemsPoet")
    public ResultEntity<List> updatePoemsPoet(@RequestBody PoemsPoet poemsPoet){
        try{
            poemsPoetMapper.updatePoemsPoet(poemsPoet);
            return new ResultEntity(200,"更新诗人信息成功");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultEntity(500,"更新诗人信息失败");
        }
    }
    @GetMapping("/deletePoemsPoet")
    public ResultEntity<List> deletePoemsPoet(@RequestParam int id){
        try{
            poemsPoetMapper.deletePoemsPoet(id);
            return new ResultEntity(200,"删除诗人信息成功");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultEntity(500,"删除诗人信息失败");
        }
    }
    /**
     * 实现文件上传
     * */
    @PostMapping("/upload")
    public ResultEntity fileUpload(@RequestParam("file") MultipartFile file , HttpServletRequest request ) {
        if (file.isEmpty()) {
            return new ResultEntity(400, "文件为空");
        }
        String fileName = file.getOriginalFilename();
        String path = request.getSession().getServletContext().getRealPath("upload");
        File dest = new File(path + "/" + fileName);
        System.out.println(path);
        if (!dest.getParentFile().exists()) { //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            path = path + fileName;
            return new ResultEntity(200, "上传文件成功", path);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultEntity(403, "上传文件失败");
        }
    }
}
