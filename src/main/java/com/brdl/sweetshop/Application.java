package com.brdl.sweetshop;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Balusai balusai = new Balusai();
        balusai.id = 101;
        balusai.price = 20;

        Jalebi jalebi = new Jalebi();
        jalebi.id = 102;
        jalebi.price = 30;

        Khaja khaja = new Khaja();
        khaja.id = 103;
        khaja.price = 40;

        Laddu laddu = new Laddu();
        laddu.id = 104;
        laddu.price = 50;

        Shrikhand shrikhand = new Shrikhand();
        shrikhand.id = 105;
        shrikhand.price = 60;

        SweetRepository sweetRepository = new SweetRepository();
        sweetRepository.sweetAdd(balusai);
        sweetRepository.sweetAdd(jalebi);
        sweetRepository.sweetAdd(khaja);
        sweetRepository.sweetAdd(laddu);
        sweetRepository.sweetAdd(shrikhand);

        UserInterface userInterface = new UserInterface();
        List list = sweetRepository.getSweetList();
        userInterface.printSweetList(list);

    }
}
