package com.ademass.Libros.repositories;

import com.ademass.Libros.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long>{
    
    
    
}
