package com.tang.springcloud.service.impl;

import com.tang.springcloud.dao.DeptDao;
import com.tang.springcloud.entity.Dept;
import com.tang.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @creat 2019-07-16-20:39
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao ;



    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }

}
