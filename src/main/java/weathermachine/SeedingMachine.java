package weathermachine;

public class SeedingMachine implements BaseComment {
    private Boolean status;


    @Override
    public Boolean getStatus() {
        return status;
    }

    @Override
    public void start() {
        status = true;
    }



    SeedingMachine() {
        MACHINE.add(this);
    }
}
