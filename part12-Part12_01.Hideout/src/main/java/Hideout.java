
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author isaac
 */
public class Hideout<T> {

    ArrayList<T> items;

    public Hideout() {
        this.items = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {

        this.items.add(toHide);

    }

    public T takeFromHideout() {

        T value = this.items.get(0);

        this.items.clear();

        return value;

    }

    public boolean isInHideout() {

        if (!this.items.isEmpty()) {
            return true;
        }

        return false;

    }

}
