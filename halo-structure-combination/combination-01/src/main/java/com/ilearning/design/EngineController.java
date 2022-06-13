package com.ilearning.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 非设计模式下的业务实现
 *
 * @author yuwenbo
 * @date 2022/6/14 6:18
 **/
public class EngineController {
    private Logger logger = LoggerFactory.getLogger(EngineController.class);

    public String process(String userId, String userSex, int userAge) {

        logger.info("ifelse实现方式判断用户结果。userId：{} userSex：{} userAge：{}", userId, userSex, userAge);

        if ("man".equals(userSex)) {
            if (userAge < 25) {
                return "果实A";
            }

            if (userAge >= 25) {
                return "果实B";
            }
        }

        if ("woman".equals(userSex)) {
            if (userAge < 25) {
                return "果实C";
            }

            if (userAge >= 25) {
                return "果实D";
            }
        }

        return null;

    }
}
