package cn.liuxingwei.judge.vo.out;

import lombok.Data;

@Data
public class BaseOut<T>{
    /**
     * 返回码
     */
    private String code;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回的数据
     */
    private T data;
}
