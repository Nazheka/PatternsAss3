public class DamageEffect implements CharacterEffectVisitor {
    public void applyBoost(Character character) {
        System.out.println("Boost ignored, applying damage");
    }

    public void applyDamage(Character character) {
        System.out.println("Applying damage to character");
    }
}

