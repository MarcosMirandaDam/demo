package com.example.marina.repository;

/**
 *
 * @author Marcos Miranda
 */
public interface BarcoRepository extends JpaRepository<Barco, Long> {

    List<Barco> findByNombre(String nombre);                                //barcos por nombre

    List<Barco> findByEsloraGreaterThan(Integer eslora);                    //barcos eslora mayor que parametro

    List<Barco> findByNombreOrderByCapacidadDesc(String nombre);            //barcos por nombre y ordena por capacidad desc

    /*
    *********ANOTACIONES @QUERY****************************
    @Query("SELECT b FROM Barco b WHERE b.nombre = :nombre")
    List<Barco> findByNombre(@Param("nombre") String nombre);

    @Query("SELECT b FROM Barco b WHERE b.eslora > :eslora")
    List<Barco> findByEsloraGreaterThan(@Param("eslora") Integer eslora);
    @Query(value = 
    
    "SELECT * FROM Barco b WHERE b.nombre =
:nombre ORDER BY b
    .capacidad DESC

    ", nativeQuery = true)
List<Barco>
            findByNombreOrderByCapacidadDesc(@Param("nombre") String nombre);
*/
}
