package com.LYFT.SearchMicroService.DAO;

import com.LYFT.SearchMicroService.Models.RideModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SearchDAO extends JpaRepository<RideModel,Integer> {

    @Query(value = "select * from ride_model where start=:start and end=:end and date=:date",nativeQuery = true)
    public List<RideModel> getRides(String start,String end,String date);
}
