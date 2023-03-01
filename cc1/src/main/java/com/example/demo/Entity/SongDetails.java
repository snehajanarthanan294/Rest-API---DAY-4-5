package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Music")
public class SongDetails {
	@Id
    @Column(name="Id")
    private int id;
    
    @Column(name="SongName")
    private String songname;
    
    @Column(name="Artist")
    private String artistname;
    
    @Column(name="AlbumName")
    private String albumname;
    
    public int getId()
    {
    	return id;
    }
    public void setId(int id)
    {
    	this.id=id;
    }
    public String getSongName() {
        return songname;
    }

    public void setSongName(String songname) {
        this.songname = songname;
    }
    public String getArtist()
    {
    	return artistname;
    }
    public void setArtist(String artistname)
    {
    	this.artistname=artistname;
    }
    public String getAlbumName() 
    {
    	return albumname;
    }
    public void setAlbumName(String albumname) 
    {
    	this.albumname=albumname;
    }
    public SongDetails() {}
    public SongDetails(int id, String songname, String artistname,String albumname) {
		super();
		this.id = id;
		this.songname = songname;
		this.artistname = artistname;
		this.albumname=albumname;
	}
}