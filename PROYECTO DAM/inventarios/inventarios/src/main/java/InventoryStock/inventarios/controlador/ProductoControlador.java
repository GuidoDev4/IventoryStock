package InventoryStock.inventarios.controlador;

import InventoryStock.inventarios.modelo.Producto;
import InventoryStock.inventarios.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("inventario-app")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoControlador {
    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping("/productos")
    public List<Producto> obtenerProductos() {
        return productoServicio.listarProductos();
    }
}