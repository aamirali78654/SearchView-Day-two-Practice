package com.example.searchview_daytwo.CustomTwo;

import static android.os.Build.VERSION_CODES.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomSearchTwo extends BaseAdapter


     {
         Context context;
         ArrayList al_names;
         LayoutInflater laylf;
         ArrayList new_names ;


         public CustomSearchTwo(Context context,ArrayList names)
         {
             this.context = context;
             this.al_names = names;
             laylf = LayoutInflater.from(context);
             new_names = new ArrayList<>();
             new_names.addAll(al_names);
         }
         @Override
         public int getCount() {
             return al_names.size();
         }

         @Override
         public Object getItem(int i) {
             return null;
         }

         @Override
         public long getItemId(int i) {
             return 0;
         }

         @Override
         public View getView(int i, View view, ViewGroup viewGroup) {
             View view1 = laylf.inflate(com.example.searchview_daytwo.R.layout.custom_search_two_xml , null);
             TextView tv = view1.findViewById(com.example.searchview_daytwo.R.id.text_vtwo);
             tv.setText(al_names.get(i).toString());

             return view1;
         }
         public void MyFilter(String str)
         {
             al_names.clear();
             for (Object obj : new_names)
             {
                 if(obj.toString().contains(str))
                 {
                     al_names.add(obj.toString());
                 }

             }
             notifyDataSetChanged();

         }
     }
