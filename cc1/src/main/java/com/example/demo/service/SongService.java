package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.SongDetails;
import com.example.demo.repository.SongPaging;
import com.example.demo.repository.SongRepo;


@Service

public class SongService{

	@Autowired
	private SongRepo repo;
	@Autowired
	private SongPaging r;
	
	public SongDetails addSong(SongDetails obj)
	{
		return repo.save(obj);
	}
	
	public List<SongDetails>getSong()
	{
		Pageable p = PageRequest.of(0, 2);
		Page<SongDetails> s = r.findAll(p);
		return s.toList();
	}
	public void deleteSongNameById(int id)
    {
   	 repo.deleteById(id);
    }
    
  public  SongDetails update(int id,SongDetails s) 
  {
	   return repo.saveAndFlush(s);
  }
  
  public List<SongDetails> sort(){
		List<SongDetails>list=repo.findAll(Sort.by(Sort.Direction.ASC,"artistname"));
		return list;
	}
  
  
	
	
}