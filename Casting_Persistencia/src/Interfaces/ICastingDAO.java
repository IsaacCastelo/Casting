/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import entidades.Casting;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;


public interface ICastingDAO {
    boolean agregar(Casting casting);
    boolean eliminar(Casting casting);
    List<Casting> consultarTodos();
    List<Casting> getCastingNombre(String nombre);
    Casting getCastingID(ObjectId idCliente);
    List<Casting> castingVigente(Date fecha);
}
