public class Character {
    private CharacterState state;
    private FightStrategy strategy;

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void setStrategy(FightStrategy strategy) {
        this.strategy = strategy;
    }

    public void performAttack() {
        state.attack();
    }

    public void fight() {
        strategy.fight();
    }

    public void accept(CharacterEffectVisitor visitor) {
        visitor.applyBoost(this);
    }
}
