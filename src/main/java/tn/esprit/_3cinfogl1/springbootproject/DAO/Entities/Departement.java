package tn.esprit._3cinfogl1.springbootproject.DAO.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDepartement;
    private String nomDepartement;

    @OneToMany (mappedBy = "dep")
    List<Etudiant> etudiants;

}
