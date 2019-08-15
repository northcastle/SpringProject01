package com.whc.chapter3.ApplicationContext01.useParent.useAnnotation;

public class Singer {
    private String singerName;
    private int singerAge;
    private String singerCLassName;
    private String singerWorlds;

    public Singer(String singerName, int singerAge, String singerCLassName, String singerWorlds) {
        this.singerName = singerName;
        this.singerAge = singerAge;
        this.singerCLassName = singerCLassName;
        this.singerWorlds = singerWorlds;
    }

    public Singer() {
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getSingerAge() {
        return singerAge;
    }

    public void setSingerAge(int singerAge) {
        this.singerAge = singerAge;
    }

    public String getSingerCLassName() {
        return singerCLassName;
    }

    public void setSingerCLassName(String singerCLassName) {
        this.singerCLassName = singerCLassName;
    }

    public String getSingerWorlds() {
        return singerWorlds;
    }

    public void setSingerWorlds(String singerWorlds) {
        this.singerWorlds = singerWorlds;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "singerName='" + singerName + '\'' +
                ", singerAge=" + singerAge +
                ", singerCLassName='" + singerCLassName + '\'' +
                ", singerWorlds='" + singerWorlds + '\'' +
                '}';
    }
}
