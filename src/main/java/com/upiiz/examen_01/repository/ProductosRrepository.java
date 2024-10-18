package com.upiiz.examen_01.repository;

import com.upiiz.examen_01.models.Productos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductosRrepository {

    private List<Productos> productos= new ArrayList<Productos>();
    private AtomicLong id= new AtomicLong();
    private AtomicLong id_producto= new AtomicLong();
    private AtomicLong id_usuario= new AtomicLong();

    //POST
    public Productos guardar(Productos producto){
        producto.setId(id.incrementAndGet());
        productos.add(producto);
        return producto;
    }

    //GET
    public List<Productos> obtenerTodos() {

        return productos;
    }

    //GET BY ID
    public  Productos obtenerPorId(Long id){

        return productos.stream().filter(producto -> producto.getId().equals(id)).findFirst().orElse(null)  ;
    }

    //PUT
    public Productos actualizar(Productos producto){
        eliminar(producto.getId());
        productos.add(producto);
        return producto;
    }

    //DELETE
    public  void eliminar(Long id){
        productos.removeIf(producto-> producto.getId().equals(id));
    }


}
