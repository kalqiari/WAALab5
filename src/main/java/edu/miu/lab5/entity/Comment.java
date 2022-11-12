package edu.miu.lab5.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name= "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    @ManyToOne
    Post post;
}
