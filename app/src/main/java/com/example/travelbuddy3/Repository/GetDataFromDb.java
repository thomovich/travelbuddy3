package com.example.travelbuddy3.Repository;

import android.media.MediaPlayer;

import com.example.travelbuddy3.Repository.dblookups;

import java.sql.Connection;
import java.util.ArrayList;

public class GetDataFromDb implements dblookups {
    Connection connection;

    public GetDataFromDb(){
        connection = DatabaseConnector.getConnection();
    }
    @Override
    public boolean checkqr(String Qrcode) {
        return true;
    }

    @Override
    public ArrayList<String> getcoord(String Qrcode) {
        return null;
    }

    @Override
    public ArrayList<MediaPlayer> getsound(String Qrcode) {
        return null;
    }
}
