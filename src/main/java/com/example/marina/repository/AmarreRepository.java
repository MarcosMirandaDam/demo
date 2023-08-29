package com.example.marina.repository;

/**
 *
 * @author Marcos Miranda
 */
public interface AmarreRepository extends JpaRepository<Amarre, Long> {

    List<Amarre> findByNumero(int numero);                                //amarres por numero

    List<Amarre> findByCategoria(Categoria categoria);                    //amarres por categoria

}
