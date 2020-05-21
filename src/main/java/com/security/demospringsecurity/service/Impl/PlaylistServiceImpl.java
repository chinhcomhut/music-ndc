package com.security.demospringsecurity.service.Impl;

import com.security.demospringsecurity.model.Playlist;
import com.security.demospringsecurity.repository.PlaylistRepository;
import com.security.demospringsecurity.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PlaylistServiceImpl implements PlaylistService {

    @Autowired
    private PlaylistRepository playlistRepository;

    @Override
    public List<Playlist> findAllByUserId(Long userId) {
        return playlistRepository.findAllByUserId(userId);
    }

    @Override
    public List<Playlist> findAll() {
        return playlistRepository.findAll();
    }

    @Override
    public Optional<Playlist> findById(Long id) {
        return playlistRepository.findById(id);
    }

    @Override
    public Playlist findByIdPlaylist(Long id) {
        return playlistRepository.findById(id).get();
    }

    @Override
    public void updatePlaylist(Playlist playlist) {
playlistRepository.save(playlist);
    }

    @Override
    public void save(Playlist playlist) {
        playlistRepository.save(playlist);
    }

    @Override
    public void delete(Long id) {
        playlistRepository.deleteById(id);

    }

    @Override
    public Optional<Playlist> findAllByPlaylistNameContaining(String playlist_name) {
        return playlistRepository.findAllByPlaylistNameContaining(playlist_name);
    }

    @Override
    public Optional<Playlist> findAllByUserUsername(String user_name) {
        return playlistRepository.findAllByUserUsername(user_name);
    }
}