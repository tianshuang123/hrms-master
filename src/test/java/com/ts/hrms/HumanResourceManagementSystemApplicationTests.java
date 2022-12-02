package com.ts.hrms;

import com.ts.hrms.bean.Emp;
import com.ts.hrms.service.IEmpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

@SpringBootTest
class HumanResourceManagementSystemApplicationTests {

    @Autowired
    IEmpService empService;

    @Autowired
    RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
        String name = "张三";
        List<Emp> emps = empService.query(name);
        for(Emp emp:emps){
            System.out.println(emp);
        }
    }

    @Test
    public void testRedis(){
        redisTemplate.opsForValue().set("name","卷心菜");
        String name = (String) redisTemplate.opsForValue().get("name");
        System.out.println(name);

        redisTemplate.delete("name");
        String name1 = (String) redisTemplate.opsForValue().get("name");
        System.out.println(name1);
    }

}
