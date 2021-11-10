package com.seung.input.service;

import com.seung.input.dao.InputDAO;
import com.seung.input.dto.InputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class InputService {

    @Autowired
    private InputDAO dao;

    private ModelAndView mav = new ModelAndView();

    // inputDB : data1, data2를 받아오기 위한 메소드
    public ModelAndView inputDB(InputDTO data) {
        // 결과를 잘 가져왔는지 확인하기 위해 int타입으로 dao메소드 결과값을 가져오기
        int result = dao.inputDB(data);

        // 결과값이 잘 들어왔는지 체크
        if (result > 0) {
            // 성공 : index.html 로 이동
            mav.setViewName("index");
        } else {
            // 실패 : input.html 로 이동
            mav.setViewName("input");
        }
        return mav;
    }
}
