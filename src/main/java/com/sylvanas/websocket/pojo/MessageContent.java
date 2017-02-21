package com.sylvanas.websocket.pojo;

import java.util.Date;

public class MessageContent {
    private Integer mId;

    private String mName;

    private String mContent;

    private Date mCreatedtime;

    private Date mUpdatedtime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessageContent that = (MessageContent) o;

        if (mId != null ? !mId.equals(that.mId) : that.mId != null) return false;
        if (mName != null ? !mName.equals(that.mName) : that.mName != null) return false;
        return mContent != null ? mContent.equals(that.mContent) : that.mContent == null;
    }

    @Override
    public int hashCode() {
        int result = mId != null ? mId.hashCode() : 0;
        result = 31 * result + (mName != null ? mName.hashCode() : 0);
        result = 31 * result + (mContent != null ? mContent.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MessageContent{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mContent='" + mContent + '\'' +
                ", mCreatedtime=" + mCreatedtime +
                ", mUpdatedtime=" + mUpdatedtime +
                '}';
    }

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