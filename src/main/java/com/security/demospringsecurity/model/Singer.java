package com.security.demospringsecurity.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Singer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameSinger;
    private String information;
    private String singerAvatar;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="singer_song",
    joinColumns = @JoinColumn(name = "singer_id"),
    inverseJoinColumns = @JoinColumn(name="song_id"))
    private List<Song> songs;
    @OneToOne
    @JoinColumn
    private User user;
    private Date dateUpload;

    public Singer() {
    }

    public Singer(String nameSinger, String information, String singerAvatar, List<Song> songs, User user, Date dateUpload) {
        this.nameSinger = nameSinger;
        this.information = information;
        this.singerAvatar = singerAvatar;
        this.songs = songs;
        this.user = user;
        this.dateUpload = dateUpload;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getSingerAvatar() {
        return singerAvatar;
    }

    public void setSingerAvatar(String singerAvatar) {
        this.singerAvatar = singerAvatar;
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

    public Date getDateUpload() {
        return dateUpload;
    }

    public void setDateUpload(Date dateUpload) {
        this.dateUpload = dateUpload;
    }
}
