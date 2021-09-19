package ru.game;

public class PhizDD extends Avatar {

    void Pers() {
        proff = "РДД";
        attribute = "POWER";
        attr = 1;
        sayAboutPers();
    }

    void attack() {
        skill = "Удар!";
        attack(skill);
        attr++;
    }
}
