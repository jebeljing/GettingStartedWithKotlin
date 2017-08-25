package com.rsk.java;

import com.rsk.kotlin.Meeting;
import com.rsk.kotlin.MeetingException;

/**
 * Created by jingshanyin on 8/24/17.
 */
public class Program {

    public static void main(String[] args) {
        Meeting board = new Meeting("Board Meeting");
        board.setLocation("London");
        System.out.println("The meeting is in " + board.getLocation());

        board.description = "A board meeting";

//        Meeting.Companion.getAPP_VERSION();
        int version = Meeting.APP_VERSION;

//        Meeting.Companion.getAppVersion();
        Meeting.getAppVersion();

        try {
            board.addAttendee("");
        } catch(MeetingException me) {

        }

    }
}
