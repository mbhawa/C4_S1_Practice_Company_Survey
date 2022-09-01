package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData) {
        float averageAge;
        int numberOfEmployees = ageRawData.length;

        try { //Write the logic

            float totalAge = 0;
            for (String index : ageRawData) {
                totalAge = totalAge + Float.parseFloat(index);
            }
            averageAge = totalAge / numberOfEmployees;
            return Float.toString(averageAge);
            //Handle specific exception
        } catch (NumberFormatException exception) {
            return exception.toString();
        }
    }


}
