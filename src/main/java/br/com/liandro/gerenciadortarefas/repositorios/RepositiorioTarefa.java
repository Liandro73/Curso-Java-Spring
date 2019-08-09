package br.com.liandro.gerenciadortarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.liandro.gerenciadortarefas.modelos.Tarefa;

public interface RepositiorioTarefa extends JpaRepository<Tarefa, Long> {

}