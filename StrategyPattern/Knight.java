package StrategyPattern;

public class Knight implements CharacterType {
    
    SwingSword swingSword = new SwingSword();
    Shield shield = new Shield();
    Dodge dodge = new Dodge();
    CreateMagic createMagic = new CreateMagic();

    @Override
    public void attackType() {

        System.out.println("\nKnight" + swingSword.attackType());

    }

    @Override
    public void defendType() {

        System.out.println("\nKnight" + shield.defendType());
        System.out.println("Knight" + dodge.defendType());
        System.out.println("Knight" + createMagic.defendType());

    }

}
