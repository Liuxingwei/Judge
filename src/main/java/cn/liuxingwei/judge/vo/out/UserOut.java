package cn.liuxingwei.judge.vo.out;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("prototype")
public class UserOut<T> extends BaseOut<T> {

}
