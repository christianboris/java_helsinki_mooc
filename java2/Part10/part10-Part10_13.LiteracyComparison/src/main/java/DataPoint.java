/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBN
 */
public class DataPoint implements Comparable<DataPoint> {
    private String country;
    private int year;
    private String sex;
    private double percentage;

    public DataPoint(String country, int year, String sex, double percentage) {
        this.country = country;
        this.year = year;
        this.sex = sex;
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public int compareTo(DataPoint comparable) {
        if (this.getPercentage() - comparable.getPercentage() > 0.00001) {
            return 1;
        } else if (this.getPercentage() - comparable.getPercentage() < 0.00001){
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return (this.country + " (" + this.year + "), " + this.sex + ", " + this.percentage);
    }
    
    
    
    
}
