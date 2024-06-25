package com.example.security.etudiant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {


    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<Etudiant> getEtudiant(){
       return etudiantRepository.findAll();
    }

    public Etudiant saveEtudiant(Etudiant e) {
        return (Etudiant) etudiantRepository.save(e);
    }

}
