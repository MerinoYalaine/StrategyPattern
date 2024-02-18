package StrategyPattern;

public class SwingSword implements AttackType {

    @Override
    public String attackType() {

        String output = new String();
        output += " shoots an arrow!";
        return output;

    }

}
