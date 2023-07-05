package edu.ci.GestionEtudiants.services;

import edu.ci.GestionEtudiants.entity.Etudiant;

import java.util.List;

public interface ServiceEtudiant {
    public List<Etudiant> getAllEtudiants();
    public Etudiant getEtudiant(Long id);
    public Etudiant createEtudiant(Etudiant etudiant);
    public Etudiant updateEtudiant(Etudiant etudiant);
    public void deleteEtudiant(Long id);
}
