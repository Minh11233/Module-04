package com.codegym.service.Impl;

import com.codegym.model.Product;
import com.codegym.service.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static final Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Áo","Áo Ba Lỗ",200000));
        products.put(2, new Product(2, "Quần","Quần Ba Lỗ",300000));
        products.put(3, new Product(3, "Đồng hồ","Rolex",100000000));
        products.put(4, new Product(4, "Laptop","Asus",15500000));
        products.put(5, new Product(5, "Thuốc phiện","Cần sa",100000));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
            return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
