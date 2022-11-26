package tn.esprit._3cinfogl1.springbootproject.DAO.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Domaine domaine;

    @ManyToOne
    private  Departement dep;

    @ManyToMany (mappedBy = "etudiants")
    List <Equipe> equipes;

    @OneToMany(mappedBy="etudiant")
    List<Contrat> contrats;



}
