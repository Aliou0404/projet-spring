package sn.edu.isepdiamnadio.dbe.GestionScolarite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.entities.Apprenant;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.repositories.ApprenantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ApprenantService {
    @Autowired
    private ApprenantRepository apprenantRepository;
    public List<Apprenant> findAll(){
        return  apprenantRepository.findAll();
    }
    public Apprenant findById(int id){

        Optional<Apprenant> resultat = apprenantRepository.findById(id);

        if (resultat.isPresent()){
            return resultat.get();
        }
        else {
            return apprenantRepository.findById(id).get();
        }
    }
    public void save(Apprenant apprenant){
        apprenantRepository.save(apprenant);
    }

    public void deleteApprenantById(int id){
        apprenantRepository.deleteById(id);

    }

}
