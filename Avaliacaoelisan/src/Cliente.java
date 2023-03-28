/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Cliente extends Fisica{
    
    
    int protocolodeatendimento;

    public Cliente() {
    }

    public Cliente(int protocolodeatendimento, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa Uf) {
        super(idade, genero, id, nome, telefone, email, endereco, logradouro, numero, complemento, cep, cidade, Uf);
        this.protocolodeatendimento = protocolodeatendimento;
    }

    public int getProtocolodeatendimento() {
        return protocolodeatendimento;
    }

    public void setProtocolodeatendimento(int protocolodeatendimento) {
        this.protocolodeatendimento = protocolodeatendimento;
    }
    
    
    
}
