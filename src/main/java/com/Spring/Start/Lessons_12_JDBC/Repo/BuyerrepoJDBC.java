package com.Spring.Start.Lessons_12_JDBC.Repo;

import com.Spring.Start.Lessons_12_JDBC.Model.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class BuyerrepoJDBC implements BuyerRepo {


   private JdbcTemplate jdbcTemplate;

   @Autowired
    public BuyerrepoJDBC(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Iterable<Buyer> findAll() {
        return jdbcTemplate.query("select id, name, country, token from buyer",this::mapRowToBuyer);
    }

    @Override
    public Buyer findById(String id) {
        return jdbcTemplate.queryForObject("select id, name, country, token from buyer where id=?",this::mapRowToBuyer);
    }

    @Override
    public Buyer save(Buyer buyer) {
        jdbcTemplate.update("insert into buyer (id,name,country,token) values (?,?,?,?)",
               buyer.getId(),
               buyer.getName(),
               buyer.getCountry(),
               buyer.getToken());
        return buyer;
    }

    private Buyer mapRowToBuyer(ResultSet rs,int rowNum) throws SQLException {
       return new Buyer(rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("country"),
                        rs.getInt("token"));
    }
}

