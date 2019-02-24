package cn.liuxingwei.judge.utils;

import cn.liuxingwei.judge.utils.Encrypt.EncryptWithMd5;
import cn.liuxingwei.judge.utils.Encrypt.EncryptWithoutMd5;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import org.apache.commons.codec.binary.Base64;
import java.util.UUID;

import static org.junit.Assert.*;

@Slf4j
@RunWith(PowerMockRunner.class)
@PrepareForTest({UUID.class, DigestUtils.class, EncryptInterface.class, Base64.class})
public class EncryptTest {

    @Test
    public void passwordGenerator() {
        String randomString = "76807aa0-c784-47ec-a933-de13773098e9";
        String salt = "95efc77d22669eea6bf39f0e4794608597ee15d4";
        String password = "e10adc3949ba59abbe56e057f20f883e";
        String twiceSalt = "0fedb588f5275a2b5b0b3d5c923a9e9b2dcb3d47";

        // mock uuid 对象，使其 toString() 方法返回预定义的 randomString 字符串
        UUID uuid = PowerMockito.mock(UUID.class);
        Mockito.when(uuid.toString()).thenReturn(randomString);

        // mock UUID 类，使其 randomUUID() 方法返回刚刚 mock 的 uuid 对象
        PowerMockito.mockStatic(UUID.class);
        PowerMockito.when(UUID.randomUUID()).thenReturn(uuid);

        // mock DigestUtils 类，使其 sha1Hex() 方法在接收预定义的 randomString 参数时，返回预定义的 salt 字符串
        PowerMockito.mockStatic(DigestUtils.class);
        PowerMockito.when(DigestUtils.sha1Hex(randomString)).thenReturn(salt);

        // 使 mock 的 DigestUtils 类的 sha1Hex() 方法在接收预定义的 密码和 salt 时，返回 预定义的 twiceSalt 字符串
        PowerMockito.when(DigestUtils.sha1Hex(password + salt.substring(0, 4))).thenReturn(twiceSalt);

        // mock Base64 类，使其encodeBase64String() 方法在接收 预定义的串时，返回预定义的加密后密码
        PowerMockito.mockStatic(Base64.class);
        String imencryptpassword = "imencryptpassword";
        PowerMockito.when(Base64.encodeBase64String((twiceSalt.substring(0, 20) + salt.substring(0, 4)).getBytes())).thenReturn(imencryptpassword);

        // 调用加密方法，并验证结果
        EncryptInterface encrypt = new EncryptWithoutMd5();
        String encryptPassword = encrypt.passwordGenerator(password);
        assertEquals(imencryptpassword, encryptPassword);
    }

    @Test
    public void passwordGeneratorWithMd5() {
        String randomString = "76807aa0-c784-47ec-a933-de13773098e9";
        String salt = "95efc77d22669eea6bf39f0e4794608597ee15d4";
        String password = "123456";
        String rePassword = "e10adc3949ba59abbe56e057f20f883e";
        String twiceSaltMd5 = "0fedb588f5275a2b5b0b3d5c923a9e9b2dcb3d47";

        // mock uuid 对象，使其 toString() 方法返回预定义的 randomString 字符串
        UUID uuid = PowerMockito.mock(UUID.class);
        Mockito.when(uuid.toString()).thenReturn(randomString);

        // mock UUID 类，使其 randomUUID() 方法返回刚刚 mock 的 uuid 对象
        PowerMockito.mockStatic(UUID.class);
        PowerMockito.when(UUID.randomUUID()).thenReturn(uuid);

        // mock DigestUtils 类，使其 sha1Hex() 方法在接收预定义的 randomString 参数时，返回预定义的 salt 字符串
        PowerMockito.mockStatic(DigestUtils.class);
        PowerMockito.when(DigestUtils.sha1Hex(randomString)).thenReturn(salt);

        // 使 mock 的 DigestUtils 类的 md5Hex 方法，在接受预定义的 password 时，生成预定义的 rePassword 字符串
        PowerMockito.when(DigestUtils.md5Hex(password)).thenReturn(rePassword);

        // 使 mock 的 DigestUtils 类的 sha1Hex() 方法在接收预定义的 rePassword 和 salt 时，返回 预定义的 twiceSaltMd5 字符串
        PowerMockito.when(DigestUtils.sha1Hex(rePassword + salt.substring(0, 4))).thenReturn(twiceSaltMd5);

        // mock Base64 类，使其encodeBase64String() 方法在接收 预定义的串时，返回预定义的加密后密码
        PowerMockito.mockStatic(Base64.class);
        String imencryptpassword = "MGZlZGI1ODhmNTI3NWEyYjViMGI3ZWM4";
        PowerMockito.when(Base64.encodeBase64String((twiceSaltMd5.substring(0, 20) + salt.substring(0, 4)).getBytes())).thenReturn(imencryptpassword);

        // 调用加密方法，并验证结果
        EncryptInterface encrypt = new EncryptWithMd5();
        String encryptPassword = encrypt.passwordGenerator("123456", true);
        assertEquals(imencryptpassword, encryptPassword);
    }
}