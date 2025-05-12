package sn.edu.isepdiamnadio.dbe.GestionScolarite.startups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.entities.Apprenant;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.repositories.ApprenantRepository;

@Component
public class InitApprenant implements CommandLineRunner {
    @Autowired
    private ApprenantRepository apprenantRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("######## Initialisation des apprenants");

        Apprenant apprenant = new Apprenant();
        apprenant.setPrenom("Aliou");
        apprenant.setNom("Diop");
        apprenantRepository.save(apprenant);

        Apprenant apprenant2 = new Apprenant();
        apprenant2.setPrenom("Omar");
        apprenant2.setNom("Keita");
        //apprenant.setId(2);
        apprenantRepository.save(apprenant2);

        Apprenant apprenant3 = new Apprenant();
        apprenant3.setPrenom("Bineta");
        apprenant3.setNom("Dieng");
        //apprenant.setId(3);
        apprenantRepository.save(apprenant3);

    }


}
