public class Show {
    private String date;
    private String price;
    private String qty;
    private String performer;
    private String city;


    public Show(String date, String price, String qty, String performer, String city) {
        this.date = date;
        this.price = price;
        this.qty = qty;
        this.performer = performer;
        this.city = city;
    }

    public static void add(Show show1) {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getPreformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
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
                ", preformer='" + performer + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
