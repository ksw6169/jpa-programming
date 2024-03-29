package com.corgi.jpastudy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "B")
@Getter
@Setter
public class Book extends Item {

    private String author;
    private String isbn;
}
