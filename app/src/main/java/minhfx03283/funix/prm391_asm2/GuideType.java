package minhfx03283.funix.prm391_asm2;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.android.gms.maps.model.LatLng;

public class GuideType implements Parcelable {
    public static final int  HOTEL = 1;
    public static final int ATM = 2;
    public static final int HOSPITAL = 3;
    public static final int RESTAURANT = 4;

    private int mType;
    private String mId;
    private String mName;
    private String mAddress;
    private LatLng mLatLng;

    public GuideType() {
    }

    public GuideType(int mType, String mId, String mName, String mAddress) {
        this.mType = mType;
        this.mId = mId;
        this.mName = mName;
        this.mAddress = mAddress;
    }

    public GuideType(int mType, String mId, String mName, String mAddress, LatLng mLatLng) {
        this.mType = mType;
        this.mId = mId;
        this.mName = mName;
        this.mAddress = mAddress;
        this.mLatLng = mLatLng;
    }

    public LatLng getLatLng() {
        return mLatLng;
    }

    public void setLatLng(LatLng mLatLng) {
        this.mLatLng = mLatLng;
    }

    protected GuideType(Parcel in) {
        mType = in.readInt();
        mId = in.readString();
        mName = in.readString();
        mAddress = in.readString();
    }

    public static final Creator<GuideType> CREATOR = new Creator<GuideType>() {
        @Override
        public GuideType createFromParcel(Parcel in) {
            return new GuideType(in);
        }

        @Override
        public GuideType[] newArray(int size) {
            return new GuideType[size];
        }
    };

    public int getType() {
        return mType;
    }

    public void setType(int mType) {
        this.mType = mType;
    }

    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    @Override
    public String toString() {
        return "GuideType{" +
                "mType=" + mType +
                ", mId='" + mId + '\'' +
                ", mName='" + mName + '\'' +
                ", mAddress='" + mAddress + '\'' +
                '}' + "\n";
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
