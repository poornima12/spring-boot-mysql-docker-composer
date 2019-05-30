package com.littlebit_extra.springbootmysqldockercompose.entity;

import javax.persistence.*;
import lombok.Data;

/**
 * by @author poornima on 2019-05-28
 **/

@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String author;
}
