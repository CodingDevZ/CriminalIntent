package com.example.tomy_.criminalintent;

import java.util.UUID;
import java.util.Date;

/**
 * Created by tomy- on 1/8/2016.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;

    public Crime() {

        this(UUID.randomUUID());

    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
