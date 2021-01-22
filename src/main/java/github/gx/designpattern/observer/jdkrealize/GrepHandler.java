package github.gx.designpattern.observer.jdkrealize;

import github.gx.designpattern.observer.jdkrealize.dto.Teacher;
import github.gx.designpattern.observer.jdkrealize.dto.bean.Question;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Observable;

/**
 * @program: design-study
 * @description: 订阅模式 发布者实现
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-22 16:04
 **/
@Data
@Slf4j
public class GrepHandler extends Observable {

    private String grepName = "JDK notify Object";
    private static GrepHandler grepHandler;

    private GrepHandler() {}

    public static GrepHandler getInstance() {
        if(null == grepHandler) {
            grepHandler = new GrepHandler();
        }
        return grepHandler;
    }

    public void notifyQuestionToTeacher(Question question) {
        log.info("发布者:[{}] 收到了问题 [{}], 并尝试通知其订阅者", this.grepName, question.getQuestionName());
        setChanged();
        notifyObservers(question);
    }

    public static void main(String[] args) {
        Question question = new Question("失之毫厘，谬之千里", "高翔");
        // 创建两个订阅者，用来接收发布者发送的消息
        Teacher teacherOne = new Teacher("学徒的心");
        Teacher teacherTwo = new Teacher("无极之道");
        GrepHandler grepHandler = GrepHandler.getInstance();
        grepHandler.addObserver(teacherOne);
        grepHandler.addObserver(teacherTwo);
//        grepHandler.setChanged();
//        grepHandler.notifyAll();

        grepHandler.notifyQuestionToTeacher(question);
    }
}
