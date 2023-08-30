package com.leonidfrolov.spring.springboot.SpringDemoBot.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usersDataTable")
@Data
public class User {

    @Id
    private Long chatId;

    private Boolean embedeJoke;

    private String phoneNumber;

    private java.sql.Timestamp registeredAt;

    private String firstName;

    private String lastName;

    private String userName;

    private Double latitude;

    private Double longitude;

    private String bio;

    private String description;

    private String pinnedMessage;
}
