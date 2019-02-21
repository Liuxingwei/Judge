package cn.liuxingwei.judge.controller;

import cn.liuxingwei.judge.service.UsersServiceInterface;
import cn.liuxingwei.judge.utils.IpUtil;
import cn.liuxingwei.judge.vo.in.UserIn;
import cn.liuxingwei.judge.vo.out.StandardOut;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    StandardOut standardOut;

    @Autowired
    UsersServiceInterface usersServiceInterface;

    @RequestMapping(method = POST, path = "/register")
    public StandardOut register(HttpServletRequest request, @Valid @RequestBody UserIn userIn) {
        userIn.setIp(IpUtil.getIpAddr(request));
        standardOut = usersServiceInterface.signUp(userIn);
        return standardOut;
    }
}
