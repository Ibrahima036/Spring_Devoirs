package edu.ci.GestionEtudiants.controller;

import edu.ci.GestionEtudiants.Dto.EtudiantDto;
import edu.ci.GestionEtudiants.Dto.UpdateEtudiantDto;
import edu.ci.GestionEtudiants.entity.Etudiant;
import edu.ci.GestionEtudiants.services.ServiceEtudiant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class EtudiantController {
    private final ServiceEtudiant serviceEtudiant;

    @GetMapping("/find/{id}")
    public Etudiant findEtudiantById(@PathVariable long id) {
        return serviceEtudiant.findEtudiantById(id);
    }

    @GetMapping("/findAll")
    public List<Etudiant> getEtudiant() {
        return serviceEtudiant.getAllEtudiants();
    }

    @PostMapping("/add")
    public void addEtudiant(@RequestBody EtudiantDto dto) {
        serviceEtudiant.createEtudiant(dto);
    }

    @PutMapping("/update")
    public void updateEtudiant(@RequestBody UpdateEtudiantDto dto) {
         serviceEtudiant.updateEtudiant(dto);
    }
    @GetMapping("findmat/{matricule}")
    public Etudiant findByMatricule(@PathVariable String matricule){
        return serviceEtudiant.findByMatricule(matricule);
    }


}
