public class House {
    private String type;
    private int area;

    public House() {
    }

    public House(String type, int area) {
        this.type = type;
        this.area = area;
    }

    public String getType() {
        if (type.length() < 3)
            return new StringBuilder(type).reverse().toString();
        StringBuilder last = new StringBuilder(type.substring(type.length() - 3));
        String s = last.reverse().toString();
        return s;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = 3 * area;
    }
    
}
