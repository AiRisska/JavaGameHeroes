package ru.game;

public class Mag extends Avatar {

    void Pers() {
        proff = "Маг";
        attribute = "INT";
        attr = 1;
        sayAboutPers();
    }

    void attack() {
        skill = "Метеорит!";
        System.out.println(proff +" использует умение "+skill);
        attr++;
    }
}
