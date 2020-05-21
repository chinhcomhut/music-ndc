package com.security.demospringsecurity.service.Impl;

import com.security.demospringsecurity.model.Singer;
import com.security.demospringsecurity.repository.SingerRepository;
import com.security.demospringsecurity.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SingerServiceImpl implements SingerService {

    @Autowired
    private SingerRepository singerRepository;

    @Override
    public List<Singer> findAll() {
        return singerRepository.findAll();
    }

    @Override
    public List<Singer> findAllByUserId(Long userId) {
        return singerRepository.findAllByUserId(userId);
    }

    @Override
    public Singer findByIdSinger(Long id) {
        return singerRepository.findById(id).get();
    }

    @Override
    public void save(Singer singer) {
        singerRepository.save(singer);
    }

    @Override
    public void delete(Long id) {
        singerRepository.deleteById(id);
    }
}