package sn.edu.isepdiamnadio.dbe.GestionScolarite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.entities.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant,Integer> {
}
