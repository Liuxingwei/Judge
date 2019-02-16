package cn.liuxingwei.judge.controller;

import cn.liuxingwei.judge.domain.User;
import cn.liuxingwei.judge.mapper.UserMapper;
import cn.liuxingwei.judge.service.UserServiceInterface;
import cn.liuxingwei.judge.vo.in.UserIn;
import cn.liuxingwei.judge.vo.out.UserOut;
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

@RestController
@RequestMapping("/")
public class HomeController {
    Log log = LogFactory.getLog(HomeController.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserOut userOut;


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private UserServiceInterface userServiceInterface;

    @RequestMapping(method = GET)
    public String[] home() {
        String[] str = {"hello", "byebye"};
        log.info(userServiceInterface.getClass());
        return str;
    }

    @RequestMapping(method = GET, path = "/user")
    public User user(HttpServletRequest request, @RequestParam("user_id") String userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        HttpSession session = request.getSession();
        log.info(session.getClass());
        session.setAttribute("userid", userId);
        return user;
    }

    @RequestMapping(method = POST, path = "/register")
    public UserOut register(@RequestBody UserIn userIn) {
        this.userOut.setCode("0");
        this.userOut.setMessage("success");
        this.userOut.setData(userIn);
        return this.userOut;
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
