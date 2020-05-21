package com.security.demospringsecurity.message.request;



import com.security.demospringsecurity.model.Song;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public class CreatePlaylistForm {

    private String namePlaylist;

    private List<Song> songs;

    private User user;

    public CreatePlaylistForm() {
    }


//    public CreatePlaylistForm(String namePlaylist, List<Song> songs, User user) {
//        this.namePlaylist = namePlaylist;
//        this.songs = songs;
//        this.user = user;
//    }

    public String getNamePlaylist() {
        return namePlaylist;
    }

    public void setNamePlaylist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}