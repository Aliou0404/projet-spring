package sn.edu.isepdiamnadio.dbe.GestionScolarite.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.entities.Apprenant;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.entities.Formateurs;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.services.ApprenantService;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.services.FormateurService;

import java.util.List;

@RestController
@RequestMapping("/formateur")
public class FormateurController {
    @Autowired
    private FormateurService formateurService;
    @GetMapping
    public List<Formateurs> findAll(){
        return formateurService.findAll();
    }

    @GetMapping("/{id}")
    public Formateurs findById(@PathVariable int id){

        System.out.println("Recherde du formateur dont l'id est "+id);

        return formateurService.findById(id);
    }
    @PostMapping

    public void create(@RequestBody Formateurs formateurs){
        formateurService.save(formateurs);
    }
    @PutMapping
    public  Formateurs update(@RequestBody Formateurs formateurs){
        formateurService.save(formateurs);
        return formateurs;
    }
    @DeleteMapping("/{id}")

    public void deleteFormateurById(@PathVariable int id){
        formateurService.deleteFormateurById(id);

    }

}