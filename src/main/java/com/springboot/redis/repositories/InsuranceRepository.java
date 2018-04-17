package com.springboot.redis.repositories;

import com.springboot.redis.domains.Insurance;
import org.springframework.context.annotation.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Description(value = "Insurance Repository Layer.")
@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Integer> {

    List<Insurance> findByCounty(String county);

}
