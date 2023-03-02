package ntnu.jonaskos.Inn4.repo;


import ntnu.jonaskos.Inn4.model.Calculation;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CalculationRepository{

    private List<Calculation> calculations = new ArrayList<Calculation>();

    public List<Calculation> getCalculations(){
        return calculations;
    }

    public Calculation saveCalculation(Calculation calculation){
        calculations.add(calculation);
        System.out.println(calculations.size());
        return calculation;
    }
}
