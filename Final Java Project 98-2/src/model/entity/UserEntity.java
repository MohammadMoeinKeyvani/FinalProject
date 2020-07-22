package model.entity;

public class UserEntity {
    private String Name,PhoneNumber,Address,MeliCode;//Baraye vared shodan user
    private int id;
    private int number;

    public int getNumber() { return number; }
    public int getId() { return id; }
    public String getName(){return Name;}
    public String getPhoneNumber(){return PhoneNumber;}
    public String getAddress(){return  Address;}
    public String getMeliCode(){return MeliCode;}

    public UserEntity setNumber(int number) { this.number = number;return this; }


    public UserEntity setId(int id) { this.id = id;return this; }



    public UserEntity setName(String name) {
        Name = name;
        return this;
    }

    public UserEntity setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
        return this;
    }

    public UserEntity setAddress(String address) {
        Address = address;
        return this;
    }

    public UserEntity setMeliCode(String meliCode) {
        MeliCode = meliCode;
        return this;
    }
}