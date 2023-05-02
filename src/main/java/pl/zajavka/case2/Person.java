package pl.zajavka.case2;

record Person(String name, Long age) {

    public String whatIsYourJob() {
        return "Software developer!";
    }

    public String whatDoYouLike() {
        return "Strawberries";
    }

    public Boolean doYouHaveABike() {
        return true;
    }
}
