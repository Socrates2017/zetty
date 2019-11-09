package com.zrzhen.zetty.thread;

import com.zrzhen.zetty.dao.UserLoginLogDao;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenanlian
 *
 * 通过异步线程持久化登陆日志
 */
public class UserLoginThread implements Runnable {

    long userId;

    public UserLoginThread(long userId) {
        this.userId = userId;
    }

    @Override
    public void run() {
        Map<String, Object> value = new HashMap<>(3);
        value.put("user_id", userId);
        UserLoginLogDao.insert(UserLoginLogDao.tableName, value);

    }
}
