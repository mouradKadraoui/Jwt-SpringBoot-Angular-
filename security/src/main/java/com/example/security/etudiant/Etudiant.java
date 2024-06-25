package com.example.security.etudiant;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "etudiant")
public class Etudiant {

    @Id
    @GeneratedValue
    private int id;
    private String name ;
    private String adress;
}
