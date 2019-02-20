package cn.liuxingwei.judge.vo.in;

import lombok.Data;

@Data
public class UserIn extends BaseIn {
    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户昵称
     */
    private String nick;

    /**
     * email
     */
    private String email;

    /**
     *
     */
}
