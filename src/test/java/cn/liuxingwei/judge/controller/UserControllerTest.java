package cn.liuxingwei.judge.controller;

import cn.liuxingwei.judge.constant.ErrorCode;
import cn.liuxingwei.judge.service.UsersServiceInterface;
import cn.liuxingwei.judge.utils.IpUtil;
import cn.liuxingwei.judge.vo.in.UserIn;
import cn.liuxingwei.judge.vo.out.StandardOut;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatcher;
import static org.mockito.Mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UsersServiceInterface usersServiceInterface;

    @MockBean
    private StandardOut<?> standard;

    @MockBean
    private IpUtil ipUtil;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void signUp() throws Exception {
        when(ipUtil.getIpAddr(argThat(new ArgumentMatcher<HttpServletRequest>() {
            @Override
            public boolean matches(HttpServletRequest argument) {
                return true;
            }
        }))).thenReturn("202.211.72.90");
        StandardOut<?> standardOut = new StandardOut<String>();
        standardOut.set(ErrorCode.SUCCESS);
        when(usersServiceInterface.signUp(argThat(new ArgumentMatcher<UserIn>() {
            @Override
            public boolean matches(UserIn argument) {
                return argument.getUserId().equals("manageliu") && argument.getIp().equals("202.211.72.90");
            }
        }))).thenReturn(standardOut);
        mockMvc.perform(post("/user/signup").accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON_UTF8)
                .content("{\"userId\":\"manageliu\",\"nick\": \"管理员\",\"password\": \"123456\",\"rePassword\": \"123456\",\"sign\": \"北上广深\",\"email\": \"mm@163.com\",\"school\": \"tokyoudayigaku\"}"))
                .andExpect(jsonPath("code").value("0"))
                .andExpect(jsonPath("message").value("success"))
                .andExpect(jsonPath("data").doesNotExist());
    }

    @Test
    public void signIn() {
    }
}