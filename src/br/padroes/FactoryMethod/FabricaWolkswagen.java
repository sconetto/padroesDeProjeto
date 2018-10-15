package br.padroes.factoryMethod;

public class FabricaWolkswagen implements FabricaDeCarro {

    @Override
    public Carro criarCarro() {
        return new Gol();
    }

}