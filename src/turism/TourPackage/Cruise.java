package turism.TourPackage;

import turism.exceptions.TurismExceptions;

public class Cruise extends Turism{
    private String type;
    private int size;
    public Cruise(String type, int size, String name, String food, int colDays, int price, String transport ,String city){
        super(name, food, colDays, price, transport,city);
        this.type = type;
        this.size = size;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) throws TurismExceptions {
        if (type == null) {
            throw new TurismExceptions("type is null!");
        }
        this.type = type;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result += size;
        result += (type == null) ? 0 : type.hashCode();
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
        Cruise other = (Cruise) obj;
        if(size != other.getSize())
            if (type == null) {
                if (other.getType() != null)
                    return false;
            } else if (!type.equals(other.getType()))
                return false;
        return true;
    }
    @Override
    public String toString() {
        return "Cruise [type=" + type + ", size=" + size + "]";
    }
}
