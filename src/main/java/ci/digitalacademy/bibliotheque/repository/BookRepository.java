package ci.digitalacademy.bibliotheque.repository;

import ci.digitalacademy.bibliotheque.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
