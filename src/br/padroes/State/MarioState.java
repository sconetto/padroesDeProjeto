package br.padroes.State;

public interface MarioState {
    MarioState pegarCogumelo();

    MarioState pegarFlor();

    MarioState pegarPena();

    MarioState levarDano();
}