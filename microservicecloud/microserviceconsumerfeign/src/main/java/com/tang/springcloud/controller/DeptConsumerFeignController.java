package com.tang.springcloud.controller;

import com.tang.springcloud.entity.Dept;
import com.tang.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author shkstart
 * @creat 2019-07-16-21:41
 */
@RestController
public class DeptConsumerFeignController {

    @Autowired
    private DeptClientService service = null;

    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return service.add(dept);
    }

    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list()
    {

        return service.list();
    }

}
