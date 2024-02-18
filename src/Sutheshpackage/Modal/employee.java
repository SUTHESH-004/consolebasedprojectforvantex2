package Sutheshpackage.Modal;
public class employee {
    int id;
    String name;
    String dob;
    String city;
    String state;
    String country;
    String mobilenumber;
    String joined_date;
    String relived_date;
    String address;
    
    int posts_id;
    public void setid(int id){this.id = id;}
    public void setname(String name){this.name = name;}
    public void setdob(String dob){this.dob = dob;}
    public void setcity(String city){this.city = city;}
    public void setstate(String state){this.state = state;}
    public void setcountry(String country){this.country = country;}
    public void setmobilenumber(String mobilenumber){this.mobilenumber=mobilenumber;}
    public void setjoineddate(String joined_date){this.joined_date = joined_date;}
    public void setrelieveddate(String relived_date){this.relived_date = relived_date;}
    public void setaddress(String address){this.address = address;}
    public int getid(){return this.id;};
    public String getname(){return this.name;}
    public String getdob(){return this.dob;}
    public String getstate(){return this.state;}
    public String getcountry(){return this.country;}
    public String getcity(){return this.city;}
    public String getMobileNumber(){return mobilenumber;}
    public String joinedddate()
    {
        return this.joined_date;
    }
    public String getrelieveddate()
    {
        return this.relived_date;
    }
    public String getAddress() {return this.address;}
}