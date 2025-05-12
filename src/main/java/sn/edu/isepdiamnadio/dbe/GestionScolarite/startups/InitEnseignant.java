package sn.edu.isepdiamnadio.dbe.GestionScolarite.startups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.entities.Enseignant;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.repositories.EnseignantRepository;

@Component
public class InitEnseignant implements CommandLineRunner {
    @Autowired
    private EnseignantRepository enseignantRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("######## Initialisation des enseignants");

        Enseignant enseignant = new Enseignant();
        enseignant.setPrenom("Abdoulaye");
        enseignant.setNom("Mbaye");
        enseignantRepository.save(enseignant);

        Enseignant enseignant2 = new Enseignant();
        enseignant2.setPrenom("Birane");
        enseignant2.setNom("Koundoul");
        //apprenant.setId(2);
        enseignantRepository.save(enseignant2);

        Enseignant enseignant3 = new Enseignant();
        enseignant3.setPrenom("ALamine");
        enseignant3.setNom("Ndiaye");
        //apprenant.setId(3);
        enseignantRepository.save(enseignant3);

    }
}
