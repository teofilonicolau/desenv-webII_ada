package tech.ada.todolist.todo;

import org.springframework.data.repository.CrudRepository;

public interface TarefaRepository extends CrudRepository<Tarefa, Integer> {
}