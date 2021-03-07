package minhfx03283.funix.prm391_asm2.Fragments;

import android.content.Context;
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

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import minhfx03283.funix.prm391_asm2.Models.GuideType;
import minhfx03283.funix.prm391_asm2.Models.GuideUtils;
import minhfx03283.funix.prm391_asm2.R;

import static minhfx03283.funix.prm391_asm2.Models.GuideType.ATM;
import static minhfx03283.funix.prm391_asm2.Models.GuideType.RESTAURANT;
import static minhfx03283.funix.prm391_asm2.Models.GuideType.HOSPITAL;
import static minhfx03283.funix.prm391_asm2.Models.GuideType.HOTEL;

/**
 * Handles displaying the list of places fragment
 */
public class DetailsFragment extends Fragment {

    private static final String GUIDE_TYPE = "typeOfGuide";
    int TypeOfGuide;
    GuideUtils mGuideUtils = new GuideUtils();
    List<GuideType> mGuideTypes = new ArrayList<>();

    public DetailsFragment() {
        // Required empty public constructor
    }

    public DetailsFragment(int typeOfGuide) {
        TypeOfGuide = typeOfGuide;
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

        // Load toolbar menu
        Toolbar toolbar = rootView.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_back);
            actionBar.setDisplayShowHomeEnabled(true);
        }

        // Implements recyclerView to show the list of places & fills color the views
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
            case RESTAURANT:
                mGuideTypes = mGuideUtils.addBulkPlaces(RESTAURANT);
                toolbar.setTitle(getResources().getString(R.string.restaurant_tittle));
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
            // When user tabs to back button, one level of pop will be turned back
            FragmentManager fm = getActivity().getSupportFragmentManager();
            fm.popBackStack();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    /**
     * RecyclerView Adapter set up
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
                case RESTAURANT:
                    imgIcon.setImageResource(R.drawable.restaurant_dish);
                    lnlContents.setBackgroundColor(getResources().getColor(R.color.hoki_bus));
                    lnlViewHolder.setBackgroundColor(getResources().getColor(R.color.hoki_bus));
                    break;
            }
            lnlImageView.setBackgroundColor(getResources().getColor(R.color.white));

            lnlViewHolder.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Fragment fragment = new MapFragment();
                    // Send object to map fragment from this gragment

                    Bundle bundle = new Bundle();
                    bundle.putParcelable("GuideType", guideType);
                    fragment.setArguments(bundle);

                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.frame_layout, fragment)
                            .addToBackStack(null)
                            .commit();
                }
            });
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