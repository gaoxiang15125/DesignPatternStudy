package github.gx.designpattern.observer.guavarealize;

import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: design-study
 * @description: Guava 版订阅发布模式
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-22 19:00
 **/
@Slf4j
public class GuavaEvent {

    // 只需要注解就可以编写 通知时的回调接口了么??
    @Subscribe
    public void subscribe(Object str) {
        String message = (String) str;
        log.info("订阅者收到通知，信息内容为: {}", message);
    }
}
