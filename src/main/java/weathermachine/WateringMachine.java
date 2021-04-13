package weathermachine;

public class WateringMachine implements BaseComment {
    private Boolean status;

    @Override
    public Boolean getStatus() {
        return status;
    }

    @Override
    public void start() {
        status = true;
    }

    WateringMachine() {
        MACHINE.add(this);
    }
}
