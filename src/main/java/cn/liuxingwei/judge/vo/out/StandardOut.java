package cn.liuxingwei.judge.vo.out;

import cn.liuxingwei.judge.constant.ErrorCode;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class StandardOut<T>{
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

    /**
     * 仅设置返回码和消息，data设置为null
     * @param errorCode
     */
    public void set(ErrorCode errorCode) {
        set(errorCode, null);
    }

    /**
     * 设置返回码和消息
     * @param errorCode
     * @param data
     */
    public void set(ErrorCode errorCode, T data) {
        setCode(errorCode.getCode());
        setMessage(errorCode.getMessage());
        setData(data);
    }
}
