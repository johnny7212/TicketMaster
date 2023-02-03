public class Show {
    private String date;
    private double price;
    private int qty;
    private String preformer;
    private String city;

    public Show(String date, double price, int qty, String preformer, String city) {
        this.date = date;
        this.price = price;
        this.qty = qty;
        this.preformer = preformer;
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getPreformer() {
        return preformer;
    }

    public void setPreformer(String preformer) {
        this.preformer = preformer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Show{" +
                "date='" + date + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", preformer='" + preformer + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
