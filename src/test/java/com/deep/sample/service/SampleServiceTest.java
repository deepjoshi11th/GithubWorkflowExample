package com.deep.sample.service;

import com.deep.sample.model.Problem;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SampleService.class)
public class SampleServiceTest {
    @Autowired
    private SampleService sampleService;

    /**
     * it is testGetUser method.
     */
    @Test
    public void testGetUser() {
        Problem problem = sampleService.getProblemById(0);
        assert problem.getTitle() == "Abc";
    }
}
