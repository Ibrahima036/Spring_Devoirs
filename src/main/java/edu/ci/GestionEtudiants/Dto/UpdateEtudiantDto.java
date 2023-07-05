package edu.ci.GestionEtudiants.Dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class UpdateEtudiantDto {
    private String firstname;
    private String lastname;
    private String matricule;
    private String licence;
    private Long id;
}
