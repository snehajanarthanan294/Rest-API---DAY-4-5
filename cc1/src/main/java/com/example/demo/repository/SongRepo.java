package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.SongDetails;

public interface SongRepo extends JpaRepository<SongDetails,Integer>{

}
