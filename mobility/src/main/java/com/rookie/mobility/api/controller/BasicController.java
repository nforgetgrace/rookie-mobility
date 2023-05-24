package com.rookie.mobility.api.controller;

import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.GetMapping;
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
public class BasicController {

	
    @GetMapping("/get")
    @Description("테스트 get 함수")
    public String get(@RequestParam String name){

        return name;
    }
}
