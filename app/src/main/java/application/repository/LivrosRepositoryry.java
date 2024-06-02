package application.repository;

import org.springframework.data.repository.CrudRepository;
import application.model.Livros;

public interface LivrosRepositoryry extends CrudRepository<Livros, Long> {
    
}