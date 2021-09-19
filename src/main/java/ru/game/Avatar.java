package ru.game;
// супер класс
public class Avatar {

    static int level = 1;
    String proff;
    String attribute;
    int attr;
    String skill;

    void sayAboutPers() {
    //    System.out.println("Мое имя - "+name);
        System.out.println("Я - "+proff+". Мой уровень - "+level);
        System.out.println("Моя основная характеристика: "+attribute+", значение = "+attr);
    }

    void upLvl() {
        System.out.println(proff+". Уровень стал "+level+". Характеристика "+attribute+" теперь равна "+attr);
    }
}
