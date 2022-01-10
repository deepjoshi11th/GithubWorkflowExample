package com.deep.sample.service;

import com.deep.sample.model.Problem;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest(classes = SampleService.class)
class SampleServiceTest {

    @Autowired
    private transient SampleService sampleService;

    /**
     * it is testGetUser method.
     */
    @Test
    void testGetUser() {
        Problem problem = sampleService.getProblemById(0);
        assertNotEquals(null, problem);
    }
}
