package com.example.cp2java.controller;

import com.example.cp2java.model.Brinquedo;
import com.example.cp2java.service.BrinquedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("brinquedos")
public class BrinquedoController {

    @Autowired
    BrinquedoService service;

    @GetMapping("/{id}")
    public Brinquedo buscarId(@PathVariable int id) {
        return service.getBrinquedo(id);
    }

    @PostMapping
    public Brinquedo salvar(@RequestBody Brinquedo brinquedo) {
        return service.setBrinquedo(brinquedo);
    }

    @DeleteMapping("/{id}")
    public Brinquedo deletar(@PathVariable int id) {
        return service.deleteBrinquedo(id);
    }
    @PutMapping("/{id}")
    @ResponseStatus(CREATED)
    public Brinquedo atualizar(@PathVariable int id, @RequestBody Brinquedo brinquedo) {
        return service.save(brinquedo);
    }

}
