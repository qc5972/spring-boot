package com.qc.springboot.service;

import com.qc.springboot.entities.Test;

/**
 * @author qc
 * @create 2020-02-20 17:51
 */
public interface TestService {
    Test getById(Integer id);

    void updateById(int i,String name);
}
