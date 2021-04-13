package weathermachine;

import java.util.ArrayList;
import java.util.List;

public interface BaseComment {

    List<BaseComment> MACHINE = new ArrayList<>();
    Integer TEMP = 5;
    Integer HUMIDITY = 65;
    Integer POWER = 65;

    /**
     * show 介绍
     *
     * @Param: ${tags}
     * @return: ${return_type}
     * @author <a href="mail to: *******@******.com" rel="nofollow">作者</a>
     * @CreateDate: ${date} ${time}</p>
     * @update: [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
     */
    Boolean getStatus();

    /**
     * show 介绍
     *
     * @Description: [功能描述]
     * @Param: ${tags}
     * @return: ${return_type}
     * @author <a href="mail to: *******@******.com" rel="nofollow">作者</a>
     * @CreateDate: ${date} ${time}</p>
     * @update: [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
     */
    void start();

}
