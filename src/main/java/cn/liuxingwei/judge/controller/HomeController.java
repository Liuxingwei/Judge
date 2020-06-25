package cn.liuxingwei.judge.controller;

import cn.liuxingwei.judge.domain.Users;
import cn.liuxingwei.judge.mapper.UsersMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Slf4j
@RequestMapping("/")
public class HomeController {
    @RequestMapping(method = GET)
    public String home() {
        return "index";
    }
}
