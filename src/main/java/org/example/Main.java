package org.example;

import model.Letra;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Letra letra = new Letra();
        letra.setLetra(new char[4][7]);
        letra.setLetraE(new char[5][7]);

        letra.crearT();
        letra.crearO();
        letra.crearD();
        letra.crearO();
        System.out.println();
        letra.crearC();
        letra.crearO();
        letra.crearD();
        letra.crearE();


    }

}
