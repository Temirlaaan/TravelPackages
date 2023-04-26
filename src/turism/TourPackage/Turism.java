package turism.TourPackage;

import turism.exceptions.TurismExceptions;

public class Turism {
    private String transport;
    private String name;
    private String food;
    private int colDays;
    private int price;
    private String city;

    public Turism(String name, String food, int colDays, int price, String transport , String city){
        this.name = name;
        this.food = food;
        this.colDays = colDays;
        this.price = price;
        this.transport = transport;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public String getFood() {
        return food;
    }
    public double getColDays() {
        return colDays;
    }
    public int getPrice() {
        return price;
    }
    public String getTransport() {
        return transport;
    }
    public String getCity() {
        return city;
    }
    public void setName(String name) throws TurismExceptions {
        if (name == null) {
            throw new TurismExceptions("Name is null!");
        }
        this.name = name;
    }
    public void setFood(String food)  {

        this.food = food;
    }
    public void setColDays(int colDays)  {
        this.colDays = colDays;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setTransport(String transport) {
        this.transport = transport;
    }
    public void setCity(String city) throws TurismExceptions {
        if (city == null) {
            throw new TurismExceptions("city is null!");
        }
        this.city = city;
    }

    @Override
    public int hashCode() {
        int result;
        result = (food == null) ? 0 : food.hashCode();
        result += (name == null) ? 0 : name.hashCode();
        result += (city == null) ? 0 : city.hashCode();
        result += (transport == null) ? 0 : transport.hashCode();
        result += colDays;
        result += price;
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
        Turism other = (Turism) obj;
        if (food == null) {
            if (other.getFood() != null)
                return false;
        }
        else if (!food.equals(other.getFood()))
            return false;
        if (transport == null) {
            if (other.getTransport() != null)
                return false;
        }
        else if (!transport.equals(other.getTransport()))
            return false;
        if (city == null) {
            if (other.getCity() != null)
                return false;
        }
        else if (!city.equals(other.getCity()))
            return false;
        if (name == null) {
            if (other.getName() != null)
                return false;
        } else if (!name.equals(other.getName()))
            return false;
        if (colDays != other.getColDays())
            return false;
        if (price != other.getPrice())
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Turism [name= " + name + ", food= " + food + ", colDays= " +
                colDays + ", price= " + price
                + "city= "+city+"transport= "+transport+"]";
    }

}
