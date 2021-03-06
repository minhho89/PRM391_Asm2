package minhfx03283.funix.prm391_asm2;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

import static minhfx03283.funix.prm391_asm2.GuideType.ATM;
import static minhfx03283.funix.prm391_asm2.GuideType.BUS;
import static minhfx03283.funix.prm391_asm2.GuideType.HOSPITAL;
import static minhfx03283.funix.prm391_asm2.GuideType.HOTEL;

public class GuideUtils {
    private List<GuideType> mGuideTypeList;

    public GuideUtils(List<GuideType> mGuideTypeList) {
        this.mGuideTypeList = mGuideTypeList;
    }

    public GuideUtils() {
    }


    public List<GuideType> addBulkPlaces(int TYPE) {
        List<GuideType> guideTypes = new ArrayList<>();
        List<GuideType> filteredList = new ArrayList<>();

        // Hospitals
        guideTypes.add(new GuideType(HOSPITAL, "bv1", "Bệnh Viện Hữu Nghị", "Số 1 – Trần Khánh Dư – Quận Hai Bà Trưng – Hà Nội", new LatLng(21.015531, 105.861770)));
        guideTypes.add(new GuideType(HOSPITAL, "bv2", "Bệnh Viện E, Hà Nội", "89 – Trần Cung – Nghĩa Tân – Cầu Giấy – Hà Nội", new LatLng(21.050158037837218, 105.78951708664282)));
        guideTypes.add(new GuideType(HOSPITAL, "bv3", "Viện Răng Hàm Mặt", "40B – Tràng Thi – Hoàn Kiếm – Hà Nội", new LatLng(21.027560178845448, 105.84639895496508)));
        guideTypes.add(new GuideType(HOSPITAL, "bv4", "Bệnh Viện Tai Mũi Họng Trung Ương", "78 – Đường Giải Phóng – Quận Đống Đa – Hà Nội", new LatLng(20.999707867276324, 105.84061309691533)));
        guideTypes.add(new GuideType(HOSPITAL, "bv5", "Viện Y Học Cổ Truyền Trung Ương", "29 – Phố Nguyễn Bỉnh Khiêm – Quận Hai Bà Trưng – Hà Nội", new LatLng(21.01615659204759, 105.84862279691569)));
        guideTypes.add(new GuideType(HOSPITAL, "bv6", "Bệnh Viện Nội Tiết", "80 – Thái Thịnh II – Thịnh Quang – Đống Đa – Hà Nội", new LatLng(21.01257386507698, 105.81510834837957)));
        guideTypes.add(new GuideType(HOSPITAL, "bv8", "Bệnh Viện Việt Đức", "8 – Phố Phủ Doãn – Quận Hoàn Kiếm – Hà Nội", new LatLng(21.028507563986658, 105.84733484478676)));
        guideTypes.add(new GuideType(HOSPITAL, "bv9", "Bệnh Viện Nhi Trung Ương", "18/879 – Đường La Thành – Quận Đống Đa – Hà Nội", new LatLng(21.025969075883534, 105.80965283924527)));

        // ATM
        guideTypes.add(new GuideType(ATM, "atm1", "ATM Hoàn Kiếm", "17 phố Lý Thường Kiệt, Phường Phan Chu Trinh, Quận Hoàn Kiếm, Hà Nội"));
        guideTypes.add(new GuideType(ATM, "atm2", "ATM Đinh Tiên Hoàng", "7 Đinh Tiên Hoàng, Quận Hoàn Kiếm, Hà Nội"));
        guideTypes.add(new GuideType(ATM, "atm3", "ATM Hội sở", "57 Lý Thường Kiệt, Quận Hoàn Kiếm, Hà Nội"));
        guideTypes.add(new GuideType(ATM, "atm4", "ATM Nam Hà Nội", "236 Lê Thanh Nghị, Quận Hai Bà Trưng, Hà Nội"));
        guideTypes.add(new GuideType(ATM, "atm5", "ATM Hai Bà Trưng","300-302 Trần Khát Chân, Quận Hai Bà Trưng, Hà Nội"));
        guideTypes.add(new GuideType(ATM, "atm6", "ATM Lê Ngọc Hân", "44 Lê Ngọc Hân, Quận Hai Bà Trưng, Hà Nội"));
        guideTypes.add(new GuideType(ATM, "atm7", "ATM Thăng Long", "129-131 Hoàng Quốc Việt, Quận Cầu Giấy, Hà Nội"));
        guideTypes.add(new GuideType(ATM, "atm8", "ATM Phạm Hùng", "Tòa nhà FPT Phạm Hùng, Quận Cầu Giấy, Hà Nội"));
        guideTypes.add(new GuideType(ATM, "atm9", "ATM Khâm Thiên","158 Khâm Thiên, Quận Đống Đa, Hà Nội"));

        // Hotels
        guideTypes.add(new GuideType(HOTEL, "ks1", "The Queen Hotel & Spa", "67 Thuốc Bắc, Hàng Bồ, Hàng Bồ, Quận Hoàn Kiếm, Hà Nội, Việt Nam"));
        guideTypes.add(new GuideType(HOTEL, "ks2", "Hanoi Nostalgia Hotel & Spa", "13-15 Luong Ngoc Quyen, Hang Buom, Hoan Kiem, Hàng Buồm, Quận Hoàn Kiếm, Hà Nội, Việt Nam"));
        guideTypes.add(new GuideType(HOTEL, "ks3", "Church Legend Hotel Hanoi", "46 Ấu Triệu, Phường Hàng Trống, Quận Hoàn Kiếm, Hà Nội, Việt Nam"));
        guideTypes.add(new GuideType(HOTEL, "ks4", "Little Hanoi Diamond Hotel", "11 Bát Đàn, Quận Hoàn Kiếm, Hàng Bồ, Quận Hoàn Kiếm, Hà Nội, Việt Nam"));
        guideTypes.add(new GuideType(HOTEL, "ks5", "Flamingo Dai Lai Resort", "Thôn Ngọc Quang, Xã Ngọc Thanh, Vĩnh Phúc, Phúc Yên, Hà Nội, Việt Nam"));
        guideTypes.add(new GuideType(HOTEL, "ks6", "Annam Legend Hotel", "27 Hàng Bè, Hàng Bạc, Quận Hoàn Kiếm, Hà Nội, Việt Nam"));
        guideTypes.add(new GuideType(HOTEL, "ks7", "Hanoi Zesty Hotel", "20 Hàng Cân, Hàng Đào, Quận Hoàn Kiếm, Hà Nội, Việt Nam"));
        guideTypes.add(new GuideType(HOTEL, "ks8", "Bluebell Hotel", "41 Ngõ Huyện, Phường Hàng Trống, Quận Hoàn Kiếm, Hà Nội, Việt Nam"));

        // Buses
        guideTypes.add(new GuideType(BUS, "bus1", "Tuyến 01", "BX Gia Lâm - BX Yên Nghĩa"));
        guideTypes.add(new GuideType(BUS, "bus2", "Tuyến 02", "Bác cổ - BX Yên Nghĩa"));
        guideTypes.add(new GuideType(BUS, "bus3",  "Tuyến 03A", "BX Giáp Bát - BX Gia Lâm"));
        guideTypes.add(new GuideType(BUS, "bus4", "Tuyến 03B", "Bx Giáp Bát - Vincom - Phúc Lợi"));
        guideTypes.add(new GuideType(BUS, "bus5", "Tuyến 04", "Long Biên - BX Nước Ngầm"));
        guideTypes.add(new GuideType(BUS, "bus6", "Tuyến 05", "Linh Đàm - Phú Diễn"));
        guideTypes.add(new GuideType(BUS, "bus7", "Tuyến 06", "BX. Giáp Bát - Phú Minh (Phú Xuyên)"));
        guideTypes.add(new GuideType(BUS, "bus8",  "Tuyến 07", "Cầu Giấy - Nội Bài"));
        guideTypes.add(new GuideType(BUS, "bus9",  "Tuyến 08", "Long Biên - Đông Mỹ"));

        for (int i = 0; i < guideTypes.size(); i++) {
            if (guideTypes.get(i).getType() == TYPE) {
                filteredList.add(guideTypes.get(i));
            }
        }
        return filteredList;
    }
}
