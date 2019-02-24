package cn.liuxingwei.judge.config;

import cn.liuxingwei.judge.utils.Encrypt.EncryptWithMd5;
import cn.liuxingwei.judge.utils.EncryptInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AssembleConfiguration {
    @Bean
    public EncryptInterface encrypt() {
        return new EncryptWithMd5();
    }
}
