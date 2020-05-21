package com.security.demospringsecurity.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String playlistName;
    private String avatarPlaylist;
    @ManyToOne
    @JoinColumn
    private User user;
    @ManyToMany
    @JoinTable(name="play_list_song",
    joinColumns = @JoinColumn(name = "playlist_id"),
    inverseJoinColumns = @JoinColumn(name = "song_id"))
    private List<Song> songs;

    public Playlist() {
    }

    public Playlist(String playlistName, String avatarPlaylist, User user, List<Song> songs) {
        this.playlistName = playlistName;
        this.avatarPlaylist = avatarPlaylist;
        this.user = user;
        this.songs = songs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getAvatarPlaylist() {
        return avatarPlaylist;
    }

    public void setAvatarPlaylist(String avatarPlaylist) {
        this.avatarPlaylist = avatarPlaylist;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

}
