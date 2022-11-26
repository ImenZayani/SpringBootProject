package tn.esprit._3cinfogl1.springbootproject.DAO.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit._3cinfogl1.springbootproject.DAO.Entities.Etudiant;

public interface EtudiantRepo extends CrudRepository<Etudiant , Long> {
}
