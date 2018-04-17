package com.springboot.redis.services;

import com.springboot.redis.domains.Insurance;
import com.springboot.redis.repositories.InsuranceRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Description(value = "Insurance service responsible for processing data.")
@Service
public class InsuranceService {

    private InsuranceRepository insuranceRepository;

    @PersistenceContext
    private EntityManager entityManager;


    /**
     * Constructor dependency injector.
     * @param insuranceRepository - insurance repository layer.
     */
    public InsuranceService(InsuranceRepository insuranceRepository) {
        this.insuranceRepository = insuranceRepository;
    }

    /**
     * Method for getting all insurances
     *
     * @param county - provided county name
     * @return List of insurances / cacheable values
     */
    @Cacheable(value = "insurances", key = "#county")
    public List<Insurance> findAllInsurancesByCounty(String county) {
        return insuranceRepository.findByCounty(county);
    }

    /**
     * Method for getting insurance by identifier
     *
     * @param id - insurance identifier
     * @return Insurance / cacheable value
     */
    @Cacheable(value = "insurance", key = "#id")
    public Insurance findOneById(Integer id) {
        return insuranceRepository.findOne(id);
    }

    /**
     * Method for storing new insurance and caching it in redis
     *
     * @param insurance - insurance payload
     * @return stored Insurance
     */
    @CachePut(value = "insurance", key = "#insurance.id")
    public Insurance store(Insurance insurance) {
        return insuranceRepository.save(insurance);
    }

    /**
     * Method for destroying insurance by identifier and remove it from redis
     *
     * @param id - insurance identifier
     */
    @CacheEvict(value = "insurance", key = "#id")
    public void destroy(Integer id) {
        insuranceRepository.delete(id);
    }
}
