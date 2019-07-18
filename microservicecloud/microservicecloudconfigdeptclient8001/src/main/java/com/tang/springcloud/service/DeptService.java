package com.tang.springcloud.service;

import com.tang.springcloud.entity.Dept;

import java.util.List;

/**
 * @author shkstart
 * @creat 2019-07-16-20:38
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();
}
