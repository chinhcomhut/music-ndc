package com.security.demospringsecurity.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameSong;
    private String singer;
    private String category;
    @ManyToOne
    @JoinColumn
    private User user;
        @Lob
    @Column(name = "lyrics", length = 51200)
    private String lyrics;
    private int likeSong;
    private int listenSong;
    private String avatarUrl;
    private String mp3Url;
    @Column(columnDefinition = "long")
    private String describes;

    public Song() {
    }

    public Song(String nameSong, String singer, String category, User user, String lyrics, int likeSong, int listenSong, String avatarUrl, String mp3Url, String describes) {
        this.nameSong = nameSong;
        this.singer = singer;
        this.category = category;
        this.user = user;
        this.lyrics = lyrics;
        this.likeSong = likeSong;
        this.listenSong = listenSong;
        this.avatarUrl = avatarUrl;
        this.mp3Url = mp3Url;
        this.describes = describes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public int getLikeSong() {
        return likeSong;
    }

    public void setLikeSong(int likeSong) {
        this.likeSong = likeSong;
    }

    public int getListenSong() {
        return listenSong;
    }

    public void setListenSong(int listenSong) {
        this.listenSong = listenSong;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getMp3Url() {
        return mp3Url;
    }

    public void setMp3Url(String mp3Url) {
        this.mp3Url = mp3Url;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

}
