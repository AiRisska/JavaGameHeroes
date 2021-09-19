package ru.game;

public class Tank extends Avatar {

    void Pers() {
        proff = "Танк";
        attribute = "CON";
        attr = 1;
        sayAboutPers();
    }

    void attack() {
        skill = "Агр!";
        attack(skill);
        attr++;
    }

}
