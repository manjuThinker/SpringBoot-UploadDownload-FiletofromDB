package com.SpringBootUploadDownloadFiletofromDB.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootUploadDownloadFiletofromDB.models.FileDB;

public interface FileDBRepository extends JpaRepository<FileDB, String>{
	
	
}
