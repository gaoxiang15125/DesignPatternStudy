package github.gx.designpattern.decorator.compareadapter.selfinter;

import github.gx.designpattern.decorator.compareadapter.dto.ResultMsg;

/**
 * @program: design-study
 * @description: 注册服务实现接口
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-25 15:48
 **/
public interface ISignInService {

    ResultMsg register(String userName, String password);

    ResultMsg login(String userName, String password);
}
