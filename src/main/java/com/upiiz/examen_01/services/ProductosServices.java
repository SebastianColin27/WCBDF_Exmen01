package com.upiiz.examen_01.services;

import com.upiiz.examen_01.models.Productos;
import com.upiiz.examen_01.repository.ProductosRrepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosServices {

    ProductosRrepository productosRrepository;

    public ProductosServices(ProductosRrepository productosRrepository) {
        this.productosRrepository = productosRrepository;
    }

    //GET
    public List<Productos> getAllProductos(){
        return productosRrepository.obtenerTodos();
    }

    //GET - BY ID
    public Productos getProductoById(Long id){
        return productosRrepository.obtenerPorId(id);
    }

    //POST
    public Productos createProducto(Productos producto){
        return productosRrepository.guardar(producto);
    }

    //PUT
    public Productos updateProducto(Productos producto){
        return productosRrepository.actualizar(producto);
    }

    //DELETE
    public void deleteProducto(Long id){
        productosRrepository.eliminar(id);
    }
}
