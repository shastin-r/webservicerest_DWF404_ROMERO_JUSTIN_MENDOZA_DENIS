package sv.edu.udb.contoso.services;

import sv.edu.udb.contoso.entities.Producto;
import sv.edu.udb.contoso.repositories.ProductoRepository;

import java.util.List;

public class ProductoService {
    private ProductoRepository productoRepository;

    public ProductoService() {
        this.productoRepository = new ProductoRepository();
    }

    public boolean agregarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    // Otros métodos de negocio...
}
