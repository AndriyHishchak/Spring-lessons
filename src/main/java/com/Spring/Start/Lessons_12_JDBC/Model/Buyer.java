package com.Spring.Start.Lessons_12_JDBC.Model;





public class Buyer {

    private Long id;
    private String name;
    private String country;
    private Integer token;

    public Buyer(Long id, String name, String country, Integer token) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.token = token;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                "name='" + name + '\'' +
                "country='" + country + '\'' +
                "token=" + token ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getToken() {
        return token;
    }

    public void setToken(Integer token) {
        this.token = token;
    }
}
