package StrategyPattern;

public class Wizard implements CharacterType {

    CastSpell castSpell = new CastSpell();
    CreateMagic createMagic = new CreateMagic();

    @Override
    public void attackType() {

        System.out.println("\nWizard" + castSpell.attackType());

    }

    @Override
    public void defendType() {

        System.out.println("\nWizard" + createMagic.defendType());

    }

}
