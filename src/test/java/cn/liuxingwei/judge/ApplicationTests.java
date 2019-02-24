package cn.liuxingwei.judge;

import cn.liuxingwei.judge.config.BusinessPropertiesConfiguration;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private BusinessPropertiesConfiguration businessPropertiesConfiguration;

    @Test
    public void contextLoads() {
        log.info(((Map<?, ?>)((Map<?, ?>) businessPropertiesConfiguration.getUser().get("password")).get("encrypt")).get("md5").toString());
        assertEquals("true", ((Map<?, ?>)((Map<?, ?>) businessPropertiesConfiguration.getUser().get("password")).get("encrypt")).get("md5").toString());
    }

}
