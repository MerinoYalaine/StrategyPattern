package StrategyPattern;

public class Shield implements DefendType {

    @Override
    public String defendType() {

        String output = new String();
        output += " using a shield to defend!";
        return output;

    }

}
