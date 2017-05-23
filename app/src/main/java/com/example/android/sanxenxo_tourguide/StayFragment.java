package com.example.android.sanxenxo_tourguide;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class StayFragment extends Fragment {


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> bars = new ArrayList<>();
        bars.add(new Place(R.string.camping, R.string.camping_desc, R.drawable.paxarinas));
        bars.add(new Place(R.string.hotels, R.string.hotel_desc, R.drawable.hotel));
        bars.add(new Place(R.string.apartments, R.string.apartments_desc, R.drawable.apartment));
        bars.add(new Place(R.string.parador, R.string.parador_desc,  R.drawable.parador));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), bars);

        final ListView listView = (ListView) rootView.findViewById(R.id.places_list);

        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*
                *
                * //TODO: Call related methods e.g
                * Start Intent to DetailsPage (contains details,Booking redirection)
                * depending on Item clicked
                * Place selectedBar = (Place) parent.getItemAtPosition(position);
                * callBooking(selectedBar);
                */
            }
        });


        return rootView;
    }

}
