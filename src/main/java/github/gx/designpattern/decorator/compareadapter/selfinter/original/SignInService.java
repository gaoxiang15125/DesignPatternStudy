package github.gx.designpattern.decorator.compareadapter.selfinter.original;

import github.gx.designpattern.decorator.compareadapter.dto.Member;
import github.gx.designpattern.decorator.compareadapter.dto.ResultMsg;
import github.gx.designpattern.decorator.compareadapter.selfinter.ISignInService;

/**
 * @program: design-study
 * @description: 登录服务实现类
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-25 15:53
 **/
public class SignInService implements ISignInService {

    /**
     * 简单的实现了对应接口，等于说仅支持一种形式的登录操作
     * 也没有什么明显的扩展性，简单的判断逻辑而已
     */

    @Override
    public ResultMsg register(String userName, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    @Override
    public ResultMsg login(String userName, String password) {
        // 其实可以试着用 Redis + Shiro 实现登录判断逻辑的
        // 不过着实没有必要，就这样就可以了
        return null;
    }
}
