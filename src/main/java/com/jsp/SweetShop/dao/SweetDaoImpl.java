package com.jsp.SweetShop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jsp.SweetShop.entity.Sweet;

@Repository
public class SweetDaoImpl implements SweetDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int getStock(String sweet) {
        String sql = "SELECT stock FROM sweet WHERE name = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{sweet}, Integer.class);
    }

    @Override
    public void updateStock(String sweet, double newStock) {
        String sql = "UPDATE sweet SET stock = ? WHERE name = ?";
        jdbcTemplate.update(sql, newStock, sweet);
    }

	@Override
	public Sweet save(Sweet sweet) {
		// TODO Auto-generated method stub
		return null;
	}
}

