package cn.liuxingwei.judge.service.mybatis;

import cn.liuxingwei.judge.constant.ErrorCode;
import cn.liuxingwei.judge.domain.Users;
import cn.liuxingwei.judge.mapper.UsersMapper;
import cn.liuxingwei.judge.service.UsersServiceInterface;
import cn.liuxingwei.judge.utils.DateUtils;
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

    private Users users;

    private StandardOut<?> standardOut;

    private UsersMapper usersMapper;

    private EncryptInterface encrypt;

    private DateUtils dateUtils;

    @Autowired
    public UsersServiceMybatisImpl(Users users, StandardOut<?> standardOut, UsersMapper usersMapper, EncryptInterface encrypt, DateUtils dateUtils) {
        this.users = users;
        this.standardOut = standardOut;
        this.usersMapper = usersMapper;
        this.encrypt = encrypt;
        this.dateUtils = dateUtils;
    }

    /**
     * 用户注册 service 方法
     * @param userIn 用户信息
     * @return StandardOut
     */
    @Override
    public StandardOut<?> signUp(UserIn userIn) {
        standardOut.set(ErrorCode.SUCCESS);
        if (!checkUserIn(userIn)) {
            return standardOut;
        }
        Date now = dateUtils.generateDate();
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
            int result = usersMapper.insert(users);
            if (0 == result) {
                standardOut.setCode(Integer.toString(result));
                standardOut.setMessage("插入数据库出错");
            }
        } catch (Exception e) {
            standardOut.set(ErrorCode.SYSTEM_SQL_INSERT_ERROR);
            log.error(e.getLocalizedMessage(), e.fillInStackTrace());
        }
        return standardOut;

    }

    /**
     * 校验输入的注册用户信息
     * @param userIn 用户信息
     * @return Boolean
     */
    private Boolean checkUserIn(UserIn userIn) {
        boolean result = false;
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
     * @param userId 用户 ID
     * @return Boolean
     */
    private Boolean isValidUserId(String userId) {
        String regEx = "[a-zA-Z][a-zA-Z0-9]*";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(userId);
        return matcher.matches();
    }

    /**
     * 校验用户是否已存在
     * @param userId 用户ID
     * @return Boolean
     */
    private Boolean checkUserExists(String userId) {
        Users users = usersMapper.selectByPrimaryKey(userId);
        if (null != users) {
            return true;
        }
        return false;
    }

    @Override
    public StandardOut<?> signIn(String userId, String password) {
        standardOut.set(ErrorCode.SUCCESS);
        Users users = usersMapper.selectByPrimaryKey(userId);
        if (null == users) {
            standardOut.set(ErrorCode.USER_NOT_EXISTS);
        } else if (! checkUserPassword(users.getPassword(), password)) {
            standardOut.set(ErrorCode.USER_NOT_EXISTS);
        }

        return standardOut;
    }

    @Override
    public StandardOut<?> signOut(Session session) {
        return null;
    }

    @Override
    public StandardOut<?> getUserInfo(Session session) {
        return null;
    }

    @Override
    public StandardOut<?> modifyUserInfo(UserIn userIn) {
        return null;
    }

    @Override
    public StandardOut<?> modifyPassword(String userId, String oldPassword, String newPassword) {
        return null;
    }

    @Override
    public StandardOut<?> checkUserSignIn(Session session) {
        return null;
    }

    /**
     * 验证密码是否与数据库中的密码一致
     * @param storedPassword 存储在数据库中的密码
     * @param password 要验证的密码
     * @return Boolean
     */
    private Boolean checkUserPassword(String storedPassword, String password) {
        return false;
    }
}
