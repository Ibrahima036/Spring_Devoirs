package edu.ci.GestionEtudiants.Repository;

import edu.ci.GestionEtudiants.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    @Query
    public Etudiant findByMatricule(String matricule);
}
