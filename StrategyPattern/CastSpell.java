package StrategyPattern;

public class CastSpell implements AttackType {

    @Override
    public String attackType() {

        String output = new String();
        output += " casts a spell!";
        return output;

    }

}
