package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/userDetail")
    public String getUserDetail(Model model) {
        // Hardcode dữ liệu người dùng
        model.addAttribute("name", "Nguyễn Trung Nhân");
        model.addAttribute("email", "nguyennhan20047@gmail.com");
        model.addAttribute("phone", "0123456789");
        model.addAttribute("address", "Đà Nẵng, Việt Nam");
        return "userDetail"; // Trả về trang userDetail.html
    }
}

