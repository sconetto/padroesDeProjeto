package br.padroes.AbstractFactory;

public class Fiesta implements CarroPopular {

    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Fiesta\nFábrica: Ford\nCategoria:Popular");
    }

}