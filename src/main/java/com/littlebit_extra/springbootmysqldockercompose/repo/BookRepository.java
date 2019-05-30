package com.littlebit_extra.springbootmysqldockercompose.repo;

import com.littlebit_extra.springbootmysqldockercompose.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * by @author poornima on 2019-05-28
 **/
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
