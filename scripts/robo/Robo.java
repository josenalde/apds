//import lombok.Getter;

//@Getter
public class Robo {
    protected String name;
    protected int batDuration;
    protected boolean turnedOn;

    public Robo() {
        this.name = null;
        this.batDuration = 0;
        this.turnedOn = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatDuration() {
        return batDuration;
    }

    public void setBatDuration(int batDuration) {
        this.batDuration = batDuration;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public Robo(String name, int batDuration, boolean turnedOn) {
        this.name = name;
        this.batDuration = batDuration;
        this.turnedOn = turnedOn;
    }

    @Override
    public String toString() {
        return "Robo [name=" + name + ", batDuration=" + batDuration + ", turnedOn=" + turnedOn + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + batDuration;
        result = prime * result + (turnedOn ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Robo other = (Robo) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (batDuration != other.batDuration)
            return false;
        if (turnedOn != other.turnedOn)
            return false;
        return true;
    }

    

}
