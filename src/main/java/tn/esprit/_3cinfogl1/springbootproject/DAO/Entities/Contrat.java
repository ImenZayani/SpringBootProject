package tn.esprit._3cinfogl1.springbootproject.DAO.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="T_contrat")
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContrat;
    @Temporal(TemporalType.DATE)
    private Date dateDebutC;
    @Temporal(TemporalType.DATE)
    private Date dateFinC;
    private Boolean archive;
    private float montantC;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    @ManyToOne
    private Etudiant etudiant;
}
