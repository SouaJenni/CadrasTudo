/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Dória
 */
public class GerenciadorUsuarios {
    private static List<Usuarios> usuariosRegistrados = new ArrayList();
    
    public GerenciadorUsuarios(List<Usuarios> usuarios) {
    this.usuariosRegistrados = usuarios;
    }

    public static void adicionarUsuario(Usuarios usuario) {
        usuariosRegistrados.add(usuario);
        System.out.println("Usuário adicionado: " + usuario.getUsuario() + ", Senha: " + usuario.getSenha());
    }

    public static Usuarios verificarLogin(String usuario, String senha) {
        for (Usuarios u : usuariosRegistrados) {
            if (u.getUsuario().equals(usuario) && u.getSenha().equals(senha)) {
                return u;
            }
        }
        return null; 
        
    }
}
