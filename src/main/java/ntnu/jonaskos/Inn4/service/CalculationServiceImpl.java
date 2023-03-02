package ntnu.jonaskos.Inn4.service;

import ntnu.jonaskos.Inn4.model.Calculation;
import ntnu.jonaskos.Inn4.repo.CalculationRepository;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculationServiceImpl implements CalculationService{

    CalculationRepository calculationRepository;

    @Autowired
    public CalculationServiceImpl (CalculationRepository calculationRepository){
        this.calculationRepository = calculationRepository;
    }

    Logger logger = LoggerFactory.getLogger(CalculationServiceImpl.class);

    @Override
    public Calculation createCalculation(Calculation calculation){
        logger.info("create calculation + " + calculation.getFirstNumber() + " " + calculation.getOperator() + " " + calculation.getSecondNumber() + " = " + calculation.getResult() + "");

        switch (calculation.getOperator()){
            case '+':
                calculation.setResult(calculation.getFirstNumber() + calculation.getSecondNumber());
                break;
            case '-':
                calculation.setResult(calculation.getFirstNumber() - calculation.getSecondNumber());
                break;
            case '*':
                calculation.setResult(calculation.getFirstNumber() * calculation.getSecondNumber());
                break;
            case '/':
                calculation.setResult((float)calculation.getFirstNumber() / (float)calculation.getSecondNumber());
                break;

            default:
                logger.error("Could not parse calculation with operator: " + calculation.getOperator() + "");
                return null;
        }
        return calculationRepository.saveCalculation(calculation);
    }

    @Override
    public List<Calculation> getCalculations() {
        logger.info("returning all calculations");
        return calculationRepository.getCalculations();
    }
}
