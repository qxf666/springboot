package com.jxufe.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PoemsDynasty {
    int id;
    String name;
    int startAD;
    String startStrAD;
    int endAD;
    String endStrAD;
    String intro;
    String literary;
    String memo;
}
