package edu.ci.GestionEtudiants.controller;

import edu.ci.GestionEtudiants.entity.Etudiant;
import edu.ci.GestionEtudiants.services.ServiceEtudiant;
import edu.ci.GestionEtudiants.services.ServiceEtudiantImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class EtudiantController {
    private final ServiceEtudiantImpl serviceEtudiant;

    @GetMapping("/{id}")
    public Etudiant getEtudiant(@PathVariable long id){
        return serviceEtudiant.getEtudiant(id);
    }
    @GetMapping("/all")
    public List<Etudiant> getEtudiant(){
        return serviceEtudiant.getAllEtudiants();
    }
    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant){
        return serviceEtudiant.createEtudiant(etudiant);
    }
    @PutMapping
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
        return serviceEtudiant.updateEtudiant(etudiant);
    }


}
