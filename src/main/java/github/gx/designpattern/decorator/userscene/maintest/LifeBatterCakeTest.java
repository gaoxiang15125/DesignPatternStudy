package github.gx.designpattern.decorator.userscene.maintest;

import github.gx.designpattern.decorator.userscene.product.BaseBatterCake;
import github.gx.designpattern.decorator.userscene.product.BatterCake;
import github.gx.designpattern.decorator.userscene.product.EggDecorator;
import github.gx.designpattern.decorator.userscene.product.SausageDecorator;

/**
 * @program: design-study
 * @description: 装饰者模式，煎饼类 流程测试代码
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-25 12:08
 **/
public class LifeBatterCakeTest {

    // 总结下就是 对创建的对象进行多层包装，通过父子关系层层调用，最终实现功能，且对原始类不可见
    public static void main(String[] args) {
        BatterCake batterCake;
        batterCake = new BaseBatterCake();
        batterCake = new EggDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);
        System.out.println(batterCake.getMsg() +";price is " + batterCake.getPrice());
    }
}
