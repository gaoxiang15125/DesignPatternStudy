package github.gx.designpattern.adapter.rebuildLogin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: design-study
 * @description: 返回信息存储实体类
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-25 17:06
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultMsg {

    private int code;
    private String msg;
    private Object data;
}
