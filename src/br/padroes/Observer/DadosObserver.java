package br.padroes.Observer;

public abstract class DadosObserver {

    protected DadosSubject dados;

    public DadosObserver(DadosSubject dados) {
        this.dados = dados;
    }

    public abstract void update();
}