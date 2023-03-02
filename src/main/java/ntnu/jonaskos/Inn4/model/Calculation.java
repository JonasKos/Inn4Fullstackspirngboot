package ntnu.jonaskos.Inn4.model;

import org.springframework.stereotype.Component;

@Component
public class Calculation {
    private int firstNumber;
    private int secondNumber;
    private char operator;
    private double result;

    //Operator: /, *, +, -

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public char getOperator() {
        return operator;
    }

    public double getResult() {
        return result;
    }

  public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void setResult(double result) {
        this.result = result;
    }





  /*  public String getCalculation() {
        return calculation;
    }

    public String getResult() {
        String[] parts = calculation.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        double result = 0;
        String errorString = "";

        try{
            if (parts.length == 3) {
                double a = Integer.parseInt(parts[0]);
                double b = Integer.parseInt(parts[2]);
                String operator = parts[1];

                switch (operator) {
                    case "+" -> result = a + b;
                    case "-" -> result = a - b;
                    case "*" -> result = a * b;
                    case "/" -> result = a / b;
                    default -> errorString = "Error: vennligst send et gyldig regnestykke";
                }
            }else{
                errorString = "Error:vennligst send et gyldig regnestykke";
            }

        } catch (Exception e) {
            errorString = "Error: " + e.getMessage();
        }

        this.result = result;
        if(errorString.length() > 0) return errorString;
        return String.valueOf(result);
    }

    public void setCalculation(String calculation){
        this.calculation = calculation;
    }*/
}
