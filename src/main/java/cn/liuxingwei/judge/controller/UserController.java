package cn.liuxingwei.judge.controller;

import cn.liuxingwei.judge.service.UsersServiceInterface;
import cn.liuxingwei.judge.utils.IpUtil;
import cn.liuxingwei.judge.vo.in.UserIn;
import cn.liuxingwei.judge.vo.out.StandardOut;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    StandardOut standardOut;

    @Autowired
    UsersServiceInterface usersServiceInterface;

    /**
     * 用户注册跌幅映射，控制器
     * @param request
     * @param userIn
     * @return
     */
    @RequestMapping(method = POST, path = "/singup")
    public StandardOut signUp(HttpServletRequest request, @Valid @RequestBody UserIn userIn) {
        userIn.setIp(IpUtil.getIpAddr(request));
        standardOut = usersServiceInterface.signUp(userIn);
        return standardOut;
    }

    @RequestMapping(method = POST, path = "/signin")
    public StandardOut signIn(@NotEmpty @RequestParam String userId, @NotEmpty @RequestParam String password) {
        standardOut = usersServiceInterface.signIn(userId.trim(), password.trim());
        return standardOut;
    }
}
