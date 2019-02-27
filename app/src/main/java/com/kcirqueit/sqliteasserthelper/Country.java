package com.kcirqueit.sqliteasserthelper;

import java.io.Serializable;

public class Country implements Serializable {
    private int id;
    private String country;
    private String capital;
    private String currency;
    private String language;
    private String country_code;
    private String timezone;
    private byte[] flag;

    public Country() {
    }


    public Country(int id, String country, String capital, String currency, String language, String country_code, String timezone, byte[] flag) {
        this.id = id;
        this.country = country;
        this.capital = capital;
        this.currency = currency;
        this.language = language;
        this.country_code = country_code;
        this.timezone = timezone;
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public byte[] getFlag() {
        return flag;
    }

    public void setFlag(byte[] flag) {
        this.flag = flag;
    }
}
