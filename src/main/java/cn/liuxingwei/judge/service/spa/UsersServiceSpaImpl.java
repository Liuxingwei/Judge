package cn.liuxingwei.judge.service.spa;

import cn.liuxingwei.judge.config.SpaCondition;
import cn.liuxingwei.judge.service.UsersServiceInterface;
import cn.liuxingwei.judge.vo.in.UserIn;
import cn.liuxingwei.judge.vo.out.StandardOut;
import org.springframework.context.annotation.Conditional;
import org.springframework.session.Session;
import org.springframework.stereotype.Service;

@Service
@Conditional(SpaCondition.class)
public class UsersServiceSpaImpl implements UsersServiceInterface {

    @Override
    public StandardOut signUp(UserIn userIn) {
        return null;
    }

    @Override
    public StandardOut signIn(String userId, String password) {
        return null;
    }

    @Override
    public StandardOut signOut(Session session) {
        return null;
    }

    @Override
    public StandardOut getUserInfo(Session session) {
        return null;
    }

    @Override
    public StandardOut modifyUserInfo(UserIn userIn) {
        return null;
    }

    @Override
    public StandardOut modifyPassword(String userId, String oldPassword, String newPassword) {
        return null;
    }

    @Override
    public StandardOut checkUserSignIn(Session session) {
        return null;
    }
}
