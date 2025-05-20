package sn.edu.isepdiamnadio.dbe.GestionScolarite.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.entities.Apprenant;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.services.ApprenantService;

import java.util.List;

@RestController
@RequestMapping("/apprenants")
@CrossOrigin("http://localhost:4200")
public class ApprenantController {
    @Autowired
    private ApprenantService apprenantService;
    @GetMapping
    public List<Apprenant> findAll(){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return apprenantService.findAll();
    }

    @GetMapping("/{id}")
    public Apprenant findById(@PathVariable int id){

        System.out.println("Recherde l'etudiant dont l'id est "+id);

        return apprenantService.findById(id);
    }
    @PostMapping

    public void create(@RequestBody Apprenant apprenant){
        apprenantService.save(apprenant);
    }
    @PutMapping
    public  Apprenant update(@RequestBody Apprenant apprenant){
        apprenantService.save(apprenant);
        return apprenant;
    }
    @DeleteMapping("/{id}")

    public void deleteApprenantById(@PathVariable int id){
        apprenantService.deleteApprenantById(id);

    }

}
