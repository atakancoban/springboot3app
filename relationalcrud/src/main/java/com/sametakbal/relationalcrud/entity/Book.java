package com.sametakbal.relationalcrud.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "books")
@Data
@EqualsAndHashCode
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "price",nullable = false)
    private BigDecimal price;
    @ManyToMany(mappedBy = "books")
    private Set<Author> authors;
    @OneToMany(mappedBy = "book")
    private Set<Page> pages;
}
