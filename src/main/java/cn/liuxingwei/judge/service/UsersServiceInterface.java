package cn.liuxingwei.judge.service;

import cn.liuxingwei.judge.vo.in.UserIn;
import cn.liuxingwei.judge.vo.out.StandardOut;
import org.springframework.session.Session;

public interface UsersServiceInterface {
    StandardOut signUp(UserIn userIn);
    StandardOut signIn(String userId, String password);
    StandardOut signOut(Session session);
    StandardOut getUserInfo(Session session);
    StandardOut modifyUserInfo(UserIn userIn);
    StandardOut modifyPassword(String userId, String oldPassword, String newPassword);
    StandardOut checkUserSignIn(Session session);
}
