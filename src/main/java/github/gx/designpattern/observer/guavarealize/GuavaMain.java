package github.gx.designpattern.observer.guavarealize;

import com.google.common.eventbus.EventBus;

/**
 * @program: design-study
 * @description: guava 订阅模式 发布者代码实现
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-22 19:20
 **/
public class GuavaMain {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("偶吼吼，通过注解传递信息嘛");
    }
}
