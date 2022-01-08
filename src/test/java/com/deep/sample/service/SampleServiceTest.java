package com.deep.sample.service;

import com.deep.sample.model.Problem;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SampleServiceTest {
    @Autowired
    private SampleService sampleService;
    @Test
    public void testGetUser() {
        Problem problem = sampleService.getProblemById(0);
        assert problem.getTitle()=="Abc";
    }
}
