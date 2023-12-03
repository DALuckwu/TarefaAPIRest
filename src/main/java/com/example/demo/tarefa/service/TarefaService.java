package com.example.demo.tarefa.service;

import java.util.List;

import com.example.demo.tarefa.entitie.Tarefa;

public interface TarefaService {
    List<Tarefa> getAllTarefas();
    Tarefa getTarefaById(int id);
    Tarefa createTarefa(Tarefa tarefa);
    Tarefa updateTarefa(int id, Tarefa tarefa);
    void deleteTarefa(int id);
}

