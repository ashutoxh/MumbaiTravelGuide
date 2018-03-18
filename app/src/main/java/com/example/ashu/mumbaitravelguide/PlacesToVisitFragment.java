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
public class PlacesToVisitFragment extends Fragment {


    public PlacesToVisitFragment() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Gateway of India", "Waterfront Indo-Saracenic triumphal arch", "Apollo Bandar, Colaba", R.drawable.gateway));
        words.add(new Word("Colaba Causeway", "Handicrafts, books, clothes, shoes, jewellery", "Colaba", R.drawable.colabacauseway));
        words.add(new Word("INS Vikrant", "Ship/Museum", "Sea near Gateway of India", R.drawable.insvikrant));
        words.add(new Word("Elephanta Caves","Cave","10kms from Mumbai Harbour",R.drawable.elephanta));
        words.add(new Word("Mantralaya", "Administrative HQ of the State Govt. of Maharashtra", "NARIMAN POINT", R.drawable.mantralaya));
        words.add(new Word("Queen's Necklace", "An inverted 'C'-shaped six lane road/Popular hangout spot", "Marine Drive", R.drawable.marinedrive));
        words.add(new Word("Fashion Street","Latest trends,clothes and the delicious aroma of street food","Marine Lines",R.drawable.fashionst));
        words.add(new Word("Chhatrapati Shivaji Terminus railway station", "Ornate Victorian railway for local lines", "Chhatrapati Shivaji Terminus Area,Fort", R.drawable.shivajiterminus));
        words.add(new Word("Crawford Market", "Varieties of Day to Day and Gift & Food products", "Chhatrapati Shivaji Terminus Area,Fort", R.drawable.crawford));
        words.add(new Word("Rajabai Clock Tower", "Elegant structure inspired by Big Ben", "Mantralaya, Fort", R.drawable.rajabaitower));
        words.add(new Word("Horniman Circle Gardens", "Historic city-center green space", "Kala Ghoda, Fort", R.drawable.hornimancircle4));
        words.add(new Word("St. Thomas Cathedral", "Grand, historical Anglican cathedral", "Fort", R.drawable.stthomas));
        words.add(new Word("Bombay High Court", "19th-century High Court building", "Fort", R.drawable.bombayhighcourt));
        words.add(new Word("Chhatrapati Shivaji Maharaj Vastu Sangrahalaya", "Elegant, spacious art & history museum", "Mahatma Gandhi Road, Fort", R.drawable.chatshivvastu));
        words.add(new Word("Jehangir Art Gallery", "Art museum and art", "Mahatma Gandhi Road, Kala Ghoda", R.drawable.jahangirart));
        words.add(new Word("Mumba Devi Temple", "Temple for the city's patron goddess", "Mumba Devi Marg, Zaveri Bazar", R.drawable.mumbadevi));
        words.add(new Word("Zaveri Bazar", "The biggest Jewelry Markets in Mumbai", "Kalbadevi", R.drawable.zaveribazar));
        words.add(new Word("Chor Bazar", "Secondhand goods, antiques & furniture.", "Kumbharwada", R.drawable.chorbazar));
        words.add(new Word("Babulnath", "Temple", "Charni Road", R.drawable.babulnath));
        words.add(new Word("Taraporewala Aquarium", "Aquarium", "Marine Drive, Near Charni Road Railway Station", R.drawable.taraporewala));
        words.add(new Word("Lamington Road","The landmark electronicsmarket","Grant Road",R.drawable.lamington));
        words.add(new Word("Mani Bhavan Gandhi Sangrahalaya", "Museum & library dedicated to Gandhi", "Grant Road", R.drawable.manibhavan));
        words.add(new Word("Dr. Bhau Daji Lad Museum", "Longtime museum for cultural treasures", "Dr Baba Saheb Ambedkar Marg, Byculla East", R.drawable.drbajudaji));
        words.add(new Word("Jijamata Udyaan", "Zoo", "Byculla East", R.drawable.jijamataudyan));
        words.add(new Word("Mahalakshmi Temple, Mumbai", "Temple", "Bhulabhai Desai,Mahalaxmi ", R.drawable.mahalakshmitemple));
        words.add(new Word("Haji Ali Dargah", "Island mausoleum & pilgrimage site", "Dargah Rd, Haji Ali", R.drawable.hajiali));
        words.add(new Word("Siddhivinayak Temple", "Grand Hindu temple dedicated to Ganesha", "S.K.Bole Marg, Prabhadevi", R.drawable.sidhivinayak));
        words.add(new Word("Nehru Planetarium", "Facility for astronomy shows & events", "Worli", R.drawable.nehruplanet));
        words.add(new Word("Nehru Science Centre", "Science exhibits, seminars & films", "Worli", R.drawable.nehruscience));
        words.add(new Word("Worli Fort", "Fort", "Worli", R.drawable.worlifort));
        words.add(new Word("Shivaji Park", "Park", "Dadar", R.drawable.shivajipark));
        words.add(new Word("Hindmata Market","Sarees, salwar kameez and readymade sherwanis","Dadar",R.drawable.hindmata));
        words.add(new Word("Mahim Dargah", "Mosque", "Mahim", R.drawable.mahimdargah));
        words.add(new Word("Bandra–Worli Sea Link", "Bridge", "Bandra-Worli", R.drawable.bandraworlisea));
        words.add(new Word("Basilica of Our Lady of the Mount, Bandra", "Historical Catholic church with a feast", "Bandra", R.drawable.mountmary));
        words.add(new Word("Linking Road", "From latest clothes, shoes and accessories", "Bandra", R.drawable.linkingroad));
        words.add(new Word("Hill Road", "Shopping", "Bandra", R.drawable.hillroad));
        words.add(new Word("Bandstand Promenade", "Popular hangout spot, a jogging track and a park", "Bandra", R.drawable.bandstand));
        words.add(new Word("Castella de Aguada", "Portuguese monument with ocean views", "Bandstand Road,Bandra", R.drawable.castella));
        words.add(new Word("Hanging Gardens of Mumbai", "Lush hilltop park with flowers & views", "Malabar Hill", R.drawable.hanginggarden));
        words.add(new Word("Banganga Tank","Temple, architecture, and history","Teen Batti, Malabar Hill" ,R.drawable.bangalatank));
        words.add(new Word("Walkeshwar Temple", "Temple", "Teen Batti, Malabar Hill", R.drawable.walkeshwar));
        words.add(new Word("Juhu Beach", "Beach", "Juhu", R.drawable.juhubeach));
        words.add(new Word("Mahakali Caves", "Cave", "Sunder Nagar, Andheri East", R.drawable.mahakalicaves));
        words.add(new Word("Powai Lake", "Crocodile, lake, and nature", "Powai", R.drawable.powailake)) ;
        words.add(new Word("Aksa Beach", "Beach", "Malad", R.drawable.aksabeach));
        words.add(new Word("Marvé Beach", "Beach", "Marve,Malad", R.drawable.marve));
        words.add(new Word("EsselWorld", "Amusement park, roller coaster, and park", "Gorai, Borivali West", R.drawable.esselworld));
        words.add(new Word("Madh Fort", "Fort", "Madh Island,Malad", R.drawable.madhfort));
        words.add(new Word("Water Kingdom", "Water Park and park", "Gorai,Borivali West", R.drawable.waterkingdom));
        words.add(new Word("Global Vipassana Pagoda", "Massive meditation hall honoring Buddha", "Next to Esselworld, Borivali West", R.drawable.globalpagoda));
        words.add(new Word("Sanjay Gandhi National Park", "National Park", "Borivali(E)", R.drawable.sgnp));
        words.add(new Word("Kanheri Caves", "Caves", "Sanjay Gandhi National Park,Borivali(E)", R.drawable.kanhericaves));
        words.add(new Word("Mandapeshwar Caves", "Cave", "Dahisar West", R.drawable.mandapeshwarcaves));





        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.colorTextPlaces);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
