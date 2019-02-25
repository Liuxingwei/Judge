package cn.liuxingwei.judge.constant;

import lombok.Data;

public enum ErrorCode {

    SUCCESS("0", "success"),

    SYSTEM_SQL_INSERT_ERROR("000001", "数据库插入错误"),

    USER_ID_TOO_SHORT("100001", "用户名太短（要求 3 字符以上）"),

    USER_ID_TOO_LONG("100002", "用户名太长（要求 12 字符以下）"),

    USER_ID_IS_NOT_VALID("100003", "用户名只能包含英文字母和数字，且必须以字母开头"),

    USER_NICK_TOO_LONG("100004", "昵称太长（要求 12 字符以下）"),

    USER_PASSWORD_IS_NOT_SAME("100005", "密码不一致"),

    USER_PASSWORD_TOO_SHORT("100006", "密码太短（要求 6 字符以上）"),

    USER_PASSWORD_TOO_LONG("100007", "密码太长（要求 16 字符以下）"),

    USER_SCHOOL_TOO_LONG("100008", "学校名称太长（要求 100 字符以下）"),

    USER_EMAIL_TOO_LONG("100009", "邮箱太长"),

    USER_ALREADY_EXISTS("100010", "用户已存在");


    private String code;
    private String message;
    private ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
