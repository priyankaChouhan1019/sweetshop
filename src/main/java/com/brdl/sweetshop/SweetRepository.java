package com.brdl.sweetshop;

import java.util.ArrayList;
import java.util.List;

public class SweetRepository {
    private List sweetList = new ArrayList();

    public List getSweetList() {
        return sweetList;
    }

    public void sweetAdd(Balusai balusai) {
        sweetList.add(balusai);
    }

    public void sweetAdd(Jalebi jalebi) {
        sweetList.add(jalebi);
    }

    public void sweetAdd(Khaja khaja) {
        sweetList.add(khaja);
    }

    public void sweetAdd(Laddu laddu) {
        sweetList.add(laddu);
    }

    public void sweetAdd(Shrikhand shrikhand) {
        sweetList.add(shrikhand);
    }

}
