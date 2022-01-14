package com.zaga.base.persistence.crud;

import com.zaga.base.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    // Ejemplo query nativo
    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> buscarPorIdCategoria(int idCatengoria);

    // Ejemplo query methods
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    // Ejemplo query method con Optional
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
