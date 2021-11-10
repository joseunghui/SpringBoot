package com.seung.input.controller;

import com.seung.input.dto.InputDTO;
import com.seung.input.service.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InputController {

    @Autowired
    private InputService isvc;

    private ModelAndView mav = new ModelAndView();

    // 메인페이지 설정 (초기 설정으로 생략 가능 -> index.html이 실행됨)
    @RequestMapping(value="/")
    public String index(){

        return "index"; // = resources-templates-index.html 파일 실행
    }

    // input : 데이터 입력 페이지로 이동
    @RequestMapping(value="/input", method = RequestMethod.GET)
    public String input(){

        return "input"; // = resources-templates-input.html 파일 실행
    }

    // inputDB : inputDB로 데이터베이스에 테이블 값 insert하기
    @RequestMapping(value="/inputDB", method = RequestMethod.GET)
    public ModelAndView inputDB(@ModelAttribute InputDTO
                                            data){
        mav = isvc.inputDB(data);
        return mav;
    }
}
