package com.security.demospringsecurity.service.Impl;

import com.security.demospringsecurity.model.Song;
import com.security.demospringsecurity.model.User;
import com.security.demospringsecurity.repository.SongRepository;
import com.security.demospringsecurity.security.service.UserDetailsServiceImpl;
import com.security.demospringsecurity.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongRepository songRepository;
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Override
    public Optional<Song> findByNameSongContaining(String song) {
        return songRepository.findByNameSongContaining(song);
    }

    @Override
    public List<Song> findAllByUserId(Long userId) {
        return songRepository.findAllByUserId(userId);
    }

    @Override
    public Optional<Song> findByMp3Url(String mp3Url) {
        return songRepository.findByMp3Url(mp3Url);
    }

    @Override
    public List<Song> findAllByOrderByLikeSong() {
        return songRepository.findAllByOrderByLikeSongDesc();
    }

    @Override
    public List<Song> findAllByOrderByListenSong() {
        return songRepository.findAllByOrderByListenSongDesc();
    }

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Optional<Song> findById(long id) {
        return songRepository.findById(id);
    }

    @Override
    public Song save(Song song) {
        System.out.println("ok");
        User user = userDetailsService.getCurrentUser();
        System.out.println(user);
        song.setUser(user);
        return songRepository.save(song);
    }

    @Override
    public void delete(long id) {
        songRepository.deleteById(id);
    }

    @Override
    public Song findByIdSong(Long id) {
        return songRepository.findById(id).get();
    }
}