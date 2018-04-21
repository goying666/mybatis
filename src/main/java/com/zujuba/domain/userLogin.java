package com.zujuba.domain;
import java.util.Date;

public class userLogin {
    private Integer id;
    private Integer userid;
    private Date logintime;
    private String name;
    private String image;
    private Integer gender; //1: 男 ； 2：女
    private String phonenumber;
    private String city;
    private String province;
    private String onlyid;

//    public void setAll(Json )

    public Integer getid() {return id;}
    public void setid(Integer id) {this.id = id;}

    public Integer getUserId() {
        return userid;
    }

    public void setUserId(Integer userId) {
        this.userid = userId;
    }

    public String getname() {return name;}
    public void setname(String name) {this.name = name;}

    public String getimage() {return image;}
    public void setimage(String image) {this.image = image;}

    public Date getlogintime() {return logintime;}
    public void setlogintime(Date logintime) {this.logintime = logintime;}

    public Integer getgender() {return gender;}
    public void setgender(Integer gender) {this.gender = gender;}


    public String getphonenumber() {return phonenumber;}
    public void setphonenumber(String phonenumber) {this.phonenumber = phonenumber;}

    public String getcity() {return city;}
    public void setcity(String city) {this.city = city;}

    public String getprovince() {return province;}
    public void setprovince(String province) {this.province = province;}

    public String getonlyid() {return onlyid;}
    public void setonlyid(String onlyid) {this.onlyid = onlyid;}
}
