package click.henriquegibi.desmotivacional.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    
    @Column(name = "name")
    private String nome;
    
}