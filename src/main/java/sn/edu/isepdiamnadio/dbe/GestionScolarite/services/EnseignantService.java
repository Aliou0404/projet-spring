package sn.edu.isepdiamnadio.dbe.GestionScolarite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.entities.Enseignant;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.repositories.EnseignantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EnseignantService {
    @Autowired
    private EnseignantRepository enseignantRepository;

    public List<Enseignant> findAll() {
        return enseignantRepository.findAll();
    }

    public Enseignant findById(int id) {

        Optional<Enseignant> resultat = enseignantRepository.findById(id);

        if (resultat.isPresent()) {
            return resultat.get();
        } else {
            return enseignantRepository.findById(id).get();
        }
    }

    public void save(Enseignant enseignant) {
        enseignantRepository.save(enseignant);
    }

    public void deleteEnseignantById(int id) {
        enseignantRepository.deleteById(id);

    }
}