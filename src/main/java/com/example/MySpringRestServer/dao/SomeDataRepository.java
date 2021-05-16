package com.example.MySpringRestServer.dao;

import com.example.MySpringRestServer.model.SomeData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SomeDataRepository extends CrudRepository<SomeData, Long> {
}
