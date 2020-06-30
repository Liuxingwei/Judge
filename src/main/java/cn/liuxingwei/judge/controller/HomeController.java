package cn.liuxingwei.judge.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Slf4j
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(method = GET)
    public String home() {
        return "index";
    }
}
