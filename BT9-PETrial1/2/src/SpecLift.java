public class SpecLift extends Lift {
    private int load;

    public SpecLift() {
    }

    public SpecLift(int load, String label, int type) {
        super(label, type);
        this.load = load;
    }

    @Override
    public String toString() {
        return super.toString() + "," + load;
    }

    public void setData() {
        StringBuilder newLabel = new StringBuilder();
        for (int i = 0; i < getLabel().length(); i++) {
            if (i % 2 == 0) {
                newLabel.append(getLabel().charAt(i));
            }
        }
        setLabel(newLabel.toString());
    }

    public int getValue() {
        if (!getLabel().contains(String.valueOf(getType()))) {
            return load;
        }
        return load + getType();
    }

}