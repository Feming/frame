import com.alibaba.fastjson.JSON;
import com.frame.core.domain.user.User;
import com.frame.core.service.user.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Fengmy on 2017/4/28.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})

public class UserTest {

    private static Logger logger = Logger.getLogger(UserTest.class);

    @Resource
    private UserService userService = null;

    @Test
    public void test1(){
        User user = userService.get("03e079282ed64d349504ec64dafd856f");
        logger.info(JSON.toJSONString(user));
    }

}
