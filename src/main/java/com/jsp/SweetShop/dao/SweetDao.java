package com.jsp.SweetShop.dao;

import com.jsp.SweetShop.entity.Sweet;

public interface SweetDao {
    int getStock(String sweet);
    void updateStock(String sweet, double newStock);
    Sweet save(Sweet sweet);
}

