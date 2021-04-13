package weathermachine;

public class ReapingMachine implements BaseComment {
    private Boolean status;

    @Override
    public Boolean getStatus() {
        return status;
    }

    @Override
    public void start() {
        status = true;
    }


    ReapingMachine() {
        MACHINE.add(this);
    }
}
