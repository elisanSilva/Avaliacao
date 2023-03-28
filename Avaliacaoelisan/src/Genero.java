/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino",'F');
    
    protected String nome;
    protected char valor;

    private Genero() {
    }

    private Genero(String nome, char valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    public String getNome() {
        return nome;
    }

    public char getValor() {
        return valor;
    }
    
    
}
