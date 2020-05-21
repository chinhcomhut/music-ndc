package com.security.demospringsecurity.repository;

import com.security.demospringsecurity.model.Singer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SingerRepository extends JpaRepository<Singer ,Long> {
    List<Singer> findAllByUserId (Long userId);
}