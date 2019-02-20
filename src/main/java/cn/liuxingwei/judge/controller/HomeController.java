package cn.liuxingwei.judge.controller;

import cn.liuxingwei.judge.domain.Users;
import cn.liuxingwei.judge.mapper.UsersMapper;
import cn.liuxingwei.judge.service.UsersServiceInterface;
import cn.liuxingwei.judge.utils.IpUtil;
import cn.liuxingwei.judge.vo.in.UserIn;
import cn.liuxingwei.judge.vo.out.StandardOut;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Slf4j
@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private StandardOut standardOut;


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private UsersServiceInterface usersServiceInterface;

    @RequestMapping(method = GET)
    public String[] home() {
        String[] str = {"hello", "byebye"};
        log.info(usersServiceInterface.getClass().toString());
        return str;
    }

    @RequestMapping(method = GET, path = "/user")
    public Users user(HttpServletRequest request, @RequestParam("user_id") String userId) {
        Users user = usersMapper.selectByPrimaryKey(userId);
        HttpSession session = request.getSession();
        log.info(session.getClass().toString());
        session.setAttribute("userid", userId);
        return user;
    }

    @RequestMapping(method = POST, path = "/register")
    public StandardOut register(HttpServletRequest request, @RequestBody UserIn userIn) {
        userIn.setIp(IpUtil.getIpAddr(request));
        standardOut = usersServiceInterface.signUp(userIn);
        return standardOut;
    }

    @RequestMapping(method = GET, path = "/redis")
    public String redis() {
        if (stringRedisTemplate.hasKey("shabao")) {
            stringRedisTemplate.delete("shabao");
            return "key already exists";
        } else {
            stringRedisTemplate.opsForValue().set("shabao", "中文");
            return "key save success";
        }
    }
}
