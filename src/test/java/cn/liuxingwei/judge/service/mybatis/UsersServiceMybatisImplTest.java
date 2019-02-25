package cn.liuxingwei.judge.service.mybatis;

import cn.liuxingwei.judge.constant.ErrorCode;
import cn.liuxingwei.judge.domain.Users;
import cn.liuxingwei.judge.mapper.UsersMapper;
import cn.liuxingwei.judge.utils.EncryptInterface;
import cn.liuxingwei.judge.vo.in.UserIn;
import cn.liuxingwei.judge.vo.out.StandardOut;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringRunner.class)
@PowerMockIgnore({"javax.management.*", "javax.net.ssl.*"})
@PrepareForTest({UsersServiceMybatisImpl.class, Date.class})
@SpringBootTest
@Transactional
//@Rollback(false)
public class UsersServiceMybatisImplTest {

    @Autowired
    private UsersServiceMybatisImpl usersServiceMybatis;

    @MockBean
    private EncryptInterface encryptInterface;

    @Autowired
    private UsersMapper usersMapper;

    private UserIn userIn;

    @Before
    public void setUp() throws Exception {
       userIn = new UserIn();
        Mockito.when(encryptInterface.passwordGenerator("hello123")).thenReturn("abcdefghijklmn");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void signUpWithUserIdTooShort() {
        userIn.setUserId("ab");
        StandardOut result = usersServiceMybatis.signUp(userIn);
        StandardOut expectResult = new StandardOut();
        expectResult.set(ErrorCode.USER_ID_TOO_SHORT);
        assertEquals(expectResult, result);
    }

    @Test
    public void signUpWithUserIdToLong() {
        userIn.setUserId("abcdefghijklm");
        StandardOut result = usersServiceMybatis.signUp(userIn);
        StandardOut expectResult = new StandardOut();
        expectResult.set(ErrorCode.USER_ID_TOO_LONG);
        assertEquals(expectResult, result);
    }

    @Test
    public void signUpWithUserIdInvalid() {
        userIn.setUserId("_abc?kst");
        StandardOut result = usersServiceMybatis.signUp(userIn);
        StandardOut expectResult = new StandardOut();
        expectResult.set(ErrorCode.USER_ID_IS_NOT_VALID);
        assertEquals(expectResult, result);
    }

    @Test
    public void signUpWithUserNickTooLong() {
        userIn.setUserId("adm");
        userIn.setNick("abcdefghijklm");
        StandardOut result = usersServiceMybatis.signUp(userIn);
        StandardOut expectResult = new StandardOut();
        expectResult.set(ErrorCode.USER_NICK_TOO_LONG);
        assertEquals(expectResult, result);
    }

    @Test
    public void signUpWithUserPasswordIsNotSame() {
        userIn.setUserId("adbmin123456");
        userIn.setNick("俺老孙的名字就叫做孙悟空");
        userIn.setPassword("hello");
        userIn.setRePassword("holle");
        StandardOut result = usersServiceMybatis.signUp(userIn);
        StandardOut expectResult = new StandardOut();
        expectResult.set(ErrorCode.USER_PASSWORD_IS_NOT_SAME);
        assertEquals(expectResult, result);
    }

    @Test
    public void signUpWithUserPasswordTooShort() {
        userIn.setUserId("admin");
        userIn.setNick("悟空");
        userIn.setPassword("hello");
        userIn.setRePassword("hello");
        StandardOut result = usersServiceMybatis.signUp(userIn);
        StandardOut expectResult = new StandardOut();
        expectResult.set(ErrorCode.USER_PASSWORD_TOO_SHORT);
        assertEquals(expectResult, result);
    }

    @Test
    public void signUpWithUserPasswordTooLong() {
        userIn.setUserId("admin");
        userIn.setNick("悟空");
        userIn.setPassword("helloworld1234567");
        userIn.setRePassword("helloworld1234567");
        StandardOut result = usersServiceMybatis.signUp(userIn);
        StandardOut expectResult = new StandardOut();
        expectResult.set(ErrorCode.USER_PASSWORD_TOO_LONG);
        assertEquals(expectResult, result);
    }

    @Test
    public void signUpWithUserSchoolTooLong() {
        userIn.setUserId("admin");
        userIn.setNick("悟空");
        userIn.setPassword("helloworld123456");
        userIn.setRePassword("helloworld123456");
        userIn.setSchool("摘要: 定义函数时为参数指定默认值的能力，是现代动态编程语言的标配。在ES6出现之前，JavaScript是没有这种能力的，框架为了实现参数默认值，用了很多技巧。 ES6 的默认参数值功能，与其他语言的语法类似，但功能更强大。");
        StandardOut result = usersServiceMybatis.signUp(userIn);
        StandardOut expectResult = new StandardOut();
        expectResult.set(ErrorCode.USER_SCHOOL_TOO_LONG);
        assertEquals(expectResult, result);
    }

    @Test
    public void signUpWithUserEmailTooLong() {
        userIn.setUserId("admin");
        userIn.setNick("悟空");
        userIn.setPassword("helloworld");
        userIn.setRePassword("helloworld");
        userIn.setSchool("dyq0k9kxprkasyzz3n7ldyz14wpgofusrqwv6dwf1o12ehlfvnfnoohowdeea7c7tb4z3gu99n3ie9sqv96nj7z8ov66936io350");
        userIn.setEmail("dyq0k9kxprkasyzz3n7ldyz14wpgofusrqwv6dwf1o12ehlfvnfnoohowdeea7c7tb4z3gu99n3ie9sqv96nj@7z8ov66936i.net");
        StandardOut result = usersServiceMybatis.signUp(userIn);
        StandardOut expectResult = new StandardOut();
        expectResult.set(ErrorCode.USER_EMAIL_TOO_LONG);
        assertEquals(expectResult, result);
    }

    @Test
    public void signUpWithUserIdExists() {
        userIn.setUserId("admin");
        userIn.setNick("悟空");
        userIn.setPassword("helloworld");
        userIn.setRePassword("helloworld");
        userIn.setSchool("dyq0k9kxprkasyzz3n7ldyz14wpgofusrqwv6dwf1o12ehlfvnfnoohowdeea7c7tb4z3gu99n3ie9sqv96nj7z8ov66936io350");
        userIn.setEmail("dyq0k9kxprkasyzz3n7ldyz14wpgofusrqwv6dwf1o12ehlfvnfnoohowdeea7c7tb4z3gu99n3ie9sqv96nj@z8ov66936i.net");
        StandardOut result = usersServiceMybatis.signUp(userIn);
        StandardOut expectResult = new StandardOut();
        expectResult.set(ErrorCode.USER_ALREADY_EXISTS);
        assertEquals(expectResult, result);
    }
    @Test
    public void signUp() throws Exception{
        Date date = new Date();
        PowerMockito.mock(Date.class);
        PowerMockito.whenNew(Date.class).withNoArguments().thenReturn(date);
        Date date1 = new Date();
        assertSame(date, date1);
        userIn.setUserId("admin123");
        userIn.setSign("盘古氏");
        userIn.setEmail("pangu@gushen.com");
        userIn.setPassword("hello123");
        userIn.setRePassword("hello123");
        userIn.setIp("127.0.0.1");
        userIn.setNick("盘古");
        userIn.setSchool("混沌大学");
        StandardOut result = usersServiceMybatis.signUp(userIn);
        StandardOut expectResult = new StandardOut();
        expectResult.set(ErrorCode.SUCCESS);
        assertEquals(expectResult, result);
        Users user = usersMapper.selectByPrimaryKey("admin123");
        assertEquals("admin123", user.getUserId());
        assertEquals("盘古氏", user.getSign());
        assertEquals("pangu@gushen.com", user.getEmail());
        assertEquals(new Integer(0), user.getUserExp());
        assertEquals(new Integer(0), user.getSubmit());
        assertEquals(new Integer(0), user.getSolved());
        assertEquals(new Integer(0), user.getBlogCnt());
        assertEquals("N", user.getDefunct());
        assertEquals("127.0.0.1", user.getIp());
        assertEquals(new Integer(1), user.getVolume());
        assertEquals(new Integer(1), user.getLanguage());
        assertEquals("abcdefghijklmn", user.getPassword());
        assertEquals("盘古", user.getNick());
        assertEquals("混沌大学", user.getSchool());
        assertEquals(date.toString(), user.getAccesstime().toString());
        assertEquals(date.toString(), user.getRegTime().toString());
    }

    @Test
    public void signIn() {
    }

    @Test
    public void signOut() {
    }

    @Test
    public void getUserInfo() {
    }

    @Test
    public void modifyUserInfo() {
    }

    @Test
    public void modifyPassword() {
    }

    @Test
    public void checkUserSignIn() {
    }
}