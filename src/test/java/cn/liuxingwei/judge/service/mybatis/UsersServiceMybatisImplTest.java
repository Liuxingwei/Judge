package cn.liuxingwei.judge.service.mybatis;

import cn.liuxingwei.judge.constant.ErrorCode;
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

import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
//@RunWith(PowerMockRunner.class)
//@PowerMockRunnerDelegate(SpringRunner.class)
//@PowerMockIgnore({"javax.management.*", "javax.net.ssl.*"})
//@PrepareForTest({UUID.class})
@SpringBootTest
@Transactional
//@Rollback(false)
public class UsersServiceMybatisImplTest {

    @Autowired
    private UsersServiceMybatisImpl usersServiceMybatis;

    @MockBean
    private EncryptInterface encryptInterface;

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
//        UUID uuid = UUID.randomUUID();
//        PowerMockito.mockStatic(UUID.class);
//        PowerMockito.when(UUID.randomUUID()).thenReturn(uuid);
//        UUID newUUid = UUID.randomUUID();
//        assertSame(uuid, newUUid);

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

    public void signUp() {
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