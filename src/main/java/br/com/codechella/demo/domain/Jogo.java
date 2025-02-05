package br.com.codechella.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String gameName;
    private double gamePrice;
    private double gameSize;

}
