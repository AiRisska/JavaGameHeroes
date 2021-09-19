package ru.game;

public class Prist extends Avatar {

    void Pers() {
        proff = "Прист";
        attribute = "WIS";  // мудрость
        attr = 1;
        sayAboutPers();
    }

    void attack() {
        skill = "Масс-хил";
        attack(skill);
        attr++;
    }
}
