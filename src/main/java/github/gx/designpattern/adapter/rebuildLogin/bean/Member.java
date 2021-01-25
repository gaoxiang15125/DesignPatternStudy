package github.gx.designpattern.adapter.rebuildLogin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: design-study
 * @description: 登录用户信息存储类
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-25 17:09
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private String username;
    private String password;
    private String mid;
    private String info;
}
