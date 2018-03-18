package com.example.ashu.mumbaitravelguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Orchid City Centre Mall", "CHURCHGATE", "-1", R.drawable.orchidcity));
        words.add(new Word("Heera Panna Shopping Center", "HAJI ALI,ANDHERI", "-1", R.drawable.heerapanna));
        words.add(new Word("Sobo Central Mall", "HAJI ALI", "-1", R.drawable.sobocentral));
        words.add(new Word("High Street Phoenix/Palladium Mall", "LOWER PAREL", "-1", R.drawable.highstreetphoenix));
        words.add(new Word("Nakshatra Mall", "DADAR", "-1", R.drawable.nakshatradadar));
        words.add(new Word("Atria Mall", "WORLI", "-1", R.drawable.atriaworli));
        words.add(new Word("Phoenix Market City", "KURLA", "-1", R.drawable.phoenixmallkurla));
        words.add(new Word("R-City Mall", "GHATKOPAR", "-1", R.drawable.rcityghat));
        words.add(new Word("R Odeon Mall", "GHATKOPAR", "-1", R.drawable.rodean));
        words.add(new Word("Milan Mall", "SANTACRUZ", "-1", R.drawable.milanmall));
        words.add(new Word("Huma Mall", "KANJURMARG", "-1", R.drawable.humamall));
        words.add(new Word("Dynamix Mall", "JUHU", "-1", R.drawable.dynamixmall));
        words.add(new Word("Infiniti Mall", "ANDHERI", "-1", R.drawable.infinityandheri));
        words.add(new Word("Citi Mall", "ANDHERI", "-1", R.drawable.pvrcitimallandheri));
        words.add(new Word("Fun Republic", "ANDHERI", "-1", R.drawable.funrepublicmall));
        words.add(new Word("City Centre Mall", "GOREGAON", "-1", R.drawable.citycentregoree));
        words.add(new Word("Oberoi Mall", "GOREGAON", "-1", R.drawable.oberoimall));
        words.add(new Word("The Hub Mall", "GOREGAON", "-1", R.drawable.thhubmall));
        words.add(new Word("Infiniti Mall - 2", "MALAD", "-1", R.drawable.infinitymalad));
        words.add(new Word("Inorbit Mall", "MALAD", "-1", R.drawable.inorbitmall));
        words.add(new Word("Evershine Mall", "MALAD", "-1", R.drawable.evershinemall));
        words.add(new Word("Growel's 101 ", "KANDIVALI", "-1", R.drawable.pvrgrowels));
        words.add(new Word("Raghuleela Mall", "KANDIVALI", "-1", R.drawable.raghuleela));
        words.add(new Word("Moksh Plaza", "BORIVALI", "-1", R.drawable.mokshplaza));
        words.add(new Word("Goyal Shopping Center", "BORIVALI", "-1", R.drawable.goyalshopping));
        words.add(new Word("Thakkar Shopping Mall", "BORIVALI", "-1", R.drawable.thakkarshopping));
        words.add(new Word("Thakur Mall", "DAHISAR", "-1", R.drawable.inoxthakurmall));
        words.add(new Word("Rassaz Shopping Mall", "MIRA ROAD", "-1", R.drawable.rassazmiraroad));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.colorTextMalls);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
    }

