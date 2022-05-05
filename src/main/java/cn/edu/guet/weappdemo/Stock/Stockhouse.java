package cn.edu.guet.weappdemo.Stock;

import java.util.Objects;

public class Stockhouse {
    private int Goods_id;
    private String Goods_name;
    private Float Goods_price;
    private int Goods_stock;

    public int getGoods_id() {
        return Goods_id;
    }

    public void setGoods_id(int Goods_id) {
        this.Goods_id = Goods_id;
    }

    public String getGoods_name() {
        return Goods_name;
    }

    public void setGoods_name(String Goods_name) {
        this.Goods_name = Goods_name;
    }

    public Float getGoods_price() {
        return Goods_price;
    }

    public void setGoods_price(Float Goods_price) {
        this.Goods_price = Goods_price;
    }



    public int getGoods_stock() {
        return Goods_stock;
    }

    public void setGoods_stock(int Goods_stock) {
        this.Goods_stock = Goods_stock;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stockhouse sth = (Stockhouse) o;
        return getGoods_id() == sth.Goods_id &&  Objects.equals(Goods_name, sth.Goods_name) && Objects.equals(Goods_price,sth.Goods_price) && Objects.equals(Goods_stock, sth.Goods_stock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Goods_id,Goods_name,Goods_price,Goods_stock);
    }

    @Override
    public String toString() {
        return "StoreHouse{" +
                "Goods_id=" + Goods_id +
                ", Goods_name='" + Goods_name + '\'' +
                ", Goods_price=" + Goods_price +
                ", Goods_stock='" + Goods_stock + '\'' +
                '}';
    }
}
