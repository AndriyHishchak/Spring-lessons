package com.Spring.Start.Lessons_12_JDBC.Repo;

import com.Spring.Start.Lessons_12_JDBC.Model.Buyer;

public interface BuyerRepo  {
    Iterable<Buyer> findAll();
    Buyer findById(String id);

    Buyer save(Buyer buyer);
}
