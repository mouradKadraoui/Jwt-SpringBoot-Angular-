package com.example.security.etudiant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etudiant")
@CrossOrigin("*")
public class EtudiantController {

    @Autowired
    private  EtudiantService etudiantService;
    @GetMapping("/list")
    public List<Etudiant> getEtudiant(){
      return   etudiantService.getEtudiant();
    }

    @PostMapping("/ajouter")
    public Etudiant saveEtudiant(Etudiant e){
        return  etudiantService.saveEtudiant(e);
    }
}
