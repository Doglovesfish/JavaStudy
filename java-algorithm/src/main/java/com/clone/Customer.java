package com.clone;

public class Customer implements Cloneable{
    public int id;
    public int age;
    public Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Customer(int id, int age, Address address) {
        super();
        this.id = id;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString(){
        return "Customer [Id=" + id + ", age=" + age +", address=" + address
                + "]";
    }

    @Override
    public Customer clone() throws CloneNotSupportedException{
        Customer customer = (Customer) super.clone();
        customer.address = address.clone();
        return customer;
    }
}

class Address implements Cloneable{
    private String country;
    private String province;
    private String city;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
    @Override
    public Address clone() throws CloneNotSupportedException{

        return (Address) super.clone();
    }

    public Address(String country, String province, String city){
        super();
        this.country = country;
        this.province = province;
        this.city = city;
    }

}
