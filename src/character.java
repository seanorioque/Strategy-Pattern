public class character{
    private String type;
    private attackStrategy attackStrategy;
    private defenseStrategy defenseStrategy;

    public character(String type, attackStrategy attackStrategy, defenseStrategy defenseStrategy){
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }
    public void attack(){
        attackStrategy.attack();
    }
    public void defense(){
        defenseStrategy.defense();
    }

    public void setAttackStrategy(attackStrategy attackStrategy){
        this.attackStrategy = attackStrategy;
    }

}


