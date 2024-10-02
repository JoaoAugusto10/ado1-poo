
package ado1.poo;

public class Cliente {
  private int idCliente;
  private String nome;

    public Cliente() {
    } 

    public Cliente(int idcliente, String nome) {
        this.idCliente = idcliente;
        this.nome = nome;
    }

    public int getIdcliente() {
        return idCliente;
    }

    public void setIdcliente(int idcliente) {
        this.idCliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
