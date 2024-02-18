package StrategyPattern;

public class CreateMagic implements DefendType {

    @Override
    public String defendType() {

        String output = new String();
        output += " creating a magic barrier for defenses!";
        return output;

    }

}
