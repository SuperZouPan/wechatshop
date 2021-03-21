package com.imooc;

import com.imooc.sell.SellApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zoupan
 * @version 1.0
 * @date 2021-03-21 11:35
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= SellApplication.class)
public class TestLogger {

    private Logger logger=LoggerFactory.getLogger(TestLogger.class);

    @Test
    public  void test(){
        logger.debug("这是debug级别的日志");
        logger.info("这是info级别的日志");
        logger.error("这是error级别的日志");
    }
}
