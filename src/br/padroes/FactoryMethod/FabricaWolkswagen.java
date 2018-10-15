package br.padroes.FactoryMethod;

public class FabricaWolkswagen implements FabricaDeCarro {

    @Override
    public Carro criarCarro() {
        return new Gol();
    }

}