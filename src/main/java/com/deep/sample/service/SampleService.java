package com.deep.sample.service;

import com.deep.sample.model.Problem;

import javax.annotation.ManagedBean;
import java.util.ArrayList;

@ManagedBean
public class SampleService {
    private static ArrayList<Problem> problemList;
    static {
        problemList = new ArrayList<>();
        problemList.add(new Problem("Abc", "Cde"));
        problemList.add(new Problem("Def", "Ghi"));
    }

    /**
     * it is getproblembyid.
     * @param index
     * @return it is returning value.
     */

    public Problem getProblemById(Integer index) {
        if (index < problemList.size()) {
            return problemList.get(index);
        }
        return null;
    }
}
