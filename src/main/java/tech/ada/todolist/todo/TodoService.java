package tech.ada.todolist.todo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TarefaRepository repository;

    public TodoService(TarefaRepository repository){
        this.repository = repository;
    }

    public void salvarTarefa(Tarefa tarefa){
        repository.save(tarefa);
    }

//    public List<Tarefa> getAll() {
//        return repository;
//    }
}
