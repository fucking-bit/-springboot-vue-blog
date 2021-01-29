package com.huang;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

@SpringBootTest
class VueblogApplicationTests {

    @Test
    void contextLoads() {
        Jedis jedis = new Jedis("8.131.240.13", 6379);
        System.out.println(jedis.ping());
    }

}
