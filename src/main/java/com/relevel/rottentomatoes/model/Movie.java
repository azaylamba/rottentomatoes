package com.relevel.rottentomatoes.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
    private long movie_id;
}
