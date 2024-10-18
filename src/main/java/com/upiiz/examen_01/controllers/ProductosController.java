package com.upiiz.examen_01.controllers;

import com.upiiz.examen_01.models.Productos;
import com.upiiz.examen_01.services.ProductosServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("api/v1/productos")
public class ProductosController {

ProductosServices productosServices;

    public ProductosController(ProductosServices productosServices) {
        this.productosServices = productosServices;
    }

    //GET
    @GetMapping
    public ResponseEntity<List<Productos>> getProductos(){
        return ResponseEntity.ok(productosServices.getAllProductos());
    }

    // GET
    @GetMapping("/{id}")
    public ResponseEntity<Productos> getProducto(@PathVariable Long id){
        return ResponseEntity.ok(productosServices.getProductoById(id));
    }

    // POST
    @PostMapping
    public ResponseEntity<Productos> addProducto(@RequestBody Productos producto){
        return ResponseEntity.ok(productosServices.createProducto(producto));
    }

    //PUT
    @PutMapping("/{id}")
    public ResponseEntity<Productos> updateProducto(@RequestBody Productos producto, @PathVariable Long id){
        producto.setId(id);
        return ResponseEntity.ok(productosServices.updateProducto(producto));
    }

    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducto(@PathVariable Long id){
        productosServices.deleteProducto(id);
        return ResponseEntity.noContent().build();
    }

}
