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

    public void set(ErrorCode errorCode) {
        setCode(errorCode.getCode());
        setMessage(errorCode.getMessage());
    }

    public void set(ErrorCode errorCode, T data) {
        set(errorCode);
        setData(data);
    }
}
