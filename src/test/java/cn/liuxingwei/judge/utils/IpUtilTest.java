package cn.liuxingwei.judge.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletRequest;

import java.net.UnknownHostException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class IpUtilTest {
    @MockBean
    private HttpServletRequest request;

    @MockBean
    private InetAddressUtil inetAddressUtils;

    @Test
    public void getWithXForwardedFor() throws UnknownHostException {
        when(request.getHeader("x-forwarded-for")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil(inetAddressUtils);
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getNullWithXForwardedForAndProxyClientIp() throws UnknownHostException {
        when(request.getHeader("x-forwarded-for")).thenReturn(null);
        when(request.getHeader("Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil(inetAddressUtils);
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getEmptyWithXForwardedForAndProxyClientIp() throws UnknownHostException {
        when(request.getHeader("x-forwarded-for")).thenReturn("");
        when(request.getHeader("Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil(inetAddressUtils);
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getUnknownWithXForwardedForAndProxyClientIp() throws UnknownHostException {
        when(request.getHeader("x-forwarded-for")).thenReturn("unknown");
        when(request.getHeader("Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil(inetAddressUtils);
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getUpperUnknownWithXForwardedForAndProxyClientIp() throws UnknownHostException {
        when(request.getHeader("x-forwarded-for")).thenReturn("UNKNOWN");
        when(request.getHeader("Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil(inetAddressUtils);
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getNullWithXForwardedForAndNullWithProxyClientIpAndWLProxyClientIp() throws UnknownHostException {
        when(request.getHeader("x-forwarded-for")).thenReturn(null);
        when(request.getHeader("Proxy-Client-IP")).thenReturn(null);
        when(request.getHeader("WL-Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil(inetAddressUtils);
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getEmptyWithXForwardedForAndEmptyWithProxyClientIpAndWLProxyClientIp() throws UnknownHostException {
        when(request.getHeader("x-forwarded-for")).thenReturn("");
        when(request.getHeader("Proxy-Client-IP")).thenReturn("");
        when(request.getHeader("WL-Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil(inetAddressUtils);
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getUnknownWithXForwardedForAndUnknownWithProxyClientIpAndWLProxyClientIp() throws UnknownHostException {
        when(request.getHeader("x-forwarded-for")).thenReturn("unknown");
        when(request.getHeader("Proxy-Client-IP")).thenReturn("unknown");
        when(request.getHeader("WL-Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil(inetAddressUtils);
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getUpperUnknownWithXForwardedForAndUnknownWithProxyClientIpAndWLProxyClientIp() throws UnknownHostException {
        when(request.getHeader("x-forwarded-for")).thenReturn("UNKNOWN");
        when(request.getHeader("Proxy-Client-IP")).thenReturn("UNKNOWN");
        when(request.getHeader("WL-Proxy-Client-IP")).thenReturn("192.168.3.27");
        IpUtil ipUtil = new IpUtil(inetAddressUtils);
        assertEquals("192.168.3.27", ipUtil.getIpAddr(request));
    }

    @Test
    public void getNullWithXForwardedForAndNullWithProxyClientIpAndNullWithWLProxyClientIp() throws UnknownHostException {
        when(request.getHeader("x-forwarded-for")).thenReturn(null);
        when(request.getHeader("Proxy-Client-IP")).thenReturn(null);
        when(request.getHeader("WL-Proxy-Client-IP")).thenReturn(null);
        when(request.getRemoteAddr()).thenReturn("127.0.0.1");
        when(inetAddressUtils.getHostAddress()).thenReturn("192.168.1.192");
        IpUtil ipUtil = new IpUtil(inetAddressUtils);
        assertEquals("192.168.1.192", ipUtil.getIpAddr(request));
    }

    @Test
    public void getEmptyWithXForwardedForAndEmptyWithProxyClientIpAndEmptyWithWLProxyClientIp() throws UnknownHostException {
        when(request.getHeader("x-forwarded-for")).thenReturn("");
        when(request.getHeader("Proxy-Client-IP")).thenReturn("");
        when(request.getHeader("WL-Proxy-Client-IP")).thenReturn("");
        when(request.getRemoteAddr()).thenReturn("0:0:0:0:0:0:0:1");
        when(inetAddressUtils.getHostAddress()).thenReturn("192.168.1.192");
        IpUtil ipUtil = new IpUtil(inetAddressUtils);
        assertEquals("192.168.1.192", ipUtil.getIpAddr(request));
    }

    @Test
    public void getUnknownWithXForwardedForAndUnknownWithProxyClientIpAndUnknownWithWLProxyClientIp() throws UnknownHostException {
        when(request.getHeader("x-forwarded-for")).thenReturn("unknown");
        when(request.getHeader("Proxy-Client-IP")).thenReturn("UNKNOWN");
        when(request.getHeader("WL-Proxy-Client-IP")).thenReturn("UnKnOWn");
        when(request.getRemoteAddr()).thenReturn("0:0:0:0:0:0:0:1");
        when(inetAddressUtils.getHostAddress()).thenReturn("192.168.1.192");
        IpUtil ipUtil = new IpUtil(inetAddressUtils);
        assertEquals("192.168.1.192", ipUtil.getIpAddr(request));
    }

    @Test
    public void getAddressList() throws UnknownHostException {
        when(request.getHeader("x-forwarded-for")).thenReturn("192.168.1.192,230.7.8.93,189.221.7.98");
        IpUtil ipUtil = new IpUtil(inetAddressUtils);
        assertEquals("192.168.1.192", ipUtil.getIpAddr(request));
    }

    @Test(expected = UnknownHostException.class)
    public void getThrown() throws UnknownHostException{
        when(request.getHeader("x-forwarded-for")).thenReturn("unknown");
        when(request.getHeader("Proxy-Client-IP")).thenReturn("UNKNOWN");
        when(request.getHeader("WL-Proxy-Client-IP")).thenReturn("UnKnOWn");
        when(request.getRemoteAddr()).thenReturn("0:0:0:0:0:0:0:1");
        when(inetAddressUtils.getHostAddress()).thenThrow(UnknownHostException.class);
        IpUtil ipUtil = new IpUtil(inetAddressUtils);
        ipUtil.getIpAddr(request);
    }
}