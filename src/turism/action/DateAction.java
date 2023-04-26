package turism.action;

import turism.TourPackage.Date;
import java.util.ArrayList;
import java.util.Collections;
import turism.TourPackage.Turism;

public class DateAction {
    public Date sortDatePrice(Date g) {
        int i = 0, j = 0;
        ArrayList<Turism> col = g.getDate();
        for (i =0; i < col.size() ; i++) {
            for(j = i; j < col.size(); j++){
                if(g.getDateFromIndex(i).getPrice() > g.getDateFromIndex(j).getPrice()){
                    Collections.swap(col,j, i);
                }
            }
        }
        return g;
    }
    public Date sortDateColDays(Date g) {
        int i = 0, j = 0;
        ArrayList<Turism> col = g.getDate();
        for (i =0; i < col.size() ; i++) {
            for(j = i; j < col.size(); j++){
                if(g.getDateFromIndex(i).getColDays() > g.getDateFromIndex(j).getColDays()){
                    Collections.swap(col,j, i);
                }
            }
        }
        return g;
    }

}