package com.TiendaOnline.service;

import com.TiendaOnline.model.Producto;
import com.TiendaOnline.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    public List<Producto> listar() {
        return repository.findAll();
    }

    public Producto buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    public Producto guardar(Producto producto) {
        return repository.save(producto); // O productoRepository.save(producto);
    }
}