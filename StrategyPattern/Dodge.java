package StrategyPattern;

public class Dodge implements DefendType {

    @Override
    public String defendType() {

        String output = new String();
        output += " dodgin to avoid attack!";
        return output;

    }

}
