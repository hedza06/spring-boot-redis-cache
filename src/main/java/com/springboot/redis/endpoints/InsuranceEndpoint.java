package com.springboot.redis.endpoints;

import com.springboot.redis.domains.Insurance;
import com.springboot.redis.services.InsuranceService;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Description(value = "Endpoint for insurance operations.")
@RestController
@RequestMapping("/api/insurance")
public class InsuranceEndpoint {

    private InsuranceService insuranceService;

    /**
     * Constructor dependency injector.
     * @param insuranceService - insurance service dependency layer.
     */
    public InsuranceEndpoint(InsuranceService insuranceService) {
        this.insuranceService = insuranceService;
    }


    /**
     * Getting all insurances by county
     *
     * @param county - provided county as query parameter
     * @return List of Insurances filtered by county
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Insurance>> getInsurancesByCounty(@RequestParam String county)
    {
        List<Insurance> insuranceList = insuranceService.findAllInsurancesByCounty(county);
        return Optional.ofNullable(insuranceList)
                .map(insurances -> new ResponseEntity<>(insurances, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /**
     * Getting insurance by provided identifier
     *
     * @param id - insurance identifier
     * @return Insurance object by identifier
     */
    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Insurance> getInsuranceById(@PathVariable(value = "id") Integer id)
    {
        Insurance insuranceData = insuranceService.findOneById(id);
        return Optional.ofNullable(insuranceData)
                .map(insurance -> new ResponseEntity<>(insurance, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /**
     * Saving new insurance object
     *
     * @param insurancePayload - provided insurance payload
     * @return stored Insurance object
     */
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Insurance> storeInsurance(@Valid @RequestBody Insurance insurancePayload)
    {
        Insurance insurance = insuranceService.store(insurancePayload);
        return new ResponseEntity<>(insurance, HttpStatus.CREATED);
    }

    /**
     * Destroying insurance object by provided identifier
     *
     * @param id - insurance identifier
     * @return Http status code
     */
    @DeleteMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteInsurance(@PathVariable(value = "id") Integer id)
    {
        insuranceService.destroy(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
