/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import Conexao.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

/**
 *
 * @author Ed
 */
public class TabelaDAO {
    
private Connection connection;
String idPedido;

String tipoPedido;

String nomeCliente;

String enderecoCliente;

String telefone1;

String telefone2;

String preco;

String tipoPagamento;

String troco;   

    
public List<Informacoes> buscaDados(){
List<Informacoes> listaInformacoes = new ArrayList<Informacoes>();
    String sql = "SELECT * FROM pedido";
   
    try {
          PreparedStatement stmt = connection.prepareStatement(sql);
          ResultSet rs = stmt.executeQuery();
          if (rs != null) {
                          while (rs.next()) 
                   {
                       Informacoes aplicaTabela = new Informacoes();
                       aplicaTabela.setID(rs.getString(1));
                       aplicaTabela.setTipo(rs.getString(2));
                       aplicaTabela.setNome(rs.getString(3));
                       listaInformacoes.add(aplicaTabela);
                   }
                rs.close();
                stmt.close();
                return(listaInformacoes);
           }
           else
           {
                rs.close();
                stmt.close();
                
           }
}catch (SQLException u) {
            throw new RuntimeException(u);
}
    return null;
}
}