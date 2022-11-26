package tn.esprit._3cinfogl1.springbootproject.DAO.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit._3cinfogl1.springbootproject.DAO.Entities.Departement;

public interface DepartementRepo extends CrudRepository <Departement,Long> {
}
