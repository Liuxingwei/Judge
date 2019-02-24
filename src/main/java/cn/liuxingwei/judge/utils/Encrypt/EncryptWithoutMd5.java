package cn.liuxingwei.judge.utils.Encrypt;

import cn.liuxingwei.judge.utils.EncryptInterface;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.UUID;

@Slf4j
public class EncryptWithoutMd5 implements EncryptInterface {
    /**
     * 密码加密
     * @param password 待加密的密码
     * @return 加密后的密码
     */
    public String passwordGenerator(String password) {
        return passwordGenerator(password, false);
    }
}
