package com.example.cam.nim;

import java.util.ArrayList;

/**
 * Created by Cam on 3/21/2016.
 */
public class GameInfo {

    private boolean boolEnableAudio;
    private boolean boolPlayerTurn;
    private boolean boolShowHTP;
    private boolean boolComputer;
    private String updatedPlayer1;
    private String updatePlayer2;
    private long computerSpeed;
    private double mComputerDifficulty;
    private int nRowAmount;
    private double totalPieces;
    private ArrayList<ArrayList<Boolean>> mRemainingDots;


    GameInfo() {
        this.boolEnableAudio = true;
        this.boolPlayerTurn = true;
        this.boolShowHTP = false;
        this.nRowAmount = 5;
        this.mComputerDifficulty = 1.0;
        this.computerSpeed = 1;
        this.totalPieces = findTotal(nRowAmount);
        this.mRemainingDots = new ArrayList<>();
        this.updatedPlayer1 = "Player";
        this.updatePlayer2 = "Friend";
    }

    public boolean isBoolEnableAudio() {
        return boolEnableAudio;
    }

    public void setBoolEnableAudio(boolean boolEnableAudio) {
        this.boolEnableAudio = boolEnableAudio;
    }

    public double findTotal(int nRowAmount) {
        return .5 * (nRowAmount * (nRowAmount + 1));
    }

    public boolean isBoolPlayerTurn() {
        return boolPlayerTurn;
    }

    public void setBoolPlayerTurn(boolean boolPlayerTurn) {
        this.boolPlayerTurn = boolPlayerTurn;
    }

    public long getComputerSpeed() {
        return computerSpeed;
    }

    public void setComputerSpeed(long computerSpeed) {
        this.computerSpeed = computerSpeed;
    }

    public int getnRowAmount() {
        return nRowAmount;
    }

    public void setnRowAmount(int nRowAmount) {
        this.nRowAmount = nRowAmount;
    }

    public double getComputerDifficulty() {
        return mComputerDifficulty;
    }

    public void setComputerDifficulty(double computerDifficulty) {
        mComputerDifficulty = computerDifficulty;
    }

    public ArrayList<ArrayList<Boolean>> getRemainingDots() {
        return mRemainingDots;
    }

    public void setRemainingDots(ArrayList<ArrayList<Boolean>> remainingDots) {
        mRemainingDots = remainingDots;
    }

    /*Populates remainingDots arraylist using this.getnRowAmount*/
    public void populateGameBoard() {
        for (int i = 0; i < this.getnRowAmount(); i++) {
            //Log.d("GameInfo", "Adding row");
            ArrayList<Boolean> tempList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                tempList.add(Boolean.TRUE);
                //Log.d("GameInfo", "Adding bool");
            }
            this.getRemainingDots().add(tempList);
        }
    }

    public boolean isBoolComputer() {
        return boolComputer;
    }

    public void setBoolComputer(boolean boolComputer) {
        this.boolComputer = boolComputer;
    }

    public String getUpdatedPlayer1() {
        return updatedPlayer1;
    }

    public void setUpdatedPlayer1(String updatedPlayer1) {
        this.updatedPlayer1 = updatedPlayer1;
    }

    public String getUpdatePlayer2() {
        return updatePlayer2;
    }

    public void setUpdatePlayer2(String updatePlayer2) {
        this.updatePlayer2 = updatePlayer2;
    }

    public double getTotalPieces() {
        return totalPieces;
    }

    public void setTotalPieces(double totalPieces) {
        if (this.totalPieces < 0)
            this.totalPieces = 0;
        else
            this.totalPieces = totalPieces;
    }

    //convert difficulty to integer
    public int getdifficultyCoversion()
    {
        int level=0;
        if(Double.compare(this.mComputerDifficulty,0.0) == 0) {
		level = 0;}
        else if(Double.compare(this.mComputerDifficulty,0.5) == 0) {level = 1;}
        else { level = 2;}
        return level;
    }

    public boolean isBoolShowHTP() {
        return boolShowHTP;
    }

    public void setBoolShowHTP(boolean boolShowHTP) {
        this.boolShowHTP = boolShowHTP;
    }
}

