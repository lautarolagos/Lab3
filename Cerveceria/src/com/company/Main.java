package com.company;

public class Main {

    public static void main(String[] args) {

        Ingrediente ing1 = new Ingrediente(1, "Malta", "malta rica", 10, 13);
        Ingrediente ing2 = new Ingrediente(2, "miel", "miel de brasil", 2, 30);
        Ingrediente ing3 = new Ingrediente(3, "agua", "agua de la canilla", 3, 2);

        Receta recetita = new Receta(0, "Honey", "America");
        recetita.listaIngredientes.add(ing1);
        recetita.listaIngredientes.add(ing2);
        recetita.listaIngredientes.add(ing3);

        Rubia rusa = new Rubia(0, "Honey", 90, 20, "Sabor miel", false, recetita, 20);
        Fabrica fabrica = new Fabrica(1, "Gluck", "Olavarria");
        fabrica.listaCervezas.add(rusa);
    }
}
