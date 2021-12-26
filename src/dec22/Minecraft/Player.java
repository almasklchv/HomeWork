// автор кода Алмас Киличов
package dec22.Minecraft;

public class Player {
    private String nickname;
    private int heart;
    private String[] inventory = new String[72];
    private int hunger;

    public String getNickname() {
        return nickname;
    }
    public int getHeart() {
        return heart;
    }
    public String[] getInventory() {
        return inventory;
    }
    public int getHunger() {
        return hunger;
    }


    public void setNickname(String nickname2) {
        nickname = nickname2;
    }
    public void setHeart(int heart2) {
        heart = heart2;
    }
    public boolean setInventory(String inventory2) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = inventory2;
                break;
            } else if (inventory[inventory.length-1] != null) {
                System.out.println("Ваш инвентарь переполнен!");
                return false;
            }
        }
        if (inventory2.equals("die")) {
            for (int i = 0; i < inventory.length; i++) {
                inventory[i] = null;
            }
        }
        return true;
    }
    public void setHunger(int hunger2) {
        hunger = hunger2;
    }

    public String info() {
        return "Никнейм вашего персонажа: " + getNickname()
                + "\nВаше здоровье: " + getHeart() +
                "\nВаш голод: " + getHunger();
    }

    public void inventory() {
        int counter = 0;
        System.out.println("Ваш инвентарь: ");
        for (String x : inventory) {
            System.out.print(counter + "." + x + " ");
            counter++;
            if (counter == 72) {
                System.out.println();
            }
        }
    }

    public void die() {
        setInventory("die");
        setHeart(10);
        setHunger(0);
    }
}