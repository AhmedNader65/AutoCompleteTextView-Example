package businessmonk.autocompletetextview_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] fruit = {"Apple","Apricot","Avocado","Banana","Bilberry","Blackberry","Blackcurrant","Blueberry","Boysenberry",
            "Currant","Cherry","Cherimoya","Cloudberry","Coconut","Cranberry","Damson","Date","Dragonfruit","Durian","Elderberry",
            "Feijoa","Fig","Goji","berry","Gooseberry","Grape","Raisin","Grapefruit","Guava","Huckleberry","Jabuticaba",
            "Jackfruit","Jambul","Jujube","Juniper","berry","Kiwifruit","Kumquat","Lemon","Lime","Loquat","Longan","Lychee",
            "Mango","Marionberry","Melon","Cantaloupe","Honeydew","Watermelon","Miracle","fruit","Mulberry","Nectarine","Nance",
            "Olive","Orange","Blood","orange","Clementine","Mandarine","Tangerine","Papaya","Passionfruit","Peach","Pear",
            "Persimmon","Physalis","Plantain","Plum","Prune","(dried","plum)","Pineapple","Plumcot","(or","Pluot)","Pomegranate",
            "Pomelo","Purple","mangosteen","Quince","Raspberry","Salmonberry","Rambutan","Redcurrant","Salal","berry","Salak",
            "Satsuma","Star","fruit","Strawberry","Tamarillo","Tamarind","Tomato","Ugli","fruit","Yuzu" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Create ArrayAdapter to manage data in the drop down menu
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,fruit);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        //the minimum number of characters the user must type before the suggestions appear
        autoCompleteTextView.setThreshold(2);
        //set the adapter to the Auto complete text view
        autoCompleteTextView.setAdapter(arrayAdapter);
    }
}
