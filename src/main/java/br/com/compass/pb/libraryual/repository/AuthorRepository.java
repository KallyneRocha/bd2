package br.com.compass.pb.libraryual.repository;

import br.com.compass.pb.libraryual.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
