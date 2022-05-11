/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import entidades.Perfil;
import java.util.List;
import org.bson.types.ObjectId;

public interface IPerfilDAO {
    boolean agregar(Perfil  perfil);
    List<Perfil> consultarTodos();
    Perfil consultar(ObjectId idPerfil);
    Perfil consultarNombre(String nombre);
}
