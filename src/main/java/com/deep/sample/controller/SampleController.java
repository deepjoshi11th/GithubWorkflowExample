package com.deep.sample.controller;

import com.deep.sample.model.Problem;
import com.deep.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;
    @GetMapping("/api/data/{index}")
    public ResponseEntity<Problem> serveData(@PathVariable int index) {
        if (index < 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Problem problem = sampleService.getProblemById(index);
        return new ResponseEntity<>(problem, HttpStatus.OK);
    }

}
