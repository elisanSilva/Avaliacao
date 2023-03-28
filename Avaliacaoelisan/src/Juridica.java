/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Juridica extends Pessoa{
    
    protected String cnpj;
    protected String incricaoEstadual;

    public Juridica() {
    }

    public Juridica(String cnpj, String incricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa Uf) {
        super(id, nome, telefone, email, endereco, logradouro, numero, complemento, cep, cidade, UnidadeFederativa);
        this.cnpj = cnpj;
        this.incricaoEstadual = incricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIncricaoEstadual() {
        return incricaoEstadual;
    }

    public void setIncricaoEstadual(String incricaoEstadual) {
        this.incricaoEstadual = incricaoEstadual;
    }

    @Override
    public String toString() {
        return
                "\nCnpj: " + this.cnpj +
                "\nInscricao Estadual: " + this.incricaoEstadual +
                "\nId: " + super.id +
                "\nNome: " + super.nome +
                "\nTelefone " + super.telefone +
                "\nEmail " + super.email +
                "\nendereco " + super.endereco;
                       
    }



