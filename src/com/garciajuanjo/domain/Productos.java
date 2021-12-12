package com.garciajuanjo.domain;

public class Productos {

    private String cod_product, section, name, price, date, importado, country;

    public Productos(){
        this.cod_product = "";
        this.section = "";
        this.name = "";
        this.price = "";
        this.date = "";
        this.importado = "";
        this.country = "";
    }

    @Override
    public String toString(){
        return this.name.concat(",   ").concat(this.price).concat("€,   Pais de origen: ").concat(country);
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
