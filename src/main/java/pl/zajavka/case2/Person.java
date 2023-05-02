package pl.zajavka.case2;

import java.math.BigDecimal;

record Person(String name, Long age, BigDecimal salary) {

    public BigDecimal howMuchDoYouEarn() {
        return salary;
    }

    public String whatIsYourJob() {
        return "Software developer!";
    }

    public String whatDoYouLike() {
        return "Strawberries";
    }

    public Boolean doYouLikePizza() {
        return true;
    }

    public Boolean doYouHaveABike() {
        return true;
    }

}
