package github.gx.designpattern.observer.jdkrealize.dto.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: design-study
 * @description: 消息实体，订阅发布模式中信息传输介质
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-22 16:06
 **/
@Data
@AllArgsConstructor
public class Question implements Serializable {
    // 并不涉及复杂的过程，不过继承下 Serializer 总归是好事
    String questionName;
    String author;
}
