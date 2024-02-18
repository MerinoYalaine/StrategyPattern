package StrategyPattern;

public class Archer implements CharacterType {
    ShootArrow shootArrow = new ShootArrow();
    Shield shield = new Shield();

    @Override
    public void attackType() {

        System.out.println("\nArcher" + shootArrow.attackType());

    }

    @Override
    public void defendType() {

        System.out.println("\nArcher" + shield.defendType());

    }

}
