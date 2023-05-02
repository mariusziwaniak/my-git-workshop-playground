package pl.zajavka.case2;

import java.math.BigDecimal;

record Person(String name, Long age, BigDecimal salary) {

    public Boolean doYouHaveABike() {
        return true;
    }

    public Boolean doYouLikePizza() {
        return true;
    }
}
