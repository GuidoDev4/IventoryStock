package InventoryStock.inventarios.repositorio;

import InventoryStock.inventarios.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
    @Query(value = """
           SELECT id_producto, nombre, descripcion, precio, stock 
           FROM producto""", nativeQuery = true)
    List<Producto> findAllNative();
}