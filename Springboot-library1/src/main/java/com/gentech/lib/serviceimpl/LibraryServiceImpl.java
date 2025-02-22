package com.gentech.lib.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gentech.lib.entity.Library;
import com.gentech.lib.repository.LibraryRepository;
import com.gentech.lib.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {
private LibraryRepository libRepository;
public LibraryServiceImpl(LibraryRepository libRepository)
{
	super();
	this.libRepository=libRepository;
}

	@Override
	public List<Library> getLibrary() {
		// TODO Auto-generated method stub
		return libRepository.findAll();
	}

	@Override
	public Library getParticularLibrary(Long id) throws Exception {
		// TODO Auto-generated method stub
		Optional<Library> lib=libRepository.findById(id);
		if(lib.isPresent())
		{
			return lib.get();
		}
		throw new Exception("The Book id "+id+" has not available in the database table");
	}

	@Override
	public Library createLibrary(Library library) {
		// TODO Auto-generated method stub
		return libRepository.save(library);
	}

	@Override
	public Library updateLibrary(Library library) {
		// TODO Auto-generated method stub
		return libRepository.save(library);
	}

	@Override
	public void deleteLibrary(Long id) {
		// TODO Auto-generated method stub
		libRepository.deleteById(id);
	}
       
}
