package com.example.demo.Controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.SongDetails;
import com.example.demo.service.SongService;


@RestController
public class Controllers {
	@Autowired
	private SongService serve;
	@PostMapping("/add")
	public SongDetails postSong(@RequestBody SongDetails song)
	{
		return serve.addSong(song);
	}
	
	@GetMapping("/show")
	public List<SongDetails> showEmp()
	{
		
		List<SongDetails> a = new ArrayList<>();
		a = serve.getSong();
		return a;
	
	}
	
	@GetMapping("/showsortview")
    public List<SongDetails> getSortedDetails()
    {
    	return serve.sort();
    }
	

	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		try {
	        serve.deleteSongNameById(id);
} catch (Exception e) {
	        System.out.println("Failed delete operation");
	    }
	}
	@PutMapping("/update/{id}")
      public  SongDetails  update(@PathVariable int id,@RequestBody SongDetails s) {
		try {
	        SongDetails updatedSong = serve.update(id, s);
	        System.out.println("Successful update operation");
	        return  serve.update(id, s);
	    } catch (Exception e) {
	        System.out.println("Failed update operation");
	        return serve.update(id, s);
	    }
      }
	
}

