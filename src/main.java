public class main {
    public static void main(String[] args) {

        character knight = new character("Knight", new swingSword(), new Shield());
        character wizard = new character("Wizard", new castSpell(), new createMagic());
        character archer = new character("Archer", new shootArrow(), new Dodge());


        System.out.println("Knight");
        knight.attack();
        knight.defense();


        System.out.println("\nWizard");
        wizard.attack();
        wizard.defense();


        System.out.println("\nArcher");
        archer.attack();
        archer.defense();

        // Dynamic strategy change
        System.out.println("\nKnight changes strategy");
        knight.setAttackStrategy(new castSpell());
        knight.attack();
    }
}