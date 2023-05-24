package com.rookie.mobility.api.using.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
* @package : com.ktds.rookie.library.domain.controller
* @name : BasicController.java
* @date : 2023-04-05 오후 13:45
* @author : Jung Jae gook
* @version : 1.0.0
* @modifyed :
* @description : 샘플 컨트롤러
**/ 

@RequiredArgsConstructor
@RestController
@RequestMapping("/api") 
@Slf4j
public class UsingController {

	
    @PostMapping("/using")
    public String memberJoin(@RequestBody String name,
    						@RequestBody String id,
    						@RequestBody String pw,
    						@RequestBody String phone,
    						@RequestBody String gender,
    						@RequestBody String nick){

    	String rst = name + " " + id + " " + pw + " " + phone + " " + gender + " " + nick;
        return rst;
    }
    
    @GetMapping("/using1")
    public String m(@RequestParam String name){

        return name;
    }
}
