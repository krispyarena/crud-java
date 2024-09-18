package org.demo.amnilcrud.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="player_tbl")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int goals;
    private String country;
}
