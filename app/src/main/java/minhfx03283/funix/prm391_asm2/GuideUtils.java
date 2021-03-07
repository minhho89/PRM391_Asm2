package minhfx03283.funix.prm391_asm2;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

import static minhfx03283.funix.prm391_asm2.GuideType.ATM;
import static minhfx03283.funix.prm391_asm2.GuideType.RESTAURANT;
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
        guideTypes.add(new GuideType(ATM, "atm1", "ATM Hoàn Kiếm", "17 phố Lý Thường Kiệt, Phường Phan Chu Trinh, Quận Hoàn Kiếm, Hà Nội", new LatLng(21.021844296206016, 105.85624789691578)));
        guideTypes.add(new GuideType(ATM, "atm2", "ATM Đinh Tiên Hoàng", "7 Đinh Tiên Hoàng, Quận Hoàn Kiếm, Hà Nội", new LatLng(21.032166598586194, 105.85196029691599)));
        guideTypes.add(new GuideType(ATM, "atm3", "ATM Hội sở", "57 Lý Thường Kiệt, Quận Hoàn Kiếm, Hà Nội", new LatLng(21.023860861598468, 105.84829221225701)));
        guideTypes.add(new GuideType(ATM, "atm4", "ATM Nam Hà Nội", "236 Lê Thanh Nghị, Quận Hai Bà Trưng, Hà Nội", new LatLng(21.002198875626352, 105.84269735458601)));
        guideTypes.add(new GuideType(ATM, "atm5", "ATM Hai Bà Trưng","300-302 Trần Khát Chân, Quận Hai Bà Trưng, Hà Nội", new LatLng(21.00946710441486, 105.85867338342145)));
        guideTypes.add(new GuideType(ATM, "atm6", "ATM Lê Ngọc Hân", "44 Lê Ngọc Hân, Quận Hai Bà Trưng, Hà Nội", new LatLng(21.016041122421314, 105.85497888342161)));
        guideTypes.add(new GuideType(ATM, "atm7", "ATM Thăng Long", "129-131 Hoàng Quốc Việt, Quận Cầu Giấy, Hà Nội", new LatLng(21.046145222461387, 105.80083372575159)));
        guideTypes.add(new GuideType(ATM, "atm8", "ATM Phạm Hùng", "Tòa nhà FPT Phạm Hùng, Quận Cầu Giấy, Hà Nội", new LatLng(21.014518010601417, 105.78547505110181)));
        guideTypes.add(new GuideType(ATM, "atm9", "ATM Khâm Thiên","158 Khâm Thiên, Quận Đống Đa, Hà Nội", new LatLng(21.01941966974564, 105.83632983924508)));

        // Hotels
        guideTypes.add(new GuideType(HOTEL, "ks1", "The Queen Hotel & Spa", "67 Thuốc Bắc, Hàng Bồ, Hàng Bồ, Quận Hoàn Kiếm, Hà Nội, Việt Nam", new LatLng(21.034811052763, 105.84822408342197)));
        guideTypes.add(new GuideType(HOTEL, "ks2", "Hanoi Nostalgia Hotel & Spa", "13-15 Luong Ngoc Quyen, Hang Buom, Hoan Kiem, Hàng Buồm, Quận Hoàn Kiếm, Hà Nội, Việt Nam", new LatLng(21.034821124954853, 105.8530905699278)));
        guideTypes.add(new GuideType(HOTEL, "ks3", "Church Legend Hotel Hanoi", "46 Ấu Triệu, Phường Hàng Trống, Quận Hoàn Kiếm, Hà Nội, Việt Nam", new LatLng(21.028687314769055, 105.84835129691588)));
        guideTypes.add(new GuideType(HOTEL, "ks4", "Little Hanoi Diamond Hotel", "11 Bát Đàn, Quận Hoàn Kiếm, Hàng Bồ, Quận Hoàn Kiếm, Hà Nội, Việt Nam", new LatLng(21.034433303852076, 105.84769758526912)));
        guideTypes.add(new GuideType(HOTEL, "ks5", "Flamingo Dai Lai Resort", "Thôn Ngọc Quang, Xã Ngọc Thanh, Vĩnh Phúc, Phúc Yên, Hà Nội, Việt Nam", new LatLng(21.01385429193982, 105.85862057562458)));
        guideTypes.add(new GuideType(HOTEL, "ks6", "Annam Legend Hotel", "27 Hàng Bè, Hàng Bạc, Quận Hoàn Kiếm, Hà Nội, Việt Nam", new LatLng(21.078222068399384, 105.84643835797955)));
        guideTypes.add(new GuideType(HOTEL, "ks7", "Hanoi Zesty Hotel", "20 Hàng Cân, Hàng Đào, Quận Hoàn Kiếm, Hà Nội, Việt Nam", new LatLng(21.034923049945906, 105.8495232680807)));
        guideTypes.add(new GuideType(HOTEL, "ks8", "Bluebell Hotel", "41 Ngõ Huyện, Phường Hàng Trống, Quận Hoàn Kiếm, Hà Nội, Việt Nam", new LatLng(21.029306242845216, 105.8484546410924)));

        // Buses
        guideTypes.add(new GuideType(RESTAURANT, "res1", "Phở Lý Quốc Sư", "số 10 Lý Quốc Sư, Hàng Trống, Hà Nội", new LatLng(21.030706483697603, 105.84875701041004)));
        guideTypes.add(new GuideType(RESTAURANT, "res2", "Lạc Quán", "139 Cầu Giấy, Quan Hoa, Cầu Giấy, Hà Nội", new LatLng(21.03245620698063, 105.79888071213882)));
        guideTypes.add(new GuideType(RESTAURANT, "res3",  "Cơm Tấm Quận 1 – 178 Hàng Bông", "178 Hàng Bông, Hoàn Kiếm, Hà Nội", new LatLng(21.029056714545515, 105.84433512575129)));
        guideTypes.add(new GuideType(RESTAURANT, "res3", "Bún chả- số 74 Hàng Quạt", "74 Hàng Quạt, quận Hoàn Kiếm, Hà Nội", new LatLng(21.032701496597998, 105.84879521225716)));
        guideTypes.add(new GuideType(RESTAURANT, "res4", "Bún ốc Thúy- chợ Đồng Xuân", "11 Ngõ Chợ Đồng Xuân, Quận Hoàn Kiếm, Hà Nội", new LatLng(21.03756163285396, 105.84986941041015)));
        guideTypes.add(new GuideType(RESTAURANT, "res5", "Nhúng Quán – Tây Sơn", "Số 16 Ngõ 298 Tây Sơn, Q. Đống Đa, Hà Nội", new LatLng(21.008167421329738, 105.82161245458609)));
        guideTypes.add(new GuideType(RESTAURANT, "res6", "Bánh cuốn Bà Hoành- phố Thanh Trì", "66 Tô Hiến Thành,  Quận Hai Bà Trưng, Hà Nội", new LatLng(21.013745576988626, 105.84953331040967)));
        guideTypes.add(new GuideType(RESTAURANT, "res7",  "Sapasa 96B Nguyễn Huy Tưởng", "96B Nguyễn Huy Tưởng, P. Thanh Xuân Trung, Q. Thanh Xuân, Hà Nội", new LatLng(20.998696796189503, 105.80598278342121)));
        guideTypes.add(new GuideType(RESTAURANT, "res8",  "Phở chiên giòn- số 206 phố Khâm Thiên", "206 Khâm Thiên,  Quận Đống Đa, Hà Nội", new LatLng(21.019507854699125, 105.8355118257511)));

        for (int i = 0; i < guideTypes.size(); i++) {
            if (guideTypes.get(i).getType() == TYPE) {
                filteredList.add(guideTypes.get(i));
            }
        }
        return filteredList;
    }
}
