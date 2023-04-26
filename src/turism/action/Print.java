package turism.action;

import turism.TourPackage.Date;
import java.util.ArrayList;
import turism.TourPackage.Turism;
public class Print {
    public void printDate(Date g) {
        ArrayList<Turism> col = g.getDate();
        for (Turism conf : col) {
            System.out.println("Name= " + conf.getName() + " " + "City= " + conf.getCity() + " " + "colDays= " + conf.getColDays() + " " + "Food = " + conf.getFood()+ " " + "Transport = " + conf.getTransport()+ " " + "Price = " + conf.getPrice());
        }
    }
}