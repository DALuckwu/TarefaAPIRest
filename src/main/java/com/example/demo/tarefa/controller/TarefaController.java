package com.example.demo.tarefa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.tarefa.entitie.Tarefa;
import com.example.demo.tarefa.service.TarefaService;

import java.util.List;

@RestController
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> getAllTarefas() {
        return tarefaService.getAllTarefas();
    }

    @GetMapping("/{id}")
    public Tarefa getTarefaById(@PathVariable int id) {
        return tarefaService.getTarefaById(id);
    }

    @PostMapping
    public Tarefa createTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.createTarefa(tarefa);
    }

    @PutMapping("/{id}")
    public Tarefa updateTarefa(@PathVariable int id, @RequestBody Tarefa tarefa) {
        return tarefaService.updateTarefa(id, tarefa);
    }

    @DeleteMapping("/{id}")
    public void deleteTarefa(@PathVariable int id) {
        tarefaService.deleteTarefa(id);
    }
}

