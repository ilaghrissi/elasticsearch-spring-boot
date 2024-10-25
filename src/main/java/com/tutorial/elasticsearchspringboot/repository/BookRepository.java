package com.tutorial.elasticsearchspringboot.repository;

import com.tutorial.elasticsearchspringboot.model.Book;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ElasticsearchRepository<Book, String> {
  List<Book> findByTitle(String title);
  List<Book> findByAuthor(String author);
}
