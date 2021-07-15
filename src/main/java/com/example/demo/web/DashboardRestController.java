package com.example.demo.web;

import com.example.demo.dao.CountrieRepository;
import com.example.demo.entities.Countrie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@CrossOrigin("*")
public class DashboardRestController {
    @Autowired
    private CountrieRepository countryRepository;
    @GetMapping(path = "/flagPays/{id}",produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] imageFlag(@PathVariable(name="id") Long id)throws Exception{
        Countrie pays =countryRepository.findById(id).get();
        String flagPays = pays.getFlag_Countrie();
        File file = new File(System.getProperty("user.home")+"/DashBoardTest/images/"+flagPays);
        Path path = Paths.get(file.toURI());
        return Files.readAllBytes(path);
    }

    
    @GetMapping("/ListPays")
    public List<Countrie> countries(){
        return countryRepository.findAll();
    }

    
}
