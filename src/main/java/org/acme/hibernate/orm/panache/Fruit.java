package org.acme.hibernate.orm.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Fruit extends PanacheEntity {

    public String name;
    public String color;
    public int cores;

    @ManyToOne
    @JsonbTransient
    public Tree tree;
}
