package com.example.android.sanxenxo_tourguide;

/**
 * Created by ana on 16/05/2017.
 */

class Place {

    private final int mPlaceName;
    private final int mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    Place(int placeName, int description, int imageResourceId) {
        mPlaceName = placeName;
        mDescription = description;
        mImageResourceId = imageResourceId;

    }

    public int getPlaceName() {
        return mPlaceName;
    }

    public int getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}

