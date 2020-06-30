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

    private StandardOut<?> standardOut;

    final private UsersServiceInterface usersServiceInterface;

    final private IpUtil ipUtil;

    @Autowired
    public UserController(StandardOut<?> standardOut, UsersServiceInterface usersServiceInterface, IpUtil ipUtil) {
        this.standardOut = standardOut;
        this.usersServiceInterface = usersServiceInterface;
        this.ipUtil = ipUtil;
    }

    /**
     * 用户注册
     * @param request HttpServletRequest
     * @param userIn UserIn
     * @return StandardOut
     */
    @RequestMapping(method = POST, path = "/signup")
    public StandardOut<?> signUp(HttpServletRequest request, @Valid @RequestBody UserIn userIn) {
        userIn.setIp(ipUtil.getIpAddr(request));
        standardOut = usersServiceInterface.signUp(userIn);
        return standardOut;
    }

    /**
     * 用户登录
     * @param userId 用户Id
     * @param password 密码
     * @return StandardOut
     */
    @RequestMapping(method = POST, path = "/signin")
    public StandardOut<?> signIn(@NotEmpty @RequestParam String userId, @NotEmpty @RequestParam String password) {
        standardOut = usersServiceInterface.signIn(userId.trim(), password.trim());
        return standardOut;
    }
}
