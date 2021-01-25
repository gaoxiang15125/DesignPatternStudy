package github.gx.designpattern.decorator.userscene.product;

/**
 * @program: design-study
 * @description: 香肠装饰者 实现类
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-25 12:02
 **/
public class SausageDecorator extends BatterCakeDecorator {


    public SausageDecorator(BatterCake batterCake) {
        super(batterCake);
        // 突然好奇 子类父类同名对象之间是什么关系呢
        // 我认为 子类对象会覆盖父类对象，现在的代码会报错
    }

    @Override
    protected void doSomething() {}

    @Override
    public String getMsg() {
        return super.getMsg() + "1根香肠;您看,我还有机会吗?;";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 5;
    }
}
