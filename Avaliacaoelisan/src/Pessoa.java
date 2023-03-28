/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public abstract class Pessoa extends Endereco{
   protected int id;
   protected String nome;
    protected String telefone;
     protected String email;
      protected Endereco endereco;
      protected UnidadeFederativa Uf;
    public Pessoa() {
    }

    public Pessoa(int id, String nome, String telefone, String email, Endereco endereco, UnidadeFederativa Uf, String logradouro, String numero, String complemento, String cep, String cidade) {
        super(logradouro, numero, complemento, cep, cidade);
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.Uf = Uf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public UnidadeFederativa getUf() {
        return Uf;
    }

    public void setUf(UnidadeFederativa Uf) {
        this.Uf = Uf;
    }


    
    
    
    
    
}
