package cn.xpbootcamp.gilded_rose;

import java.util.HashMap;

public class Locker {
    private int capacity;

    Locker(int capacity) {
        this.capacity = capacity;
    }

    public HashMap<Ticket, Bag> getLocker() {
        return locker;
    }

    private HashMap<Ticket, Bag> locker = new HashMap<>();

    public void saveBagIntoLocker(Bag bag, Ticket ticket) {
        if (locker.size() >= capacity) {
            throw new RuntimeException("Insufficient empty lockers.");
        }
        locker.put(ticket, bag);
    }

    Bag getBagFromLocker(Ticket ticket) {
        return locker.remove(ticket);
    }
}
