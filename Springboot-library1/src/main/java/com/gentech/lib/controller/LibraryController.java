package com.gentech.lib.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.lib.entity.Library;
import com.gentech.lib.service.LibraryService;

@RestController
@RequestMapping("/v2/api2")

public class LibraryController {
       private LibraryService libService;
       public LibraryController(LibraryService libService)
       {
    	   super();
    	   this.libService=libService;
       }
       
       @GetMapping("/library")
       public List<Library>getAllLibrary()
       {
    	   return libService.getLibrary();
       }
       
       @GetMapping("/library/{id}")
       public Library getLibrary(@PathVariable Long id) throws Exception
       {
    	   return libService.getParticularLibrary(id);
       }
       
       @PostMapping("/library")
       public Library saveLibrary(@RequestBody Library library)
       {
    	   return libService.createLibrary(library);
       }
       
       @PutMapping("/library/{id}")
       public Library updateSpecificLibrary(@PathVariable Long id,@RequestBody Library library)
       {
    	   library.setId(id);
    	   return libService.updateLibrary(library);
       }
       
       @DeleteMapping("/library/{id}")
       public String deleteSpecificLibrary(@PathVariable Long id)
       {
    	   libService.deleteLibrary(id);
    	   return "The Book with id value "+id+" has deleted successfully";
       }
}
