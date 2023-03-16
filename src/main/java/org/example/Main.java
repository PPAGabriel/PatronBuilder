package org.example;

public class Main {
    public static void main(String[] args) {
        //hacer pizza sin builder
        Pizzas pizzaDefault = new Pizzas();
        Pizzas pizzaSinBuilder = new Pizzas(Pizzas.FINA,Pizzas.GRANDE,true,false,true,Pizzas.TIENDA);

        System.out.println(pizzaDefault);

        System.out.println();

        System.out.println(pizzaSinBuilder);

        System.out.println();

        Pizzas miPizza = new BuilderPizzas()
                .setCebolla(false)
                .setSize(Pizzas.SMALL)
                .setTipoMasa(Pizzas.NORMAL)
                .build();
        System.out.println(miPizza.toString());
    }
}