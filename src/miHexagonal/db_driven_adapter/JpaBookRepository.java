package miHexagonal.db_driven_adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import miHexagonal.core.domain.Book;
import org.springframework.stereotype.Repository;
import miHexagonal.core.domain.BookDoesNotExistException;
import miHexagonal.core.driven_ports.BookRepository;
import miHexagonal.db_driven_adapter.domain.BookEntity;
import miHexagonal.db_driven_adapter.jparepository.HAAJpaRepository;

@Repository
public class JpaBookRepository implements BookRepository {

	@Autowired
	private HAAJpaRepository haaJpaRepository;
	    @Override
	public Book findById(Long id) {
	Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);
	BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);
	return bookEntity.toBook();
	}

}
