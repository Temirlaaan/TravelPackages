package turism.TourPackage;

import turism.exceptions.TurismExceptions;

public class Reast extends Turism{
    private String hotel;
    private String excursions;
    public Reast(String name, String food, int colDays, int price, String hotel, String excursions, String transport, String city) {
        super(name, food, colDays, price, transport,city);
        this.hotel = hotel;
        this.excursions = excursions;
    }
    public String getHotel() {
        return hotel;
    }
    public void setHotel(String hotel) throws TurismExceptions {
        if (hotel == null) {
            throw new TurismExceptions("hotel is null!");
        }
        this.hotel = hotel;
    }
    public String getExcursions() {
        return excursions;
    }
    public void setExcursions(String excursions) throws TurismExceptions {
        if (excursions == null) {
            throw new TurismExceptions("excursions is null!");
        }
        this.excursions = excursions;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result += (excursions == null) ? 0 : excursions.hashCode();
        result += (hotel == null) ? 0 : hotel.hashCode();
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Reast other = (Reast) obj;
        if (excursions == null) {
            if (other.getExcursions() != null)
                return false;
        } else if (!excursions.equals(other.getExcursions()))
            return false;
        if (hotel == null) {
            if (other.getHotel() != null)
                return false;
        } else if (!hotel.equals(other.getHotel()))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Reast [hotel=" + hotel + ", excursions=" + excursions + "]";
    }
}