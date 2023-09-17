package cis3334.tipcalculatorviewmodelf23;

public class CustomerTip {

    private Double bill;
    private Integer numPeople;
    private Double totalTip = 0.0;
    private Double tipPerPerson = 0.0;
    public static final Double LOW_TIP_RATE = 0.15;
    public static final Double HIGH_TIP_RATE = 0.20;

    public void calculate(Double bill, Integer numPeople, boolean goodService) {
        this.bill = bill;
        this.numPeople = numPeople;
        if (goodService) {
            totalTip = HIGH_TIP_RATE * bill;
            tipPerPerson = totalTip / numPeople;
        } else {
            totalTip = LOW_TIP_RATE * bill;
            tipPerPerson = totalTip / numPeople;
        }
    }

    public Double getTotalTip() {
        return totalTip;
    }

    public Double getTipPerPerson() {
        return tipPerPerson;
    }
}
