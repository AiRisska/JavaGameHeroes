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
        attack(skill);
        attr++;
    }
}
