package com.frame.core.impl;

import com.frame.core.domain.BaseEntity;
import com.frame.core.mapper.BaseMapper;
import com.frame.core.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/5/12.
 */
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class BaseServiceImpl<Dao extends BaseMapper<T>, T extends BaseEntity<T>> implements BaseService<T> {

    @Autowired
    protected Dao dao;


    public T get(String uuid) {
        return dao.get(uuid);
    }
}
