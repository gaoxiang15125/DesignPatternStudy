package github.gx.designpattern.observer.awtrealize;

import github.gx.designpattern.observer.awtrealize.bean.Event;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design-study
 * @description: 事件监听器，其为观察者的桥梁, 即 分发者
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-22 17:17
 **/
public class EventListener {
    // 模拟 JDk 底层 Listener 设计实现方式
    protected Map<String, Event> eventMap = new HashMap<>();

    // 额 意义不太大，放一放吧
}
