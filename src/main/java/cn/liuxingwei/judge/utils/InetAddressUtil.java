package cn.liuxingwei.judge.utils;

import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Component
public class InetAddressUtil {
    public String getHostAddress() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostAddress();
    }
}
