package cn.liuxingwei.judge.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.UUID;

public interface EncryptInterface {

    String passwordGenerator(String password);

    default public String passwordGenerator(String password, boolean md5) {
        if (md5) {
            password = DigestUtils.md5Hex(password);
        }

        UUID uuid = UUID.randomUUID();
        String randomString = uuid.toString();
        String sha1 = DigestUtils.sha1Hex(randomString);
        String salt = sha1.substring(0, 4);
        String saltString = DigestUtils.sha1Hex(password + salt).substring(0,20) + salt;
        return Base64.encodeBase64String(saltString.getBytes());
    }
}
