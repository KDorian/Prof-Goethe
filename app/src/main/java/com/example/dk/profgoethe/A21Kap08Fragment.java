package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-07-16.
 */
public class A21Kap08Fragment extends Fragment {


    public A21Kap08Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a21_kap08, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView2152);
        String first = "<font color='#EE0000'>weil</font> meine Krankheit so schlimm <font color='#EE0000'>ist</font>.";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView2182);
        String first1 = "<font color='#EE0000'>weil</font> du so viel auf deinen K&#246;rper <font color='#EE0000'>h&#246;rst</font>.";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView2157);
        String first2 = "<font color='#EE0000'>Deshalb will</font> er mir nichts sagen.";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView2184);
        String first3 = "<font color='#EE0000'>Deshalb hast</font> du Probleme.";
        t3.setText(Html.fromHtml(first3));

        return myInflatedView;
    }


}