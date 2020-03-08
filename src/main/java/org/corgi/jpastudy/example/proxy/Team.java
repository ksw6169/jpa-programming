package org.corgi.jpastudy.example.proxy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NAME")
    private String name;
}
