package ca.sheridancollege.samusubi.a4_webservices.Repository;

import ca.sheridancollege.samusubi.a4_webservices.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findBookByTitleContaining(String title);
}
