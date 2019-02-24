package cn.liuxingwei.judge.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "business")
public class BusinessPropertiesConfiguration {
    private Map<?, ?> user;
}
