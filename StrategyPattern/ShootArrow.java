package StrategyPattern;

public class ShootArrow implements AttackType {

    @Override
    public String attackType() {

        String output = new String();
        output += " attacks with a sword!";
        return output;

    }

}
