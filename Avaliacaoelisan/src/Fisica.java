/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public abstract class Fisica extends Pessoa{
    
  protected int idade;
protected Genero genero;

    public Fisica() {
    }

    public Fisica(int idade, Genero genero) {
        this.idade = idade;
        this.genero = genero;
    }

    public Fisica(int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco, String logradouro, String numero, String complemento, String cep, String cidade, UNIDADEFEDERATIVA UnidadeFederativa) {
        super(id, nome, telefone, email, endereco, logradouro, numero, complemento, cep, cidade, UnidadeFederativa);
        this.idade = idade;
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    

   
    
    
    
}
