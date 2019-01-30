package com.example.retrofitsample.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class LottoResult {
    @SerializedName("bnum")
    private int bonusNumber;

    @SerializedName("gno")
    private int TurnNumber;

    @SerializedName("gdate")
    private String date;

    @SerializedName("nums")
    private ArrayList<Integer> numberList;

    public LottoResult(int bonusNumber, int turnNumber, String date, ArrayList<Integer> numberList) {
        this.bonusNumber = bonusNumber;
        TurnNumber = turnNumber;
        this.date = date;
        this.numberList = numberList;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }

    public void setBonusNumber(int bonusNumber) {
        this.bonusNumber = bonusNumber;
    }

    public int getTurnNumber() {
        return TurnNumber;
    }

    public void setTurnNumber(int turnNumber) {
        TurnNumber = turnNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Integer> getNumberList() {
        return numberList;
    }

    public void setNumberList(ArrayList<Integer> numberList) {
        this.numberList = numberList;
    }
}
