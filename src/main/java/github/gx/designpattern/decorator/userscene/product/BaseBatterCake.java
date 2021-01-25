package github.gx.designpattern.decorator.userscene.product;

/**
 * @program: design-study
 * @description: 初始基本煎饼类，定义煎饼价格为 6 块
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-25 11:24
 **/
public class BaseBatterCake extends BatterCake {
    @Override
    public String getMsg() {
        return "煎饼一个;";
    }

    @Override
    public int getPrice() {
        return 6;
    }
    // 真是 物价飞涨，年与日趋，悲守穷庐
    // 一个 6 块，荒诞吧
}
