    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import Conexao.ConexaoBanco;


import modelo.Login;

import java.sql.*;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import javax.swing.*;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;

public class LoginDAO {
    private Connection connection;
    String usuario;
    String senha;
    
    Long idLogin;
    String nomeUsuario;
    String senhaUsuario;
    
    
    public LoginDAO(){

    this.connection = new ConexaoBanco().getConnection();
    }
    
public boolean valida(Login usuario){

boolean ok = false;

String sql = "SELECT nome, senha FROM funcionarios WHERE nome = ? && senha = ?" ;

try {

PreparedStatement stmt = connection.prepareStatement(sql);

stmt.setString(1, usuario.getNome());

stmt.setString(2, usuario.getSenha());

ResultSet rs = stmt.executeQuery();

if (rs.next())

{

ok = true;

}

stmt.close();

} catch (SQLException u) {

throw new RuntimeException(u);

}

return ok;

}
    
    
}
