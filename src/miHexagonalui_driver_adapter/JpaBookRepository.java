package miHexagonalui_driver_adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import miHexagonal.core.domain.Book;
import miHexagonal.core.driven_ports.BookRepository;

@Component
public class JpaBookRepository implements BookRepository {
   
@Autowired //enlaza repositorio y servicio
private HAAJpaRepository haaJpaRepository;
    @Override
public Book findById(Long id) {
Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);
BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);
return bookEntity.toBook();
}
}
