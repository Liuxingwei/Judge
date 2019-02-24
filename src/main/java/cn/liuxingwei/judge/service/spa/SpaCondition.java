package cn.liuxingwei.judge.service.spa;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class SpaCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        if (env.getProperty("use.data.access.method").equals("spa")) {
            return true;
        }
        return false;
    }
}
