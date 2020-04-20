package com.example.service;

import com.example.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("jettydemo")
public interface StudentService {

    @RequestMapping("api/v1/selectOne/{id}")
    public Student selectOne(@PathVariable("id")Integer id);

    @RequestMapping("api/v1/addOne")
    public Student addOne(@RequestBody Student student);
}
