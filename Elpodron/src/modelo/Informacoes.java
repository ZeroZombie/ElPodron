/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ed
 */
public class Informacoes {

String idPedido;

String tipoPedido;

String nomeCliente;

String enderecoCliente;

String telefone1;

String telefone2;

String preco;

String tipoPagamento;

String troco;

public String getID() {

return idPedido;

}

public void setID(String idPedido) {

this.idPedido = idPedido;

}

public String getTipo() {

return tipoPedido;

}

public void setTipo(String tipoPedido) {

this.tipoPedido = tipoPedido;

}

public String getNome() {

return nomeCliente;

}

public void setNome(String nome) {

this.nomeCliente = nomeCliente;

}

public String getEndereco() {

return enderecoCliente;

}

public void setEndereco(String enderecoCliente) {

this.enderecoCliente = enderecoCliente;


}

public String getTelefone1() {

return telefone1;

}

public void setTelefone1(String telefone1) {

this.telefone1 = telefone1;


}

public String getTelefone2() {

return telefone1;

}

public void setTelefone2(String telefone2) {

this.telefone2 = telefone2;


}

public String getPreco() {

return preco;

}

public void setPreco(String preco) {

this.preco = preco;


}


public String getPagamento() {

return tipoPagamento;

}

public void setPagamento(String tipoPagamento) {

this.tipoPagamento = tipoPagamento;


}

public String getTroco() {

return troco;

}

public void troco(String troco) {

this.troco = troco;


}

}