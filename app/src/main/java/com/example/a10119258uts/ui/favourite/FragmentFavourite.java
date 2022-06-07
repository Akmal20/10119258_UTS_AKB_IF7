package com.example.a10119258uts.ui.favourite;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a10119258uts.R;

import java.util.ArrayList;

/*
NIM     : 10119258
Nama    : Akmal Jihad Fauzan
Kelas   : IF-7
 */

public class FragmentFavourite extends Fragment {
    // views music
    RecyclerView recyclerViewMusic;
    ArrayList<ModelFavourite> favouriteModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_favourite, container, false);

        // music
        recyclerViewMusic = root.findViewById(R.id.recview_music);
        recyclerViewMusic.setLayoutManager(new LinearLayoutManager(getContext()));

        favouriteModel = new ArrayList<>();

        ModelFavourite music1 = new ModelFavourite(R.drawable.albums, "As If It Your Last", "BLACKPINK");
        favouriteModel.add(music1);
        ModelFavourite music2 = new ModelFavourite(R.drawable.albums, "ICE CREAM", "BLACKPINK");
        favouriteModel.add(music2);
        ModelFavourite music3 = new ModelFavourite(R.drawable.albums, "Wistle", "BLACKPINK");
        favouriteModel.add(music3);
        ModelFavourite music4 = new ModelFavourite(R.drawable.albums, "So Hot", "BLACKPINK");
        favouriteModel.add(music4);

        recyclerViewMusic.setAdapter(new AdapterFavourite(favouriteModel));


        return root;
    }
}
