package com.herman.demo.test.service.impl;

import com.herman.demo.test.dao.ITestDao;
import com.herman.demo.test.entity.Test;
import com.herman.demo.test.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by herman on 2017/11/28.
 */
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private ITestDao testDao;

    @Override
    public Test getTest(Long id) {
        return testDao.get(id);
    }
}
