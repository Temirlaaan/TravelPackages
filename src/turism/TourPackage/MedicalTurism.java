package turism.TourPackage;


public class MedicalTurism extends Turism{
    private int rating;
    public MedicalTurism(String name, String food, int colDays, int price, int rating, String transport ,String city) {
        super(name, food, colDays, price, transport,city);
        this.rating = rating;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result += rating;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        MedicalTurism other = (MedicalTurism) obj;
        if (rating != other.getRating())
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "MedicalTurism [rating=" + rating + "]";
    }
}