package com.gentech.lib.service;

import java.util.List;

import com.gentech.lib.entity.Library;

public interface LibraryService {

	List<Library> getLibrary();
	
	Library getParticularLibrary(Long id) throws Exception;
	
	Library createLibrary(Library library);
	
	Library updateLibrary(Library library);
	
	void deleteLibrary(Long id);
}
