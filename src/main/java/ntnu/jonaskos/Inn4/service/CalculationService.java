package ntnu.jonaskos.Inn4.service;

import ntnu.jonaskos.Inn4.model.Calculation;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CalculationService {

    Calculation createCalculation(Calculation calculation);

    List<Calculation> getCalculations();

}
