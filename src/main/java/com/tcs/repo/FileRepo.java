package com.tcs.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.entity.FileData;

public interface FileRepo  extends JpaRepository<FileData, Long>{
	
    Optional<FileData> findByName(String fileName);


}
