package sn.edu.isepdiamnadio.dbe.GestionScolarite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.entities.Apprenant;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.entities.Formateurs;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.repositories.ApprenantRepository;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.repositories.FormateurRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FormateurService {
    @Autowired
    private FormateurRepository formateurRepository;
    public List<Formateurs> findAll(){
        return  formateurRepository.findAll();
    }
    public Formateurs findById(int id){

        Optional<Formateurs> resultat = formateurRepository.findById(id);

        if (resultat.isPresent()){
            return resultat.get();
        }
        else {
            return formateurRepository.findById(id).get();
        }
    }
    public void save(Formateurs formateurs){
        formateurRepository.save(formateurs);
    }

    public void deleteFormateurById(int id){
        formateurRepository.deleteById(id);

    }
}
