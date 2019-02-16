package cn.liuxingwei.judge.service;

import cn.liuxingwei.judge.vo.in.UserIn;
import cn.liuxingwei.judge.vo.out.UserOut;
import org.springframework.session.Session;

public interface UserServiceInterface {
    Boolean signUp(UserIn userIn);
    Boolean signIn(String userId, String password);
    Boolean signOut(Session session);
    UserOut getUserInfo(Session session);
    Boolean modifyUserInfo(UserIn userIn);
    Boolean modifyPassword(String userId, String oldPassword, String newPassword);
    Boolean checkUserSignIn(Session session);
}
