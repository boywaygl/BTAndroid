package com.example.student.myapplication;

public class Spiner {
    private String Name;
    private String ImgName;
    private String FlagName;
    private int NamSinh;
    public Spiner(String Name,String ImgName,String FlagName , int NamSinh){
        this.Name = Name;
        this.ImgName = ImgName;
        this.FlagName = FlagName;
        this.NamSinh =  NamSinh;
    }
    public int getNamSinh(){
        return NamSinh;
    }
    public void setNamSinh(int NamSinh){
        this.NamSinh = NamSinh;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setFlagName(String FlagName){
        this.FlagName = FlagName;
    }
    public String getFlagName(){
        return FlagName;
    }
    public void setImgName(String ImgName){
        this.FlagName = FlagName;
    }
    public String getImgName() {
        return ImgName;
    }
    @Override
    public String toString(){
        return this.Name+"(NamSinh:"+this.NamSinh+")";
    }
}
