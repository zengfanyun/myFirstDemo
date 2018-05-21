package com.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("image")
public class PayoneerController {
    @RequestMapping("getJsp")
   public String getIo(){
       return "return";
   }
}
