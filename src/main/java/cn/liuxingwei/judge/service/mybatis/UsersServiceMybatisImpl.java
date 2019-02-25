package cn.liuxingwei.judge.service.mybatis;

import cn.liuxingwei.judge.constant.ErrorCode;
import cn.liuxingwei.judge.domain.Users;
import cn.liuxingwei.judge.mapper.UsersMapper;
import cn.liuxingwei.judge.service.UsersServiceInterface;
import cn.liuxingwei.judge.utils.EncryptInterface;
import cn.liuxingwei.judge.vo.in.UserIn;
import cn.liuxingwei.judge.vo.out.StandardOut;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.session.Session;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
@Slf4j
@Service
@Conditional(MybatisCondition.class)
public class UsersServiceMybatisImpl implements UsersServiceInterface {

    @Autowired
    private Users users;

    @Autowired
    private StandardOut standardOut;

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private EncryptInterface encrypt;

    /**
     * 用户注册 service 方法
     * @param userIn
     * @return
     */
    @Override
    public StandardOut signUp(UserIn userIn) {
        standardOut.set(ErrorCode.SUCCESS);
        if (!checkUserIn(userIn)) {
            return standardOut;
        }
        Date now = new Date();
        users.setUserId(userIn.getUserId());
        users.setSign(userIn.getSign());
        users.setEmail(userIn.getEmail());
        users.setUserExp(0);
        users.setSubmit(0);
        users.setSolved(0);
        users.setBlogCnt(0);
        users.setDefunct("N");
        users.setIp(userIn.getIp());
        users.setAccesstime(now);
        users.setVolume(1);
        users.setLanguage(1);
        users.setPassword(encrypt.passwordGenerator(userIn.getPassword()));
        users.setRegTime(now);
        users.setNick(userIn.getNick());
        users.setSchool(userIn.getSchool());

        try {
            Integer result = usersMapper.insert(users);
            if (0 == result) {
                standardOut.setCode(result.toString());
                standardOut.setMessage("插入数据库出错");
            }
        } catch (Exception e) {
            standardOut.set(ErrorCode.SYSTEM_SQL_INSERT_ERROR);
            log.error(e.getLocalizedMessage(), e.fillInStackTrace());
        } finally {
            return standardOut;
        }
    }

    /**
     * 校验输入的注册用户信息
     * @param userIn
     * @return
     */
    private Boolean checkUserIn(UserIn userIn) {
        Boolean result = false;
        if (userIn.getUserId().length() < 3) {
            standardOut.set(ErrorCode.USER_ID_TOO_SHORT);
        } else if (userIn.getUserId().length() > 12) {
            standardOut.set(ErrorCode.USER_ID_TOO_LONG);
        } else if (!isValidUserId(userIn.getUserId())) {
            standardOut.set(ErrorCode.USER_ID_IS_NOT_VALID);
        } else if (userIn.getNick().length() > 12) {
            standardOut.set(ErrorCode.USER_NICK_TOO_LONG);
        } else if (!userIn.getPassword().equals(userIn.getRePassword())) {
            standardOut.set(ErrorCode.USER_PASSWORD_IS_NOT_SAME);
        } else if (userIn.getPassword().length() < 6) {
            standardOut.set(ErrorCode.USER_PASSWORD_TOO_SHORT);
        } else if (userIn.getPassword().length() > 16) {
            standardOut.set(ErrorCode.USER_PASSWORD_TOO_LONG);
        } else if (userIn.getSchool().length() > 100) {
            standardOut.set(ErrorCode.USER_SCHOOL_TOO_LONG);
        } else if (userIn.getEmail().length() > 100) {
            standardOut.set(ErrorCode.USER_EMAIL_TOO_LONG);
        } else if(checkUserExists(userIn.getUserId())) {
            standardOut.set(ErrorCode.USER_ALREADY_EXISTS);
        } else {
            result = true;
        }
        return result;
    }

    /**
     * 校验用户ID是否为有效格式
     * @param userId
     * @return
     */
    private Boolean isValidUserId(String userId) {
        String regEx = "[a-zA-Z][a-zA-Z0-9]*";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(userId);
        return matcher.matches();
    }

    /**
     * 校验用户是否已存在
     * @param userId
     * @return
     */
    private Boolean checkUserExists(String userId) {
        Users users = usersMapper.selectByPrimaryKey(userId);
        if (null != users) {
            return true;
        }
        return false;
    }

    @Override
    public StandardOut signIn(String userId, String password) {
//        Users users =
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
