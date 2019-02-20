package cn.liuxingwei.judge.service.spa;

import cn.liuxingwei.judge.config.SpaCondition;
import cn.liuxingwei.judge.service.UsersServiceInterface;
import cn.liuxingwei.judge.vo.in.UserIn;
import cn.liuxingwei.judge.vo.out.UserOut;
import org.springframework.context.annotation.Conditional;
import org.springframework.session.Session;
import org.springframework.stereotype.Service;

@Service
@Conditional(SpaCondition.class)
public class UsersServiceSpaImpl implements UsersServiceInterface {
    @Override
    public Boolean signUp(UserIn userIn) {
        return null;
    }

    @Override
    public Boolean signIn(String userId, String password) {
        return null;
    }

    @Override
    public Boolean signOut(Session session) {
        return null;
    }

    @Override
    public UserOut getUserInfo(Session session) {
        return null;
    }

    @Override
    public Boolean modifyUserInfo(UserIn userIn) {
        return null;
    }

    @Override
    public Boolean modifyPassword(String userId, String oldPassword, String newPassword) {
        return null;
    }

    @Override
    public Boolean checkUserSignIn(Session session) {
        return null;
    }
}
