import Adapter.ChargingAdapter;
import Adapter.NewCharger;
import Adapter.OldCharger;

public class AdapterMain {
    public static void main(String [] args)
    {
        System.out.println("Hello and welcome to Adapter Main!\n");
        OldCharger oldCharger = new OldCharger();
        NewCharger adapter = new ChargingAdapter(oldCharger);
        adapter.chargeWithNewCharger();
    }
}
