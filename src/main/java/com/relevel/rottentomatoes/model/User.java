package com.relevel.rottentomatoes.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private long user_id;
}
