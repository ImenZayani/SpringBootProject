package tn.esprit._3cinfogl1.springbootproject.DAO.Entities;

import javax.persistence.*;

@Entity
public class DetailsEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailsEquipe;
    private Integer salle;
    private String thematique;

    @OneToOne(mappedBy = "d")
    private  Equipe e;
}
