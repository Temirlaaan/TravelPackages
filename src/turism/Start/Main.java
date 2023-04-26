package turism.Start;

import turism.suport.Help;
import turism.action.Print;
import turism.creator.Creator;
import turism.TourPackage.Date;

public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();
        Date date = creator.build(new Date());
        Print print = new Print();
        print.printDate(date);
        Help help = new Help("Kazakh Airlines");
        date = help.helpsOrder(date);
        print.printDate(date);
        help.Choiсe(date);
        print.printDate(date);
    }
}