package com.relevel.rottentomatoes.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CriticReview {

    @Id
    private long review_id;
}
