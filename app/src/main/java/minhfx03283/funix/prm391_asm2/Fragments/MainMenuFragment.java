package minhfx03283.funix.prm391_asm2.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import minhfx03283.funix.prm391_asm2.Models.GuideType;
import minhfx03283.funix.prm391_asm2.R;

/**
 * Controls MainMenu Fragment
 * Handles user's selecting guide types
 */
public class MainMenuFragment extends Fragment {

    public MainMenuFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main_menu, container, false);

        // Load menu toolbar
        Toolbar toolbar = rootView.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        toolbar.setTitle(getActivity().getTitle());

        // Load elements for showing a list of places
        ImageButton imbHotel = rootView.findViewById(R.id.imb_hotel);
        ImageButton imbAtm = rootView.findViewById(R.id.imb_atm);
        ImageButton imbHospital = rootView.findViewById(R.id.imb_hospital);
        ImageButton imbRestaurant = rootView.findViewById(R.id.imb_restaurant);

        // Replaces the appropriate fragment
        imbHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frame_layout, new DetailsFragment(GuideType.HOTEL))
                        .addToBackStack(null).commit();
            }
        });

        imbAtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frame_layout, new DetailsFragment(GuideType.ATM))
                        .addToBackStack(null).commit();
            }
        });

        imbHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frame_layout, new DetailsFragment(GuideType.HOSPITAL))
                        .addToBackStack(null).commit();
            }
        });

        imbRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frame_layout, new DetailsFragment(GuideType.RESTAURANT))
                        .addToBackStack(null).commit();
            }
        });

        return rootView;
    }

}