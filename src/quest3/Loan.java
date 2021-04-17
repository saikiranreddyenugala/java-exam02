/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest3;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class Loan {
   private String loanType;
   private double loanAmount;
   private double intrestRate;
   private int months;

    public Loan(String loanType, double loanAmount, double intrestRate, int months) {
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.intrestRate = intrestRate;
        this.months = months;
    }

    public String getLoanType() {
        return loanType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getIntrestRate() {
        return intrestRate;
    }

    public int getMonths() {
        return months;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setIntrestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    @Override
    public String toString() {
        return   "loanType:" + loanType + ",\nloanAmount:" + loanAmount + ",\nintrestRate:" + intrestRate + ",\nmonths:" + months ;
    }
    
    
    
    
}
