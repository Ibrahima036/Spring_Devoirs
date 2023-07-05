package edu.ci.GestionEtudiants.services;

import edu.ci.GestionEtudiants.Dto.EtudiantDto;
import edu.ci.GestionEtudiants.Dto.UpdateEtudiantDto;
import edu.ci.GestionEtudiants.Repository.EtudiantRepository;
import edu.ci.GestionEtudiants.entity.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEtudiant {
    private final EtudiantRepository etudiantRepository;

    public ServiceEtudiant(EtudiantRepository etudiantRepository) {
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

    public void createEtudiant(EtudiantDto etudiantDto) {
        Etudiant saveEtudiant = etudiantRepository.
                save( Etudiant.
                        builder().
                        lastname(etudiantDto.getLastname()).
                        firstname(etudiantDto.getFirstname()).
                        matricule(etudiantDto.getMatricule()).
                        licence(etudiantDto.getLicence()).
                        build());
    }

    public void updateEtudiant(UpdateEtudiantDto dto) {
        Etudiant etudiant = etudiantRepository.findById(dto.getId())
                .orElseThrow(()
                        -> new IllegalArgumentException("Invalid ID"));

        etudiant.setFirstname(dto.getFirstname());
        etudiant.setLastname(dto.getLastname());
        etudiant.setMatricule(dto.getMatricule());
        etudiant.setLicence(dto.getLicence());
    }

    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }

    public Etudiant findByMatricule(String matricule){
        return etudiantRepository.findByMatricule(matricule);
    }
}
