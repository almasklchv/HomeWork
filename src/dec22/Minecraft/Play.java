// автор кода Алмас Киличов
package dec22.Minecraft;

import java.util.*;

public class Play {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner input = new Scanner(System.in);
        player.setHeart(10);
        boolean isOn = true;

        System.out.println("Добро пожаловать в консольную пародию Minecraft!\nАльфа-версия 0.0.1 (Много чего не сделано и не доработано)");
        System.out.print("Дайте имя вашему персонажу: ");
        player.setNickname(input.nextLine());

        while (isOn) {

            System.out.println("Выберите один из вариантов: \n" +
                    "1. Начать хождение\n" + "2. Показать инвентарь\n" +
                    "3. Информация о персонаже\n" + "4. Сбросить прогресс\n" +
                    "5. Поесть еду\n" + "6. Закрыть игру");
            int choose = input.nextInt();

            if (choose == 1) {
                Random random = new Random();
                int rand = random.nextInt(3);
                int randHunger = random.nextInt(10);
                if (randHunger == 6  && player.getHunger() != 10) {
                    player.setHunger(player.getHunger() + 1);
                }
                if (rand == 0) {
                    System.out.println("Вы нашли пещеру!\n" +
                            "1. Пролутать пещеру\n" + "2. Выйти из пещеры");
                    int chooseInCave = input.nextInt();
                    if (chooseInCave == 1) {
                        String[] ore = new String[]{"gold", "iron", "copper", "diamond", "Вы ничего не нашли!"};
                        int randOre = random.nextInt(5);
                        if (randOre == 4) {
                            System.out.println(ore[4]);
                        } else {
                            if (player.setInventory(ore[randOre])) System.out.println("В ваш инвентарь добавлен предмет " + ore[randOre]);
                        }
                    }
                } else if (rand == 1) {
                    if (player.setInventory("wood")) System.out.println("Вы добыли wood.");
                    int randApple = random.nextInt(5);
                    if (randApple == 2) {
                        if (player.setInventory("apple")) System.out.println("Также вам выпал apple.");
                    }
                } else if (rand == 2) {
                    System.out.println("Рядом с вами корова.\n" + "1. Убить и получить мясо\n" + "2. Пройти мимо");
                    int chooseCow = input.nextInt();

                    if (chooseCow == 1) {
                        if (player.setInventory("raw beef")) System.out.println("Вы получили raw beef (утоляет голод на -2)");
                    } else if (chooseCow == 2) {
                        if (player.setInventory("apple")) System.out.println("Вы молодец что оставили корову в покое и не убили это невинное животное. За это вам бесплатное яблочко)\n" +
                                "Вы получили apple.");
                    }
                }
            } else if (choose == 2) {
                player.inventory();
                boolean isInventoryOn = true;
                while (isInventoryOn) {
                    System.out.println("Выберите один из вариантов: \n" + "1. Выкинуть предметы из инвентаря\n" +
                            "2. Выйти из инвентаря");
                    int chooseInventory = input.nextInt();
                    if (chooseInventory == 2) {
                        isInventoryOn = false;
                    } else if (chooseInventory == 1) {
                        System.out.print("Напишите цифры предметов которые желаете выкинуть через пробел (чтобы прекратить ввод в конце поставьте -1): ");
                        int chooseInv = 0;
                        while (chooseInv != -1) {
                            chooseInv = input.nextInt();
                            if (chooseInv >= 0 && chooseInv <= 71 && player.getInventory()[chooseInv] != null) {
                                System.out.println("Вы выкинули из инвентаря " + player.getInventory()[chooseInv] + "(" + chooseInv + ")");
                                player.getInventory()[chooseInv] = null;
                            } else if (chooseInv >= 0 && chooseInv <= 71 && player.getInventory()[chooseInv] == null) {
                                System.out.println("Этот слот итак пустой.(" + chooseInv + ")");
                            } else if (chooseInv == -1) {
                                System.out.println("Инвентарь закрывается...");
                            } else {
                                System.out.println("Такого слота в инвентаре не существует");
                            }
                        }
                    }
                }
            } else if (choose == 3) {
                System.out.println(player.info() + "\n");
            } else if (choose == 4) {
                player.die();
            } else if (choose == 5) {
                player.inventory();
                System.out.print("Введите цифру под которой лежит еда в инвентаре: ");
                int chooseFood = input.nextInt();
                String food = "";

                if (player.getInventory()[chooseFood] != null) food = player.getInventory()[chooseFood];
                if (food.equals("apple") && player.getHunger() >= 5) {
                    player.setHunger(player.getHunger() - 1);
                    System.out.println("Вы съели apple и утолили голод -1\n" + "Ваш голод: " + player.getHunger());
                    player.getInventory()[chooseFood] = null;
                } else if (food.equals("raw beef") && player.getHunger() >= 5) {
                    player.setHunger(player.getHunger() - 2);
                    System.out.println("Вы съели raw beef и утолили голод -2\n" + "Ваш голод: " + player.getHunger());
                    player.getInventory()[chooseFood] = null;
                } else if ((food.equals("apple") || food.equals("raw beef")) && player.getHunger() < 5){
                    System.out.println("Вы не голодны! Кушать можно с 5 единиц голода.");
                } else {
                    System.out.println("Это не еда!");
                }
            } else if (choose == 6) {
                isOn = false;
            }

            if (player.getHunger() == 10) {
                System.out.println("Вы голодны! Утолите голод, поешьте чего-нибудь срочно!");
                player.setHeart(player.getHeart() - 1);
                System.out.println("Ваше здоровье: " + player.getHeart());
            }

            if (player.getHeart() == 0) {
                System.out.println("Вы погибли!");
                player.die();
            }

            if (player.getHeart() != 10 && player.getHunger() != 10) {
                player.setHeart(player.getHeart() + 1);
                System.out.println("+1 к Вашему здоровью\nВаше здоровье: " + player.getHeart());
            }
        }
    }
}