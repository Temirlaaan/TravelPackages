package turism.creator;

import turism.TourPackage.*;
import turism.exceptions.TurismExceptions;

public class Creator {
    public Date build(Date date) {
        Reast reast1 = new Reast("let's_rest", "No", 5, 280000, "VeryHotel", "no", "No","Amsterdam" );
        Reast reast2 = new Reast("let's go for a walk", "No", 12, 220000, "GoodHotel", "yes", "No","Beijing" );
        Reast reast3 = new Reast("welcome to Zhasybay", "No", 10, 150000, "GoodHotel", "yes", "No","Almaty" );
        MedicalTurism  medicalTurism1 = new MedicalTurism("Live_Long", "No", 10, 190000 , 80, "No", "Budapest");
        MedicalTurism  medicalTurism2 = new MedicalTurism("Balkhash", "No", 15, 120000 , 70, "No", "Peter");
        MedicalTurism  medicalTurism3 = new MedicalTurism("Alacol", "No", 5, 100000 , 60, "No", "Imanov");
        Cruise cruise1 = new Cruise("Parahod", 130, "Titanic", "No", 20, 180000, "No","Neapol" );
        Cruise cruise2 = new Cruise("Liner", 240, "Lastochka", "No", 50, 340000, "No", "New_York");
        Cruise cruise3 = new Cruise("Parahod", 340, "Olimpic", "No", 80, 240000, "No", "Venecia");

        try {
            date.addToDate(reast1);
            date.addToDate(reast2);
            date.addToDate(reast3);
            date.addToDate(medicalTurism1);
            date.addToDate(medicalTurism2);
            date.addToDate(medicalTurism3);
            date.addToDate(cruise1);
            date.addToDate(cruise2);
            date.addToDate(cruise3);
        } catch (TurismExceptions e) {
            new TurismExceptions("Error");
        }
        return date;
    }
}
