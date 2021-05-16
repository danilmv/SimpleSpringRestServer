package com.example.MySpringRestServer.controller;

import com.example.MySpringRestServer.dao.SomeDataRepository;
import com.example.MySpringRestServer.model.SomeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mydata")
public class SomeDataController {

    @Autowired
    SomeDataRepository service;

    @GetMapping
    public List<SomeData> getAll() {
        Iterable<SomeData> data = service.findAll();
        List<SomeData> target = new ArrayList<>();
        data.forEach(target::add);
        return target;
    }

    @PostMapping("/add")
    public void addSomeData(@RequestBody SomeData dao) {
        service.save(dao);
    }
}
