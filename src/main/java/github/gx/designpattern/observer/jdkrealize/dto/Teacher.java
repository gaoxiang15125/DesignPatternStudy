package github.gx.designpattern.observer.jdkrealize.dto;

import github.gx.designpattern.observer.jdkrealize.GrepHandler;
import github.gx.designpattern.observer.jdkrealize.dto.bean.Question;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: design-study
 * @description: JDK 订阅模式 订阅者
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-22 16:05
 **/
@AllArgsConstructor
@Data
@Slf4j
public class Teacher implements Observer {

    private String teacherName;

    @Override
    public void update(Observable o, Object arg) {
        GrepHandler grepHandler = (GrepHandler) o;
        if(arg == null) {
            log.info("{} 接收到了一个空问题", teacherName);
            return;
        }
        Question question = (Question) arg;
        log.info("{} 收到了一个问题: {}, 提问者为: {}.", teacherName, question.getQuestionName(), question.getAuthor());
    }
}
