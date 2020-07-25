package cn.liuxingwei.judge.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletRequest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class IpUtilTest {
    @MockBean
    private HttpServletRequest request;

    @Test
    public void getWithXForwardedFor() {
        when(request.getHeader("x-forwarded-for")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil();
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getNullWithXForwardedForAndProxyClientIp() {
        when(request.getHeader("x-forwarded-for")).thenReturn(null);
        when(request.getHeader("Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil();
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getEmptyWithXForwardedForAndProxyClientIp() {
        when(request.getHeader("x-forwarded-for")).thenReturn("");
        when(request.getHeader("Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil();
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getUnknownWithXForwardedForAndProxyClientIp() {
        when(request.getHeader("x-forwarded-for")).thenReturn("unknown");
        when(request.getHeader("Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil();
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getUpperUnknownWithXForwardedForAndProxyClientIp() {
        when(request.getHeader("x-forwarded-for")).thenReturn("UNKNOWN");
        when(request.getHeader("Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil();
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getNullWithXForwardedForAndNullWithProxyClientIpAndWLProxyClientIp() {
        when(request.getHeader("x-forwarded-for")).thenReturn(null);
        when(request.getHeader("Proxy-Client-IP")).thenReturn(null);
        when(request.getHeader("WL-Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil();
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getEmptyWithXForwardedForAndEmptyWithProxyClientIpAndWLProxyClientIp() {
        when(request.getHeader("x-forwarded-for")).thenReturn("");
        when(request.getHeader("Proxy-Client-IP")).thenReturn("");
        when(request.getHeader("WL-Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil();
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getUnknownWithXForwardedForAndUnknownWithProxyClientIpAndWLProxyClientIp() {
        when(request.getHeader("x-forwarded-for")).thenReturn("unknown");
        when(request.getHeader("Proxy-Client-IP")).thenReturn("unknown");
        when(request.getHeader("WL-Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil();
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getUpperUnknownWithXForwardedForAndUnknownWithProxyClientIpAndWLProxyClientIp() {
        when(request.getHeader("x-forwarded-for")).thenReturn("UNKNOWN");
        when(request.getHeader("Proxy-Client-IP")).thenReturn("UNKNOWN");
        when(request.getHeader("WL-Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil();
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

}