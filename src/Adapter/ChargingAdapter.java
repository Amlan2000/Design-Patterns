package Adapter;

public class ChargingAdapter implements NewCharger{

    private OldCharger oldCharger;

    public ChargingAdapter(OldCharger oldCharger)
    {
        this.oldCharger=oldCharger;
    }

    public void chargeWithNewCharger()
    {
        System.out.println("Using Adapter");
        oldCharger.chargeWithOldCharger();
    }


}
