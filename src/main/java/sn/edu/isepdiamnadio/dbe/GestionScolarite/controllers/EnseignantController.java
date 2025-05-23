package sn.edu.isepdiamnadio.dbe.GestionScolarite.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.entities.Enseignant;
import sn.edu.isepdiamnadio.dbe.GestionScolarite.services.EnseignantService;

import java.util.List;

@RestController
@RequestMapping("/enseignant")
public class EnseignantController {
    @Autowired
    private EnseignantService enseignantService;
    @GetMapping
    public List<Enseignant> findAll(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return enseignantService.findAll();
    }

    @GetMapping("/{id}")
    public Enseignant findById(@PathVariable int id){

        System.out.println("Recherde l'enseignant dont l'id est "+id);

        return enseignantService.findById(id);
    }
    @PostMapping

    public void create(@RequestBody Enseignant enseignant){
        enseignantService.save(enseignant);
    }
    @PutMapping
    public  Enseignant update(@RequestBody Enseignant enseignant){
        enseignantService.save(enseignant);
        return enseignant;
    }
    @DeleteMapping("/{id}")

    public void deleteEnseignantById(@PathVariable int id){
        enseignantService.deleteEnseignantById(id);

    }

}
