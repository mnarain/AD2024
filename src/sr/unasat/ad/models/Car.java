package sr.unasat.ad.models;

public class Car {
    public Long priority;
    public String name;

    public Car(String name) {
        this.name = name;
    }

    public Car(long priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    public long getPriority() {
        return priority;
    }

    public void setPriority(long priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Car{" +
                "priority=" + priority +
                ", name='" + name + '\'' +
                '}';
    }
}
