package com.tutorial.elasticsearchspringboot.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "book")
@Getter
@Setter
public class Book {
  @Id
  private String id;
  private String title;
  private String author;
  private String description;
  private int pages;
}

