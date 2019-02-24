package cn.liuxingwei.judge.service.mybatis;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MybatisCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        if (env.getProperty("use.data.access.method").equals("mybatis")) {
            return true;
        }
        return false;
    }
}
