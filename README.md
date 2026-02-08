# Strategy-Pattern
---

## Problem scenario: 
1. **Knight**: Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)
2. **Wizard**: Casts spells, uses magic barrier to defend
3. **Archer**: Shoots arrows; uses dodge to to defend
---

## Implement two types of Strategy: 
| DefenseStrategy    | AttackStrategy    |
|--------------------|-------------------|
| 1. Shield          | 1. CastSpell      |
| 2. Dodge           | 2. ShootArrow     |
| 3. CreateMagic     | 3. SwingSword     |
---
## Refactor the existing codes:

```java
public class Character {
    private String type;

    public Character(String type) {
        this.type = type;
    }

    public void attack() {
        if (type.equals("Knight")) {
            System.out.println("Knight attacks with a sword!");
        } else if (type.equals("Wizard")) {
            System.out.println("Wizard casts a spell!");
        } else if (type.equals("Archer")) {
            System.out.println("Archer shoots an arrow!");
        }
    }

    public void defend() {
        if (type.equals("Knight")) {
            System.out.println("Using a shield to defend!");
	System.out.println("Dodgin to avoid attack!");
            System.out.println("Creating a magic barrier for defense!"");		

        } else if (type.equals("Wizard")) {
            System.out.println("Creating a magic barrier for defense!"");
        } else if (type.equals("Archer")) {
            System.out.println("Using a shield to defend!"");
        }
    }
}
```

## Class Diagram:
![Alt text](https://github.com/seanorioque/Strategy-Pattern/blob/main/Class%20Diagram.png)
