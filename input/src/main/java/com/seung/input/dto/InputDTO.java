package com.seung.input.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data               // getter, setter, toString
@AllArgsConstructor // 매개변수 생성자
@NoArgsConstructor  // 기본 생성자

@Alias("data")
public class InputDTO {
    private String data1;
    private int data2;


}

