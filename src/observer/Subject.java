package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject {
    private static int state;

    //memory leakage whenever the array is updated through registering and unregistering as the list grows
    private List<Observer> observers = new ArrayList<>();

    public Subject() {
    }

    public void add(Observer observer) {
        this.observers.add(observer);
    }

    public int getState() {
        return state;
    }

    public void setState(int value) {
        state = value;
        this.execute();
    }

    private void execute() {
        Iterator var1 = this.observers.iterator();

        while(var1.hasNext()) {
            Observer observer = (Observer)var1.next();
            observer.update();
        }

    }
}