package br.padroes.AbstractFactory;

public class FabricaFiat implements FabricaDeCarro {

    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }

}