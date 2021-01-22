package github.gx.designpattern.observer.awtrealize.bean;

import lombok.*;

import java.lang.reflect.Method;

/**
 * @program: design-study
 * @description: 事件通知信息实体类
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-22 17:06
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Event {

    // 事件源
    private Object source;
    // 目标源
    private Object target;
    // 事件触发
    private Method callback;
    // 事件名称
    private String trigger;
    // 事件触发时间
    private long time;


}
