package com.example.travelbuddy3.Repository;

import android.media.MediaPlayer;

import java.util.ArrayList;

public interface dblookups {
    boolean checkqr (String Qrcode);
    ArrayList<String> getcoord(String Qrcode);
    ArrayList<MediaPlayer> getsound(String Qrcode);
}
