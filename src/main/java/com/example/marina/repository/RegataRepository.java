package com.example.marina.repository;

/**
 *
 * @author Marcos Miranda
 */
public interface RegataRepository extends JpaRepository <Regata,Long>{
    
    List<Regata> findByNombre(String nombre);                                //regatas por nombre

    List<Regata> findByFecha (Date fecha);                                   // regatas por fecha
}
