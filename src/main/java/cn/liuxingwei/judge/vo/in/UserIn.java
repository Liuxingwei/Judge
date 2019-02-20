package cn.liuxingwei.judge.vo.in;

import lombok.Data;

@Data
public class UserIn extends BaseIn {
    /**
     * 用户ID
     */
    private String userId;

    /**
     * 签名
     */
    private String sign;

    /**
     * email
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 重复密码
     */
    private String rePassword;

    /**
     * 用户昵称
     */
    private String nick;

    /**
     * 毕业学校
     */
    private String school;

    /**
     * 客户端ip地址
     */
    private String ip;
}
