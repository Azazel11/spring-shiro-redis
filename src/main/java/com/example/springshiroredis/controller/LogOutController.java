package com.example.springshiroredis.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

@RestController
@RequestMapping("/out")
public class LogOutController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @PostMapping("/logout")
    public void logout(){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        String sessionId = (String)session.getId();
        logger.info("sessionId{}",sessionId);
        JedisShardInfo  shardInfo = new JedisShardInfo("redis://127.0.0.1:6379");
        shardInfo.setPassword("12345");
        Jedis jedis = new Jedis(shardInfo);
        long jedis_key = jedis.del("shiro:session:"+sessionId);
        logger.info("jedis_key{}",jedis_key);
        logger.info("--------数据已经删除--------");
    }
}
