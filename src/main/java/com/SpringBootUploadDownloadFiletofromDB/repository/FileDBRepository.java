package com.SpringBootUploadDownloadFiletofromDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootUploadDownloadFiletofromDB.models.FileDB;

public interface FileDBRepository extends JpaRepository<FileDB, String>{

}
