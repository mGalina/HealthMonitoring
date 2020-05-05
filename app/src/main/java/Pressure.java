public class Pressure {

    private int topPressure;
    private int lowerPressure;
    private int pulse;
    private boolean tachycardia;
    private int date;
    private int tame;

    public Pressure(int topPressure, int lowerPressure, int pulse, boolean tachycardia, int date, int tame) {
        this.topPressure = topPressure;
        this.lowerPressure = lowerPressure;
        this.pulse = pulse;
        this.tachycardia = tachycardia;
        this.date = date;
        this.tame = tame;
    }

    public int getTopPressure() {
        return topPressure;
    }

    public void setTopPressure(int topPressure) {
        this.topPressure = topPressure;
    }

    public int getLowerPressure() {
        return lowerPressure;
    }

    public void setLowerPressure(int lowerPressure) {
        this.lowerPressure = lowerPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public boolean isTachycardia() {
        return tachycardia;
    }

    public void setTachycardia(boolean tachycardia) {
        this.tachycardia = tachycardia;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTame() {
        return tame;
    }

    public void setTame(int tame) {
        this.tame = tame;
    }

    @Override
    public String toString() {
        return "Pressure{" +
                "topPressure=" + topPressure +
                ", lowerPressure=" + lowerPressure +
                ", pulse=" + pulse +
                ", tachycardia=" + tachycardia +
                ", date=" + date +
                ", tame=" + tame +
                '}';
    }
}