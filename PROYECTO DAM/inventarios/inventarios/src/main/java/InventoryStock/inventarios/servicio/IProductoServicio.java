package InventoryStock.inventarios.servicio;

import InventoryStock.inventarios.modelo.Producto;
import java.util.List;

public interface IProductoServicio {
    List<Producto> listarProductos();

    Producto buscarProductoPorId(Integer idProducto);

    void guardarProducto(Producto producto);

    void eliminarProductoPorId(Integer id);
}
