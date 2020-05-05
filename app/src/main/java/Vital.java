public class Vital {

    private int weight;
    private int numberOfSteps;

    public Vital(int weight, int numberOfSteps) {
        this.weight = weight;
        this.numberOfSteps = numberOfSteps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }

    public void setNumberOfSteps(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    @Override
    public String toString() {
        return "Vital{" +
                "weight=" + weight +
                ", numberOfSteps=" + numberOfSteps +
                '}';
    }
}