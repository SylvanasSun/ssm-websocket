package com.sylvanas.websocket.pojo;

import java.util.Date;

public class MessageContent {
    private Integer mId;

    private String mName;

    private String mContent;

    private Date mCreatedtime;

    private Date mUpdatedtime;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    public Date getmCreatedtime() {
        return mCreatedtime;
    }

    public void setmCreatedtime(Date mCreatedtime) {
        this.mCreatedtime = mCreatedtime;
    }

    public Date getmUpdatedtime() {
        return mUpdatedtime;
    }

    public void setmUpdatedtime(Date mUpdatedtime) {
        this.mUpdatedtime = mUpdatedtime;
    }
}