package com.example.ashu.mumbaitravelguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EateriesFragment extends Fragment {


    public EateriesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Jia The Oriental Kitchen", "Asian, Chinese, Sushi", "COLABA", R.drawable.jiatheorient));
        words.add(new Word("Wasabi By Morimoto - The Taj Mahal Palace", "Japanese, Sushi","The Taj Mahal Palace, Colaba", R.drawable.wasabi));
        words.add(new Word("All Stir Fry", "Asian, Thai, Japanese, Chinese", "COLABA", R.drawable.allstirfry));
        words.add(new Word("Pa Pa Ya", "Sushi, Asian", "COLABA", R.drawable.papaya));
        words.add(new Word("Indigo", "European, Continental", "COLABA", R.drawable.indigocolaba));
        words.add(new Word("Ziya - The Oberoi", "North Indian, South Indian", "NARIMAN POINT", R.drawable.ziyatheoberoi));
        words.add(new Word("Dome - InterContinental", "Finger Food, Sushi", "CHURCHGATE", R.drawable.domeinter));
        words.add(new Word("Papacream", "Desserts,Ice-cream", "CHURCHGATE,Oshiwara,Andheri", R.drawable.papacream));
        words.add(new Word("Umame", "Asian, Chinese, Japanese, Thai, Singaporean", "CHURHCHGATE", R.drawable.umame));
        words.add(new Word("Pizza By The Bay", "Italian, Pizza","CHURCHGATE",  R.drawable.pizzabythebay));
        words.add(new Word("Royal China", "Asian, Chinese", "FORT", R.drawable.royalchina));
        words.add(new Word("The Irish House", "European, American", "FORT,LOWER PAREL", R.drawable.theirish));
        words.add(new Word("Shalimar" , "North Indian, Chinese, Mughlai, Seafood","MOHAMMAD ALI ROAD", R.drawable.shalimar));
        words.add(new Word("Noor Mohammadi Hotel","Mughlai, North Indian", "MOHAMMAD ALI ROAD",  R.drawable.noormoh));
        words.add(new Word("Chinese N Grill",  "Mughlai, Chinese","MOHAMMAD ALI ROAD", R.drawable.chinesengrill));
        words.add(new Word("Suleman Usman Mithaiwala", "Mithai, Fast Food", "MOHAMMAD ALI ROAD", R.drawable.sulemanusman));
        words.add(new Word("Gallops", "North Indian, Continental, Seafood", "MAHALAXSHMI", R.drawable.gallops));
        words.add(new Word("Barbeque Nation", "Chinese, North Indian, Mediterranean, Continental", "WORLI,BANDRA,ANDHERI and more", R.drawable.bbqnation));
        words.add(new Word("The Bohri Kitchen", "Mughlai","WORLI",  R.drawable.thebohrikitchen));
        words.add(new Word("Hard Rock Cafe", "American, Continental, Italian", "WORLI,ANDHERI", R.drawable.hardrock));
        words.add(new Word("Slink & Bardot", "French", "WORLI", R.drawable.slinkandb));
        words.add(new Word("Aer - Four Seasons(Lounge)", "Spanish, Italian, European, Lebanese", "WORLI", R.drawable.aer));
        words.add(new Word("La Folie Lab", "Bakery, Fast Food, Cafe", "LOWER PAREL", R.drawable.lafolie));
        words.add(new Word("Tamasha Lounge", "Finger Food, Continental", "LOWER PAREL", R.drawable.tamasha));
        words.add(new Word("Indigo Delicatessen", "European, Continental, Desserts", "LOWER PAREL", R.drawable.indigodeli));
        words.add(new Word("Tryst(Club)", "Italian, Continental", "LOWER PAREL", R.drawable.tryst));
        words.add(new Word("KOKO Asian Gastropub", "Asian", "LOWER PAREL", R.drawable.koko));
        words.add(new Word("Persian Darbar", "Biryani, North Indian, Chinese, Persian, Mughlai","BANDRA,MAROL",  R.drawable.persiandarbar));
        words.add(new Word("Su Casa", "European", "RECLAMATION, BANDRA", R.drawable.sucasa));
        words.add(new Word("Global Fusion", "Chinese, Japanese, Asian, North Indian", "BANDRA,ANDHERI,MAROL", R.drawable.globalfusion));
        words.add(new Word("5 Spice", "Chinese, Desserts", "BANDRA,ANDHERI,BORIVALI and more", R.drawable.spiece5));
        words.add(new Word("Tea Villa Cafe", "Cafe, Tea, Desserts", "Bandra", R.drawable.teavilla));
        words.add(new Word("Bastian", "Seafood", "BANDRA", R.drawable.bastian));
        words.add(new Word("Dive", "Indian, Chinese, Continental, American", "BANDRA KURLA COMPLEX", R.drawable.divebkc));
        words.add(new Word("Toast & Tonic",  "European, Continental","BANDRA KURLA COMPLEX", R.drawable.toastandtonic));
        words.add(new Word("Yauatcha", "Chinese, Asian", "BANDRA KURLA COMPLEX", R.drawable.yauatcha));
        words.add(new Word("The Korner House", "European, Bar Food, BBQ, Beverages, Burger, Coffee","KHAR",  R.drawable.thekornerhouse));
        words.add(new Word("Bombay Barbeque", "Mughlai, North Indian", "KHAR,ANDHERI,MALAD and more", R.drawable.bombaybbq));
        words.add(new Word("Olive Bar & Kitchen", "Continental, Mediterranean, Italian, European, Lebanese", "KHAR", R.drawable.olivebar));
        words.add(new Word("Bohemian Brew", "Continental, Mediterranean, Moroccan, Lebanese", "KHAR", R.drawable.bohemian));
        words.add(new Word("Barbeque Central", "North Indian, Continental, Mediterranean", "GOREGAON", R.drawable.bbqcentral));
        words.add(new Word("Joey's Pizza", "Pizza", "ANDHERI,MALAD", R.drawable.joeys));
        words.add(new Word("Bora Bora(Lounge)", "Continental, Malaysian, Chinese, North Indian", "ANDHERI", R.drawable.borabora));
        words.add(new Word("Mirchi And Mime", "Cafe, South Indian, Mughlai, North Indian", "POWAI", R.drawable.mirchiandm));
        words.add(new Word("Rude Lounge","North Indian, Italian, Chinese, Continental",  "POWAI,MALAD",R.drawable.rudelounge));
        words.add(new Word("Prithvi Cafe", "Cafe,Fast Food","JUHU",  R.drawable.prithvicafe));
        words.add(new Word("AT MRP", "North Indian, Chinese, Continental", "OshiwaraAndheri", R.drawable.atmrp));
        words.add(new Word("A Bar Called Life", "Modern Indian, Finger Food", "JUHU", R.drawable.abarcalled));
        words.add(new Word("True Tramm Trunk", "Modern Indian, Finger Food", "JUHU", R.drawable.truetramm));
        words.add(new Word("Eva's Pizza", "Pizza", "MAROL", R.drawable.evaspizza));
        words.add(new Word("JW Café - JW Marriott Mumbai Sahar", "Continental, Desserts, Italian, North Indian, Japanese, Thai", "SAHAR,CHAKALA", R.drawable.jwcafe));
        words.add(new Word("Score Sports Bar", "Chinese, Continental", "MALAD", R.drawable.scoresports));
        words.add(new Word("Chili's", "American, Mexican, Tex-Mex, Salad, Steak, Burger, Chili", "Inorbit Mall, Malad", R.drawable.chilis));
        words.add(new Word("Daffodils 23", "Mexican, Fast Food, Desserts, Italian, North Indian, Chinese", "MALAD,BORIVALI", R.drawable.ddafodils));
        words.add(new Word("ONYX Lounge", "North Indian, Continental", "BORIVALI", R.drawable.onyx));
        words.add(new Word("Pangat", "North Indian, Chinese, Malwani, Konkan", "BORIVALI,DAHISAR", R.drawable.pangat));
        words.add(new Word("The Fusion Kitchen", "Mexican,American,Italian,North Indian,Chinese,European", "BORIVALI", R.drawable.thefusion));
        words.add(new Word("Borivali Biryani Centre","North Indian, Mughlai, Biryani","BORIVALI",R.drawable.bbcbir));
        words.add(new Word("Sai Palace Bar and Restaurant", "North Indian, Chinese, Seafood", "MIRA-BHAYANDAR", R.drawable.saipalace));
        words.add(new Word("Dara's Dhaba", "North Indian, Mughlai, Chinese", "MIRA ROAD", R.drawable.daras));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.colorTextEateries);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
