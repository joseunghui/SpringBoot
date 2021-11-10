package com.seung.input.dao;

import com.seung.input.dto.InputDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InputDAO {

    // int타입의 result를 결과값으로 가져오기(보내기)
    int inputDB(InputDTO data);
}
