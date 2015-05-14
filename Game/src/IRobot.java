import java.util.ArrayList;

/**
 * @decription 德州扑克机器人
 * @author Haibin Chen
 * @create 2015-5-13
 * @update 2015-5-13 22:43
 */


public interface IRobot {
    /**
     * @function 根据Message内容，构造出一个决策D(a,b,c,d,e)
     * @param: 现场消息
     * @return:ArrayList<Double> 决策decision
     * @create:2015-5-13
     * @update:
     */
    ArrayList<Double> messageHandle(Message msg);

    /**
     * 行动消息：check | call | raise num | all_in | fold eol
     * @function 生成行动消息
     * @param: IRobot
     * @return:String
     * @create:2015-5-13
     * @update:
     */
    String generateActionMessage(Message msg);
}
