package tn.esprit._3cinfogl1.springbootproject.DAO.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEquipe;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @OneToOne
    private  DetailsEquipe d;

    @ManyToMany
    List<Etudiant> etudiants;

    @ManyToOne
    Departement departement;
}
