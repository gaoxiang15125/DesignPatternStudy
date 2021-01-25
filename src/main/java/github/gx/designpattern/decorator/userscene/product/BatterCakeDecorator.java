package github.gx.designpattern.decorator.userscene.product;

/**
 * @program: design-study
 * @description: 煎饼装饰者模式 父类
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-25 11:35
 **/
public abstract class BatterCakeDecorator extends BatterCake {
    // 看起来等于说创建了许多实例，并不是对一个实例进行组装得到的
    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    protected abstract void doSomething();

    @Override
    public String getMsg() {
        return batterCake.getMsg();
    }

    @Override
    public int getPrice() {
        return this.batterCake.getPrice();
    }
}
