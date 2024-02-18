package StrategyPattern;

public class Character {
    private CharacterType type;
    private AttackType attack;
    private DefendType defend;

    public Character(CharacterType type) {

        this.type = type;

    }

    public void attackType() {

        type.attackType();

    }

    public void defendType() {

        type.defendType();

    }

}
