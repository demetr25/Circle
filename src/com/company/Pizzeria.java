package com.company;

public class Pizzeria {
    public static void main(String[] args) {
        Pizza[] pizzas = {new Pizza("Classic", "Cheese, sauce, tomatoes, meet", 200.0d, 20),
                new Pizza("Hunter", "Cheese, tomatoes, sausages, sauce", 150.0d, 30),
                new Pizza("4 cheese", "Cheese sauce, mozarella, cheder, suluguni, dor blue", 300.0d, 30)};
        for (int i = 0; i < pizzas.length; i++) {
            System.out.println("Name -> "+pizzas[i].name+"\n"+"Composition -> "+pizzas[i].composition+"\n"+"Cost -> "+pizzas[i].cost+"\n"+"Diameter -> "+pizzas[i].r*2+"\n");
        }
    }
}