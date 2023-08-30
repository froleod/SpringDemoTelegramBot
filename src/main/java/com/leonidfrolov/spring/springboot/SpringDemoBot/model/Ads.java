package com.leonidfrolov.spring.springboot.SpringDemoBot.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity(name = "adsTable")
public class Ads {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String ad;
}