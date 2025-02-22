package com.gentech.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.lib.entity.Library;

public interface LibraryRepository extends JpaRepository<Library,Long> {

}
