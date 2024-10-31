public class BoostEffect implements CharacterEffectVisitor {
    public void applyBoost(Character character) {
        System.out.println("Boost applied to character");
    }

    public void applyDamage(Character character) {
        System.out.println("Damage reduced due to boost effect");
    }
}
