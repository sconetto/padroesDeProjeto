package br.padroes.FactoryMethod;

public class FabricaFiat implements FabricaDeCarro {

    @Override
    public Carro criarCarro() {
        return new Palio();
    }

}