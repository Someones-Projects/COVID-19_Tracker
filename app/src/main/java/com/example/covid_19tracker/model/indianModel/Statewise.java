package com.example.covid_19tracker.model.indianModel;

import com.google.gson.annotations.Expose;

public class Statewise {

    @Expose
    private String active;
    @Expose
    private String confirmed;
    @Expose
    private String deaths;
    @Expose
    private String deltaconfirmed;
    @Expose
    private String deltadeaths;
    @Expose
    private String deltarecovered;
    @Expose
    private String lastupdatedtime;
    @Expose
    private String migratedother;
    @Expose
    private String recovered;
    @Expose
    private String state;
    @Expose
    private String statecode;
    @Expose
    private String statenotes;

    public Statewise(String active, String confirmed, String deaths, String deltaconfirmed, String deltadeaths, String deltarecovered, String lastupdatedtime, String migratedother, String recovered, String state, String statecode, String statenotes) {
        this.active = active;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.deltaconfirmed = deltaconfirmed;
        this.deltadeaths = deltadeaths;
        this.deltarecovered = deltarecovered;
        this.lastupdatedtime = lastupdatedtime;
        this.migratedother = migratedother;
        this.recovered = recovered;
        this.state = state;
        this.statecode = statecode;
        this.statenotes = statenotes;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getDeltaconfirmed() {
        return deltaconfirmed;
    }

    public void setDeltaconfirmed(String deltaconfirmed) {
        this.deltaconfirmed = deltaconfirmed;
    }

    public String getDeltadeaths() {
        return deltadeaths;
    }

    public void setDeltadeaths(String deltadeaths) {
        this.deltadeaths = deltadeaths;
    }

    public String getDeltarecovered() {
        return deltarecovered;
    }

    public void setDeltarecovered(String deltarecovered) {
        this.deltarecovered = deltarecovered;
    }

    public String getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(String lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public String getMigratedother() {
        return migratedother;
    }

    public void setMigratedother(String migratedother) {
        this.migratedother = migratedother;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatecode() {
        return statecode;
    }

    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    public String getStatenotes() {
        return statenotes;
    }

    public void setStatenotes(String statenotes) {
        this.statenotes = statenotes;
    }

    @Override
    public String toString() {
        return "Statewise{" +
                "active='" + active + '\'' +
                ", confirmed='" + confirmed + '\'' +
                ", deaths='" + deaths + '\'' +
                ", deltaconfirmed='" + deltaconfirmed + '\'' +
                ", deltadeaths='" + deltadeaths + '\'' +
                ", deltarecovered='" + deltarecovered + '\'' +
                ", lastupdatedtime='" + lastupdatedtime + '\'' +
                ", migratedother='" + migratedother + '\'' +
                ", recovered='" + recovered + '\'' +
                ", state='" + state + '\'' +
                ", statecode='" + statecode + '\'' +
                ", statenotes='" + statenotes + '\'' +
                '}';
    }
}
