package minhfx03283.funix.prm391_asm2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NavUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import static minhfx03283.funix.prm391_asm2.GuideType.ATM;
import static minhfx03283.funix.prm391_asm2.GuideType.BUS;
import static minhfx03283.funix.prm391_asm2.GuideType.HOSPITAL;
import static minhfx03283.funix.prm391_asm2.GuideType.HOTEL;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String GUIDE_TYPE = "typeOfGuide";
    int TypeOfGuide;
    GuideUtils mGuideUtils = new GuideUtils();
    List<GuideType> mGuideTypes = new ArrayList<>();
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DetailsFragment() {
        // Required empty public constructor
    }

    public DetailsFragment(int typeOfGuide) {
        TypeOfGuide = typeOfGuide;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param typeOfGuide type number of guide.
     * @return A new instance of fragment DetailsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailsFragment newInstance(int typeOfGuide) {
        DetailsFragment fragment = new DetailsFragment();
        Bundle args = new Bundle();
        args.putInt(GUIDE_TYPE, typeOfGuide);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = LayoutInflater.from(this.getContext())
                .inflate(R.layout.fragment_details, null);

        Toolbar toolbar = rootView.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);


        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_back);
            actionBar.setDisplayShowHomeEnabled(true);
        }

        RecyclerView rvGuides = rootView.findViewById(R.id.rvGuides);

        switch (TypeOfGuide) {
            case HOTEL:
                mGuideTypes = mGuideUtils.addBulkPlaces(HOTEL);
                toolbar.setTitle(getResources().getString(R.string.hotel_tittle));
                break;
            case ATM:
                mGuideTypes = mGuideUtils.addBulkPlaces(ATM);
                toolbar.setTitle(getResources().getString(R.string.atm_tittle));
                break;
            case HOSPITAL:
                mGuideTypes = mGuideUtils.addBulkPlaces(HOSPITAL);
                toolbar.setTitle(getResources().getString(R.string.hospital_tittle));
                break;
            case BUS:
                mGuideTypes = mGuideUtils.addBulkPlaces(BUS);
                toolbar.setTitle(getResources().getString(R.string.bus_title));
                break;
            default:
                break;
        }

        GuideAdapter adapter = new GuideAdapter(mGuideTypes);
        rvGuides.setAdapter(adapter);
        rvGuides.addItemDecoration(
                new DividerItemDecoration(rvGuides.getContext(), DividerItemDecoration.VERTICAL));
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main, menu);
    }


    /**
     * Performs action if the user selects the Up button.
     *
     * @param item Menu item selected (Up button)
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button. In the case of this
            // activity, the Up button is shown.
            // NavUtils allows users to navigate up one level in the
            // application structure.
//            NavUtils.navigateUpTo(this.getActivity(),
//                    new Intent(this.getContext(), MainActivity.class));
            FragmentManager fm = getActivity().getSupportFragmentManager();
            fm.popBackStack();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    /**
     * Adapter
     */

    public class GuideAdapter extends RecyclerView.Adapter<GuideAdapter.ViewHolder> {
        List<GuideType> mGuideTypeList;

        public GuideAdapter(List<GuideType> guideTypeList) {
            this.mGuideTypeList = guideTypeList;
            Log.d("TAG", "GuideAdapter: adapter created");
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            Log.d("TAG", "onCreateViewHolder: in");

            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);

            View guideView = inflater.inflate(R.layout.details_layout, parent, false);

            ViewHolder viewHolder = new ViewHolder(guideView);

            Log.d("TAG", "onCreateViewHolder: out");
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull GuideAdapter.ViewHolder holder, int position) {


            GuideType guideType = mGuideTypeList.get(position);

            TextView txvName = holder.txvName;
            TextView txvAddress = holder.txvAddress;
            ImageView imgIcon = holder.imvIcon;
            LinearLayout lnlContents = holder.lnlContents;
            LinearLayout lnlViewHolder = holder.lnlViewHolder;
            LinearLayout lnlImageView = holder.lnlImageView;

            txvName.setText(guideType.getName());
            txvAddress.setText(guideType.getAddress());
            // TODO: format background color by GuideType
            switch (guideType.getType()) {
                case HOTEL:
                    imgIcon.setImageResource(R.drawable.hotel);
                    lnlContents.setBackgroundColor(getResources().getColor(R.color.green_hotel));
                    lnlViewHolder.setBackgroundColor(getResources().getColor(R.color.green_hotel));
                    break;
                case ATM:
                    imgIcon.setImageResource(R.drawable.atm_machine);
                    lnlContents.setBackgroundColor(getResources().getColor(R.color.dark_cyan_atm));
                    lnlViewHolder.setBackgroundColor(getResources().getColor(R.color.dark_cyan_atm));
                    break;
                case HOSPITAL:
                    imgIcon.setImageResource(R.drawable.hospital);
                    lnlContents.setBackgroundColor(getResources().getColor(R.color.pink_hospital));
                    lnlViewHolder.setBackgroundColor(getResources().getColor(R.color.pink_hospital));
                    break;
                case BUS:
                    imgIcon.setImageResource(R.drawable.metro);
                    lnlContents.setBackgroundColor(getResources().getColor(R.color.hoki_bus));
                    lnlViewHolder.setBackgroundColor(getResources().getColor(R.color.hoki_bus));
                    break;
            }
            lnlImageView.setBackgroundColor(getResources().getColor(R.color.white));

        }


        @Override
        public int getItemCount() {
            return mGuideTypeList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public ImageView imvIcon;
            public TextView txvName;
            public TextView txvAddress;
            public LinearLayout lnlContents;
            public LinearLayout lnlViewHolder;
            public LinearLayout lnlImageView;


            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                imvIcon = itemView.findViewById(R.id.img_icon);
                txvName = itemView.findViewById(R.id.txt_place_name);
                txvAddress = itemView.findViewById(R.id.txt_address);
                lnlContents = itemView.findViewById(R.id.lnl_contents);
                lnlViewHolder = itemView.findViewById(R.id.lnl_guide_list);
                lnlImageView = itemView.findViewById(R.id.lnl_image_view);

            }
        }
    }
}