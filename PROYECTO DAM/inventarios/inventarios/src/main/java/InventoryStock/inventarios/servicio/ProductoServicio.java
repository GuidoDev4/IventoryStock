package InventoryStock.inventarios.servicio;

import InventoryStock.inventarios.modelo.Producto;
import InventoryStock.inventarios.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoServicio {
    @Autowired
    private ProductoRepositorio productoRepositorio;

    public List<Producto> listarProductos() {
        return productoRepositorio.findAllNative();
    }

    public Producto buscarProductoPorId(Integer id) {
        return productoRepositorio.findById(id).orElse(null);
    }

    public void guardarProducto(Producto producto) {
        productoRepositorio.save(producto);
    }

    public void eliminarProductoPorId(Integer id) {
        productoRepositorio.deleteById(id);
    }
}