package com.example.codealongw3.dto;


import com.example.codealongw3.models.Game;
import jakarta.persistence.ElementCollection;
import jakarta.validation.constraints.NotNull;



public class GameDTO {
    public String name;
    public String description;

    public String imageUrl;
    public String developer;
    public String publisher;
    public String releaseDate;
    public double price;
    public int stock;
    public String os;
    public String processor;
    public String memory;
    public String graphics;
    public String sound_card;


    public GameDTO(String name, String description,String imageUrl, String developer, String publisher, String releaseDate, double price, int stock, String os, String processor, String memory, String graphics, String sound_card){
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.developer = developer;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.price = price;
        this.stock = stock;
        this.os  = os;
        this.processor = processor;
        this.memory = memory;
        this.graphics = graphics;
        this.sound_card = sound_card;
    }




}
