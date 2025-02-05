package com.otofargas.beerapp.beer_manager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "beers")
public class Beer {

    @Id
    private Integer id;

    private String uid;

    private String brand;

    private String name;
    private String style;
    private String hop;
    private String yeast;
    private String malts;
    private String ibu;
    private String alcohol;
    private String blg;

    public Integer getId() {
        return id;
    }

    public String getUid() {
        return uid;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public String getHop() {
        return hop;
    }

    public String getYeast() {
        return yeast;
    }

    public String getMalts() {
        return malts;
    }

    public String getIbu() {
        return ibu;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public String getBlg() {
        return blg;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setHop(String hop) {
        this.hop = hop;
    }

    public void setYeast(String yeast) {
        this.yeast = yeast;
    }

    public void setMalts(String malts) {
        this.malts = malts;
    }

    public void setIbu(String ibu) {
        this.ibu = ibu;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public void setBlg(String blg) {
        this.blg = blg;
    }

    @Override
    public String toString() {
        return "Beer [id=" + id + ", uid=" + uid + ", brand=" + brand + ", name=" + name + ", style=" + style + ", hop="
                + hop + ", yeast=" + yeast + ", malts=" + malts + ", ibu=" + ibu + ", alcohol=" + alcohol + ", blg="
                + blg + "]";
    }
}
