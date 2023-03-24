package com.demo.service.impl;

import com.demo.dao.AccountDao;
import com.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int transMoney(int from, int to, int money) {
        int rows=0;
        rows+=accountDao.transMoney(from, 0 - money);
        int i = 1/0;
        rows+=accountDao.transMoney(to, money);
        return rows;
    }
}
