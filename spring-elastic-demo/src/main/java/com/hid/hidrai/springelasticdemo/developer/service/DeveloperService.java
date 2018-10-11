package com.hid.hidrai.springelasticdemo.developer.service;

import com.hid.hidrai.springelasticdemo.developer.model.Developer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

/**
 * Created by Hidrai on 10/10/2018.
 */
public interface DeveloperService
{
    Developer save(Developer developer);
    void delete(Developer developer);
    Optional<Developer> findById(String id);
    Iterable<Developer> findAll();
    List<Developer> findByName(String name);
    List<Developer> findByEmail(String email);
    List<Developer> findBySpec (String spec);

}
