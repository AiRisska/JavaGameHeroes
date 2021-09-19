package ru.game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Monster monster = new Monster();
        Tank tank = new Tank();
        Mag magDD = new Mag();
        PhizDD gan = new PhizDD();
        Prist heal = new Prist();

        System.out.println("Привет! Давай соберем классическую группу на монстра!");
        tank.Pers();
        magDD.Pers();
        gan.Pers();
        heal.Pers();
        System.out.println("Впереди три пути: 1 - в лес, 2 - в пещеру, 3 - в деревню. Выбирай!");
        int road = scan.nextInt();
        if (road == 1) {
            monster.name = "Леший";
            monster.attack();
            System.out.println("Вас атакует монстр "+monster.name);
            tank.attack();
            magDD.attack();
            gan.attack();
            heal.attack();
            monster.dearth();
            System.out.println("Вы победили монстра! Уровень группы вырос на 1 и поднялись характеристики персонажей:");
            Avatar.level = 2;
            tank.upLvl();
            magDD.upLvl();
            gan.upLvl();
            heal.upLvl();
        } else if (road == 2) {
            monster.name = "Вампир";
            monster.attack();
            System.out.println("Вас атакует монстр "+monster.name);
            for (int i=1; i<4; i++)
            {
                tank.attack();
                magDD.attack();
                gan.attack();
                heal.attack();
            }
            monster.dearth();
            System.out.println("Вы победили монстра! Уровень группы вырос на 2 и поднялись характеристики персонажей:");
            Avatar.level = 3;
            tank.upLvl();
            magDD.upLvl();
            gan.upLvl();
            heal.upLvl();
        } else {
            System.out.println("Вы вернулись обратно в деревню ни с чем!");
        }
    }
}
