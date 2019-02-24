package cn.liuxingwei.judge.utils.Encrypt;

import cn.liuxingwei.judge.utils.EncryptInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Conditional(EncryptWithMd5Condition.class)
public class EncryptWithMd5 implements EncryptInterface {
    /**
     * 密码加密
     * @param password 待加密的密码
     * @return 加密后的密码
     */
    public String passwordGenerator(String password) {
        return passwordGenerator(password, true);
    }
}
