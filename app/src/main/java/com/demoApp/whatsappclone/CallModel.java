package com.demoApp.whatsappclone;

public class CallModel {

    private String name, time ;
    private boolean isVideoCall;

    public CallModel(String name, String time, boolean isVideoCall) {
        this.name = name;
        this.time = time;
        this.isVideoCall = isVideoCall;
    }

    public CallModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isVideoCall() {
        return isVideoCall;
    }

    public void setVideoCall(boolean videoCall) {
        isVideoCall = videoCall;
    }
}
