package com.jxufe.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PoemsPoet {
    int id;
    String uid;
    String name;
    String name_pinyin;
    String name_zi;
    String name_zi__pinyin;
    String name_hao;
    String name_hao__pinyin;
    String yiming;
    String photo;
    int gender;
    String nativeplace;
    String bitrhplace;
    String birthday;
    String deathday;
    int dynastyid;
    String intro;
    String intro_pinyin;
    String intro_english;
    String masterwork;
    String masterwork_english;
    String duty;
    String memo;
    int llruserid;
    Date lrsj;
    int shruserid;
    Date shsj;
    String shxdsm;
}
