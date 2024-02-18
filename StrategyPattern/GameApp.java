package StrategyPattern;

public class GameApp{

    public static void main(String[] args) {

        Character knight = new Character(new Knight());
        Character wizard = new Character(new Wizard());
        Character archer = new Character(new Archer());

        knight.attackType();
        wizard.attackType();
        archer.attackType();

        System.out.println("\n\nOh no! The enemy is launching an attack!\n");

        knight.defendType();
        wizard.defendType();
        archer.defendType();

        System.out.println("\n\nEnemy attacks are unsuccessful!\n");

    }

}
