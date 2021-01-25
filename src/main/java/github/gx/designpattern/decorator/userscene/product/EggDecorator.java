package github.gx.designpattern.decorator.userscene.product;

/**
 * @program: design-study
 * @description: 鸡蛋装饰者实现类
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-25 11:53
 **/
public class EggDecorator extends BatterCakeDecorator{

//    BatterCake batterCake;
    // 装配者模式可以理解为，在原始的对象外面包裹了一层又一层的对象，他们经过层层操作构成了我们想要的对象
    // 对于任何一个对象，其只添加了自己需要添加的东西，原始的对象并没有改变
    // 很明显，调用一个方法会同时吊起许多堆栈
    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected void doSomething() {}

    @Override
    public String getMsg() {
        // 这里无论是调用 父类的 getMsg 还是本身的 getMsg 应该都是一样的
//        return batterCake.getMsg() + "一个鸡蛋;我还有机会吗;";
        return super.getMsg() + "一个鸡蛋;我还有机会吗;";
    }

    // 使用 super 的原因 大概是保持结构的一致性，毕竟可能变量名称、类型会不同，但 super 是相同的
    @Override
    public int getPrice() {
        // 鸡蛋本来卖 1.5 因为是 int 向上取整算了
//        return batterCake.getPrice() + 2;
        return super.getPrice() + 2;
    }
}
