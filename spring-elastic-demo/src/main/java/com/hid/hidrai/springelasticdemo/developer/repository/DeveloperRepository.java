package com.hid.hidrai.springelasticdemo.developer.repository;

import com.hid.hidrai.springelasticdemo.developer.model.Developer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by Hidrai on 10/10/2018.
 */
public interface DeveloperRepository extends ElasticsearchRepository<Developer, String>
{
    List<Developer> findByName(String name);
    List<Developer> findByEmail(String email);
    List<Developer> findBySpec (String spec);

}
