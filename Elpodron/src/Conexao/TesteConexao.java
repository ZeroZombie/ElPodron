package Conexao;

import java.sql.Connection;

import java.sql.SQLException;

public class TesteConexao {

public static void main(String[] args) throws SQLException {

Connection connection = new ConexaoBanco().getConnection();

System.out.println("Conexão aberta!");

connection.close();

}

}