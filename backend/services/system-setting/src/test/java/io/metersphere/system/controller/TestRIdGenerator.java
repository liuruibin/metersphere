package io.metersphere.system.controller;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.redisson.Redisson;
import org.redisson.api.RIdGenerator;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestRIdGenerator {
    @Resource
    private Redisson redisson;

    @Test
    public void testId1() throws Exception {
        String projectId = "projectId";
        RIdGenerator idGenerator = redisson.getIdGenerator(projectId);
        long capacity = 1000000; // 容量，代表每个项目最多可以生成多少个id
        long init = 1000000_1000001L; // 代表从100_0000_100_0001开始，项目的num
        idGenerator.tryInit(init, capacity);
        long nextId = idGenerator.nextId();
        Assertions.assertEquals(nextId, init);
//        for (int i = 0; i < capacity; i++) {
//            long nextId = idGenerator.nextId();
//        }
    }
}
