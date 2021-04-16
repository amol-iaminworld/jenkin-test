package com.iamin.jenkin.controller;

import com.iamin.commons.dto.usermanagement.UserInfoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping
    public String hareKrishna(){
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setEmail("amol@abcd.com");
        //sample comment
        return "Hare Krishna : "+userInfoDTO.getEmail();
    }
}
