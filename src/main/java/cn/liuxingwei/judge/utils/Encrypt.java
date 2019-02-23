package cn.liuxingwei.judge.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.UUID;

@Slf4j
public class Encrypt {
    /**
     * 密码加密
     * @param password 待加密的密码
     * @param md5 是否先用 md5 加密
     * @return 加密后的密码
     */
    public static String passwordGenerator(String password, boolean md5) {
        if (md5) {
            password = DigestUtils.md5Hex(password);
        }
        String salt = DigestUtils.sha1Hex(UUID.randomUUID().toString()).substring(0, 4);
        String saltString = DigestUtils.sha1Hex(password + salt) + salt;
        String encryPassword = Base64.encodeBase64String(saltString.getBytes());
        return encryPassword;
    }
}
