package com.LYFT.RideMicroService.DAO;

import com.LYFT.RideMicroService.Models.RideModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface RideDAO extends JpaRepository<RideModel,Integer> {
    public List<RideModel> findAllByPostedEmail(String email);

    public RideModel findById(int id);
}
