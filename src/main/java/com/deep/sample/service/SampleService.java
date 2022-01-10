package com.deep.sample.service;

import com.deep.sample.model.Problem;

import javax.annotation.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class SampleService {
    private static final List<Problem> PROBLEM_LIST;
    static {
        PROBLEM_LIST = new ArrayList<>();
        PROBLEM_LIST.add(new Problem("Abc", "Cde"));
        PROBLEM_LIST.add(new Problem("Efg", "Ghi"));
    }

    /**
     * it is getproblembyid.
     * @param index
     * @return it is returning value.
     */

    public Problem getProblemById(Integer index) {
        if (index < PROBLEM_LIST.size()) {
            return  PROBLEM_LIST.get(index);
        }
        return null;
    }
}
