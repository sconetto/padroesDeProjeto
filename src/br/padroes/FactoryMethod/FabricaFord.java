package br.padroes.FactoryMethod;

public class FabricaFord implements FabricaDeCarro {

    @Override
    public Carro criarCarro() {
        return new Fiesta();
    }

}