package cn.liuxingwei.judge.utils.Encrypt;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class EncryptWithMd5Condition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        if (env.getProperty("business.user.password.encrypt.md5").equals("true")) {
            return true;
        }
        return false;
    }
}
