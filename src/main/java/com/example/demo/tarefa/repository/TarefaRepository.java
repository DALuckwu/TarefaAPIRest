import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.tarefa.entitie.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
    
}
