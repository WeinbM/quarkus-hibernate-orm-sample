package org.acme.hibernate.orm.panache;

import javax.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import java.util.List;

@Entity
public class Tree extends PanacheEntity {

    public String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "tree_id")
    public List<Fruit> fruits;
}
