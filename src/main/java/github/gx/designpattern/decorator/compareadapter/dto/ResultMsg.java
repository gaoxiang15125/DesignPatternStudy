package github.gx.designpattern.decorator.compareadapter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: design-study
 * @description: 返回结果描述信息
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-25 15:46
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultMsg {

    private int code;
    private String msg;
    private Object data;
}
