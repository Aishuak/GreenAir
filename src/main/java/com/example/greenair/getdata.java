package com.example.greenair;

public class getdata {
    public int no2, no, so2, co, pm2, percent;

    public getdata(){}
    public getdata(int no, int no2, int co, int so2, int pm2, int percent){
        this.co = co;
        this.no = no;
        this.no2 = no2;
        this.so2 = so2;
        this.pm2= pm2;
        this.percent = percent;


    }

    public int getNo2() {
        return no2;
    }
    public void setNo2(int no2) {
        this.no2 = no2;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public int getSo2() {
        return so2;
    }
    public void setSo2(int so2) {
        this.so2 = so2;
    }
    public int getCo() {
        return co;
    }
    public void setCo(int co) {
        this.co = co;
    }
    public int getPm2() {
        return pm2;
    }
    public void setPm2(int pm2) {
        this.pm2 = pm2;
    }
    public int getPercent() {
        return percent;
    }
    public void setPercent(int percent) {
        this.percent = percent;
    }
}

