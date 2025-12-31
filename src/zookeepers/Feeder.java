package zookeepers;

import interfaces.Feedable;

public class Feeder extends Zookeeper {

    public Feeder(String name) {
        super(name);
    }

    @Override
    public void performDuties() {
        assignedAnimals.forEach(a -> {
            if (a instanceof Feedable f) {
                f.feed();
            }
        });
    }
}
