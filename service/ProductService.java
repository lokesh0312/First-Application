package com.example.first.firstapplication.service;

import com.example.first.firstapplication.product.Product;
import com.example.first.firstapplication.repo.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product> listAll(){
        return repo.findAll();
    }
    public void save (Product product) {
        repo.save(product);
    }
    public Product get (Integer id){
        return repo.findById(id).get();
    }
    public void delete (Integer id){
        repo.deleteById(id);
    }
}