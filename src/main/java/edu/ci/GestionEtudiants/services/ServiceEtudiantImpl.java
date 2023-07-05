package edu.ci.GestionEtudiants.services;

import edu.ci.GestionEtudiants.Repository.EtudiantRepository;
import edu.ci.GestionEtudiants.entity.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEtudiantImpl {
    private final EtudiantRepository etudiantRepository;

    public ServiceEtudiantImpl(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }


    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }


    public Etudiant findEtudiantById(Long id) {
        Optional<Etudiant> etudiant = etudiantRepository.findById(id);
        if (etudiant.isPresent()) {
            return etudiant.get();
        } else {
            return null;
        }

    }

    public Etudiant createEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    public Etudiant updateEtudiant(Etudiant etudiant) {
        Optional<Etudiant> etudiantOptional = etudiantRepository.findById(etudiant.getId());
        if (etudiantOptional.isPresent()) {
            return null;
        } else {
            return etudiantRepository.save(etudiant);
        }

    }

    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }
}
