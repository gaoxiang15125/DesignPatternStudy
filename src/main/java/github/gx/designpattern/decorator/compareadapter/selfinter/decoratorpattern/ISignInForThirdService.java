package github.gx.designpattern.decorator.compareadapter.selfinter.decoratorpattern;

import github.gx.designpattern.decorator.compareadapter.dto.ResultMsg;
import github.gx.designpattern.decorator.compareadapter.selfinter.ISignInService;

/**
 * @program: design-study
 * @description: 对原接口进行扩展，以实现多种登录方式
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-25 16:01
 **/
public interface ISignInForThirdService extends ISignInService {
    /**
     * QQ 登录
     * @param id 用户ID
     * @return
     */
    ResultMsg loginForQQ(String id);

    ResultMsg loginForWeChat(String id);

    ResultMsg loginForToken(String id);

    ResultMsg loginForTelPhone(String id);

    ResultMsg loginForRegister(String userName, String password);

}
