public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        character.setState(new NormalState());
        character.setStrategy(new MeleeStrategy());
        System.out.println("Character in NormalState with MeleeStrategy:");
        character.performAttack();
        character.fight();
        character.setState(new PoweredUpState());
        System.out.println("Character in PoweredUpState:");
        character.performAttack();
        character.setStrategy(new RangedStrategy());
        System.out.println("Character in PoweredUpState with RangedStrategy:");
        character.fight();
        GameAction attackAction = new AttackAction();
        GameAction defendAction = new DefendAction();
        GameAction healAction = new HealAction();
        System.out.println("Executing game actions:");
        attackAction.executeAction();
        defendAction.executeAction();
        healAction.executeAction();
        CharacterEffectVisitor boostEffect = new BoostEffect();
        CharacterEffectVisitor damageEffect = new DamageEffect();
        System.out.println("Applying effects:");
        character.accept(boostEffect);
        character.accept(damageEffect);
    }
}
