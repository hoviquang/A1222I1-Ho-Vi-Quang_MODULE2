package ss17_io_binary_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.Serializable;

public class Product implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String manufacturer;
    private int price;
    public Product(int id, String name, String manufacturer, int price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", price=" + price + "]";
    }



}