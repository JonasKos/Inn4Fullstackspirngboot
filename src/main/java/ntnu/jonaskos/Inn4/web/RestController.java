package ntnu.jonaskos.Inn4.web;

import ntnu.jonaskos.Inn4.model.Calculation;
import ntnu.jonaskos.Inn4.service.CalculationService;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/calculation")
@CrossOrigin
public class RestController {

    @Autowired
    CalculationService calculationService;

    Logger logger = LoggerFactory.getLogger(RestController.class);

    @GetMapping
    public List<Calculation> getCalculations() {
        logger.info("GET: getCalculations called");

        return calculationService.getCalculations();
    }
    //post a calculation (returns answer
    @PostMapping
    public Calculation createCalculation(@RequestBody Calculation calculation){
        logger.info("POST: createCalculation called");
        return calculationService.createCalculation(calculation);
    }




}
