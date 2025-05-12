package sn.edu.isepdiamnadio.dbe.GestionScolarite.startups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.entities.Apprenant;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.entities.Formateurs;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.repositories.ApprenantRepository;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.repositories.FormateurRepository;

@Component
public class InitFormateur implements CommandLineRunner {
    @Autowired
    private FormateurRepository formateurRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("######## Initialisation des formateurs");

        Formateurs formateurs = new Formateurs();
        formateurs.setPrenom("Assane");
        formateurs.setNom("Fam");
        formateurRepository.save(formateurs);

        Formateurs formateurs2 = new Formateurs();
        formateurs2.setPrenom("Alamine");
        formateurs2.setNom("Mbengue");
        //apprenant.setId(2);
        formateurRepository.save(formateurs2);

        Formateurs formateurs3 = new Formateurs();
        formateurs3.setPrenom("Mouhamed");
        formateurs3.setNom("Der");
        //apprenant.setId(3);
        formateurRepository.save(formateurs3);

    }
}
