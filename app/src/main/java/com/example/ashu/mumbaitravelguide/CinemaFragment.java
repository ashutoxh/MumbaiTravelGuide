package com.example.ashu.mumbaitravelguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CinemaFragment extends Fragment {


    public CinemaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Regal Cinema", "Colaba", "-1", R.drawable.regalcinemacolaba));
        words.add(new Word("INOX:Laserplex:CR2", "Nariman Point", "-1", R.drawable.laserplexcr2));
        words.add(new Word("New Excelsior Mukta A2 Cinemas", "Fort", "-1", R.drawable.newexcelsiormukta));
        words.add(new Word("Sterling Cineplex", "Fort", "-1", R.drawable.stelingcineplex));
        words.add(new Word("Liberty Cinema", "Marine Lines", "-1", R.drawable.libertycinema));
        words.add(new Word("Roxy Cinema", "Charni Road", "-1", R.drawable.roxy));
        words.add(new Word("Super Cinema", "Grant Road", "-1", R.drawable.supercinema));
        words.add(new Word("Mukta A2 Cinemas:Jai Hind", "Lalbaugh", "-1", R.drawable.muktaa2lalbaugh));
        words.add(new Word("PVR:Phoenix", "Lower Parel", "-1", R.drawable.highstreetphoenix));
        words.add(new Word("Deepak Cinema", "Lower Parel", "-1",R.drawable.deepakcinema ));
        words.add(new Word("Premiere Cinema", "Dadar(E)", "-1", R.drawable.premierecinemadadar));
        words.add(new Word("Gold Cinema", "Dadar(E)", "-1", R.drawable.goldcinemadadar));
        words.add(new Word("Chitra Cinema", "Dadar(E)", "-1", R.drawable.chitracinema));
        words.add(new Word("Sharada Cinema", "Dadar(E)", "-1", R.drawable.sharada));
        words.add(new Word("INOX:Nakshatra Mall", "Dadar(W)", "-1", R.drawable.nakshatradadar));
        words.add(new Word("Plaza Cinema", "Dadar", "-1", R.drawable.plazadadar));
        words.add(new Word("Citylight Cinema", "Mahim", "-1", R.drawable.citylightmahim));
        words.add(new Word("Paradise E-Square Cinema", "Mahim", "-1", R.drawable.paradisemahim));
        words.add(new Word("Le Reve(Globus)", "Bandra(W)", "-1", R.drawable.lereveglobus));
        words.add(new Word("RNA Play Cinema:Kalanagar", "Bandra(E)", "-1", R.drawable.rnaplay));
        words.add(new Word("Movietime Suburbia", "Bandra(W)", "-1", R.drawable.subarbia));
        words.add(new Word("G7 Multiplex", "Bandra(W)", "-1", R.drawable.g7mult));
        words.add(new Word("Gold Cinema", "Santacruz(W)", "-1", R.drawable.goldsantacruz));
        words.add(new Word("Bahar Cinema", "Vile Parle(E)", "-1", R.drawable.baharcinema));
        words.add(new Word("Carnival:Sangam", "Andheri", "-1", R.drawable.carnivalsangamandheri));
        words.add(new Word("Cinepolis:Fun Republic Mall", "Andheri", "-1", R.drawable.cinepolisfunrep));
        words.add(new Word("PVR:Citi Mall", "Andheri(W)", "-1", R.drawable.pvrcitimallandheri));
        words.add(new Word("24 Karat", "Jogeshwari", "-1", R.drawable.karat24));
        words.add(new Word("PVR:Oberoi Mall", "Goregaon", "-1", R.drawable.oberoimall));
        words.add(new Word("Carnival:Moviestar", "Goregaon", "-1", R.drawable.carnivalmoviestar));
        words.add(new Word("Cinemax", "Goregaon(W)", "-1", R.drawable.cinemaxgoregaon));
        words.add(new Word("INOX:Inorbit Mall", "Malad(W)", "-1", R.drawable.inorbitmall));
        words.add(new Word("Miraj Thakur Cinemas", "Kandivali(E)", "-1", R.drawable.mirajthakur));
        words.add(new Word("PVR:Growels", "Kandivali(E)", "-1", R.drawable.pvrgrowels));
        words.add(new Word("PVR:Milap", "Kandivali", "-1", R.drawable.pvrmilap));
        words.add(new Word("INOX:Raghuleela Mall", "Kandivali(W)", "-1", R.drawable.raghuleela));
        words.add(new Word("Carnival:Annex Mall", "Borivali", "-1", R.drawable.carnivalannex));
        words.add(new Word("Gold Cinema:Sona", "Borivali(E)", "-1", R.drawable.goldsona));
        words.add(new Word("Diamond", "Borivali", "-1", R.drawable.diamondbori));
        words.add(new Word("Maxus Cinemas", "Borivali(W)", "-1", R.drawable.maxusgorai));
        words.add(new Word("INOX:Thakur Mall", "Dahisar", "-1", R.drawable.inoxthakurmall));
        words.add(new Word("Rassaz Multiplex", "Mira Road", "-1", R.drawable.rassazmiraroad));
        words.add(new Word("Cinemax", "Mira Road", "-1", R.drawable.cinemaxmiraroad));
        words.add(new Word("Maxus Cinemas", "Bhayander", "-1", R.drawable.maxusbhayendar));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.colorTextCinema);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);



        return rootView;

    }
}