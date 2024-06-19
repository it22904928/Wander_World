package com.example.labtest02.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.labtest02.Adapters.CategoryAdapter;
import com.example.labtest02.Adapters.PopularAdapter;
import com.example.labtest02.Domains.CategoryDomain;
import com.example.labtest02.Domains.PopularDomain;
import com.example.labtest02.R;

import java.util.ArrayList;

public class Main_Activity extends AppCompatActivity{


    private RecyclerView.Adapter adapterPopular,adapterCat;
    private RecyclerView recyclerViewPopular,recyclerViewCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("Miami Beach Hotel", "Miami Beach", "in this beach hotel, there are rooms with 2 beds and more full facilities." +
                " and Also there are wifi facility is available for each room in the hotel.",2,true,4.8,"pic1",true,10000));
        items.add(new PopularDomain("Hawaii Beach Hotel", "Hawaii Beach", "in this beach hotel, there are rooms with 1 beds and more full facilities." +
                " and Also there are no wifi facility is available for each room in the hotel.",1,false,5,"pic2",false,25000));
        items.add(new PopularDomain("Ottawa River Hotel-Canada", "Canada", "in this beach hotel, there are rooms with 3 beds and more full facilities." +
                " and Also there are wifi facility is available for each room in the hotel.",3,true,4.3,"pic3",true,30000));

        recyclerViewPopular=findViewById(R.id.view_pop);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterPopular=new PopularAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);




        ArrayList<CategoryDomain> catsList=new ArrayList<>();
        catsList.add(new CategoryDomain("Beaches","cat1","1. Anse Source d'Argent (Seychelles)\n" +
                "2. Whitehaven Beach (Australia) \n" +
                "3. Grace Bay (Turks and Caicos Islands)\n" +
                "4. Tulum Beach (Mexico)\n" +
                "5. Navagio Beach (Zakynthos, Greece)\n" +
                "6. Anse Lazio (Seychelles)\n" +
                "7. Bora Bora (French Polynesia)\n " +
                "8. Matira Beach (Bora Bora, French Polynesia)\n" +
                "9. Pink Sands Beach (Bahamas)\n " +
                "10. Lanikai Beach (Hawaii, USA) "));
        catsList.add(new CategoryDomain("Camps","cat2","1. Serengeti Under Canvas (Tanzania)\n" +
                "2. The Resort at Paws Up (Montana, USA)\n" +
                "3. Longitude 131° (Australia)\n" +
                "4. Four Seasons Tented Camp Golden Triangle (Thailand)\n" +
                "5. Ngorongoro Crater Lodge (Tanzania)\n" +
                "6. Luxury Desert Camps (Various Locations)\n" +
                "7. White Desert Camp (Antarctica)\n " +
                "8. African Bush Camps (Various Locations in Africa)\n" +
                "9. Galapagos Safari Camp (Ecuador)\n " +
                "10.The Highlands (Tanzania)"));
        catsList.add(new CategoryDomain("Forests","cat3","1. Amazon Rainforest (South America)\n" +
                "2. Redwood National and State Parks (California, USA) \n" +
                "3. Black Forest (Germany) \n" +
                "4. Yosemite National Park (California, USA) \n" +
                "5. Monteverde Cloud Forest Reserve (Costa Rica) \n" +
                "6. Tongass National Forest (Alaska, USA) \n" +
                "7. Daintree Rainforest (Australia)\n " +
                "8. Bialowieza Forest (Poland and Belarus) \n" +
                "9. Goblin Forest, Taranaki (New Zealand) \n " +
                "10. Great Bear Rainforest (British Columbia, Canada) "));
        catsList.add(new CategoryDomain("Deserts","cat4","1. Sahara Desert (Africa) \n" +
                "2. Arabian Desert (Middle East) \n" +
                "3. Gobi Desert (Asia)\n" +
                "4. Kalahari Desert (Africa) \n" +
                "5. Great Victoria Desert (Australia) \n" +
                "6. Atacama Desert (South America) \n" +
                "7. Patagonian Desert (South America) \n " +
                "8. Mojave Desert (North America)\n" +
                "9. Sonoran Desert (North America)\n " +
                "10.Thar Desert (Asia) "));
        catsList.add(new CategoryDomain("Mountains","cat5","1. Mount Everest (Nepal/Tibet)\n" +
                "2. Matterhorn (Switzerland/Italy) \n" +
                "3. Mount Fuji (Japan)  \n" +
                "4. Mount Kilimanjaro (Tanzania) \n" +
                "5. Denali (Mount McKinley) (Alaska, USA)  \n" +
                "6.Aoraki / Mount Cook (New Zealand) \n" +
                "7. Torres del Paine (Chile)\n " +
                "8. Mount Rainier (Washington, USA)  \n" +
                "9. Mont Blanc (France/Italy)  \n " +
                "10. Huangshan (Yellow Mountain) (China) "));

        recyclerViewCategory=findViewById(R.id.view_cat);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterCat=new CategoryAdapter(catsList);
        recyclerViewCategory.setAdapter(adapterCat);



    }
}