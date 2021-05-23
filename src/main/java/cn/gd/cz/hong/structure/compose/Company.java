package cn.gd.cz.hong.structure.compose;

import java.util.ArrayList;
import java.util.List;

public class Company extends Structure {

    List<Structure> list = new ArrayList<Structure>();

    public void add(Structure s) {
        list.add(s);
    }

    public Company(String name) {
        super(false, name);
    }

    @Override
    public void show() {
        if (list.size() > 0) {
            for (Structure s : list) {
                s.show();
            }
        } else {
            super.show();
        }
    }

}
