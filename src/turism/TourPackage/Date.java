package turism.TourPackage;

import java.util.ArrayList;
import turism.exceptions.TurismExceptions;
public class Date {
    private String name;
    private ArrayList<Turism> date;
    public Date() {
        date = new ArrayList<Turism>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) throws TurismExceptions {
        if (name == null) {
            throw new TurismExceptions("Name is null!");
        }
        this.name = name;
    }
    public ArrayList<Turism> getDate() {
        return (ArrayList<Turism>) date;
    }

    public Turism getDateFromIndex(int index) {
        return date.get(index);
    }

    public void setDate(ArrayList<Turism> Date) throws TurismExceptions {
        if (Date == null) {
            throw new TurismExceptions("Date is null!");
        }
        this.date = Date;
    }
    public boolean addToDate(Turism conf) throws TurismExceptions {
        if (conf == null) {
            throw new TurismExceptions("Turism object can't add, because it is null!");
        }
        boolean i = false;
        i = date.add(conf);
        return i;
    }
    public int getSize(){
        return date.size();
    }
    @Override
    public int hashCode() {
        int result = 0;
        result += (date == null) ? 0 : date.hashCode();
        result += (name == null) ? 0 : name.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Date other = (Date) obj;
        if (date == null) {
            if (other.getDate() != null)
                return false;
        } else if (!date.equals(other.getDate()))
            return false;
        if (name == null) {
            if (other.getName() != null)
                return false;
        } else if (!name.equals(other.getName()))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Date [name=" + name + ", Date=" + date + "]";
    }

}