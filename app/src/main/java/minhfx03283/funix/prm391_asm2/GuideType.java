package minhfx03283.funix.prm391_asm2;

public class GuideType {
    public static final int  HOTEL = 1;
    public static final int ATM = 2;
    public static final int HOSPITAL = 3;
    public static final int BUS = 4;

    private int mType;
    private String mId;
    private String mName;
    private String mAddress;

    public GuideType() {
    }

    public GuideType(int mType, String mId, String mName, String mAddress) {
        this.mType = mType;
        this.mId = mId;
        this.mName = mName;
        this.mAddress = mAddress;
    }

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
}
