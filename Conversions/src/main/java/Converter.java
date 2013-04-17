package main.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Converter {
    public double inchesToFeet(double inches) {
        return round(inches / 12);
    }

    private double round(double val) {
        BigDecimal bigDecimal = new BigDecimal(val);
        return bigDecimal.setScale(1, RoundingMode.CEILING).doubleValue();
    }
}