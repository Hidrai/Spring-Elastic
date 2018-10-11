package com.hid.hidrai.springelasticdemo.developer.service;

import com.hid.hidrai.springelasticdemo.developer.model.Developer;
import com.hid.hidrai.springelasticdemo.developer.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Hidrai on 10/10/2018.
 */
@Service
public class DeveloperServiceImpl implements DeveloperService
{
    private DeveloperRepository developerRepository;

    @Autowired
    public void setDeveloperRepository(DeveloperRepository developerRepository)
    {
        this.developerRepository = developerRepository;
    }

    @Override
    public Developer save(Developer developer) {
        return developerRepository.save(developer);
    }

    @Override
    public void delete(Developer developer) {
        developerRepository.delete(developer);
    }

    @Override
    public Optional<Developer> findById(String id) {
        return developerRepository.findById(id);
    }

    @Override
    public Iterable<Developer> findAll() {
        return developerRepository.findAll();
    }

    @Override
    public List<Developer> findByName(String name) {
        return developerRepository.findByName(name);
    }

    @Override
    public List<Developer> findByEmail(String email) {
        return developerRepository.findByEmail(email);
    }

    @Override
    public List<Developer> findBySpec(String spec) {
        return developerRepository.findBySpec(spec);
    }
}
