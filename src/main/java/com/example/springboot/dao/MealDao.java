package com.example.springboot.dao;

import com.example.springboot.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MealDao extends JpaRepository<Meal, Long> {


    //https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-creation
    List<Meal> findByName(String name);
    List<Meal> findByPriceGreaterThanAndName(double price, String name);


    //external api
    List<Meal> findByIsSummerMeal(boolean isSummerMeal);



    //ex1 metodo query che trova tutti i meal con una descrizione
    //ex2 metodo query che trova tutti i meal con un prezzo minore di un altro
    //ex3 metodo query che trova tutti i meal con un prezzo tra due valori
    //between key word,2 parametri
    //ex4 metodo query che trova tutti i meal con una descrizione e un prezzo minore del freddo?


    //crea i test nel service
}
