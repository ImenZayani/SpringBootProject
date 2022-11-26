package tn.esprit._3cinfogl1.springbootproject.DAO.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversity;
    private String nomUniversity;

    @OneToMany
    List<Departement> departements;

}
