package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 17588
 * @version 1.0
 * @description: TODO
 * @date 2024/2/19 10:47
 */
@RunWith(SpringRunner.class)
@ContextConfiguration
@SpringBootTest
public class RedisIstributedLockApplicationTests {
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Test
    public void testSelect() {
        System.out.println(redisTemplate);
    }
}
