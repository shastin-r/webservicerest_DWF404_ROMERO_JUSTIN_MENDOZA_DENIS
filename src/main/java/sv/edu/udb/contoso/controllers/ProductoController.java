package sv.edu.udb.contoso.controllers;

import sv.edu.udb.contoso.entities.Producto;
import sv.edu.udb.contoso.services.ProductoService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

@ManagedBean
@RequestScoped
public class ProductoController {
    private ProductoService productoService;
    private Producto producto = new Producto();

    public ProductoController() {
        this.productoService = new ProductoService();
    }

    public String agregarProducto() {
        boolean result = productoService.agregarProducto(producto);
        if (result) {
            return "success"; // Nombre de la página de éxito
        } else {
            return "error"; // Nombre de la página de error
        }
    }

    public List<Producto> obtenerTodosLosProductos() {
        return productoService.obtenerTodosLosProductos();
    }

    // Getters y Setters
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
