package cn.liuxingwei.judge.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class EncryptTest {

    @Test
    public void passwordGenerator() {
        String encryptPassword = Encrypt.passwordGenerator("123456", "mbaefaeq", false);
        assertEquals("ZTFjNjhkMmRjMzgyODY2MWIyZGZjYjExZGU0NmU1NTcyYTZkNzA3MzdmZDQ=", encryptPassword);
    }

    @Test
    public void passwordGeneratorWithMd5() {
        String encryptPassword = Encrypt.passwordGenerator("123456", "mbaefaeq", true);
        assertEquals("MGMyMjU5ZGQ3YTllOGYxYmMzNjRkNzMxMjJhNWRmZjAzYWNiOTlkNzdmZDQ=", encryptPassword);
    }
}