package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 13.08.2016.
 */
public class A22Kap22Fragment extends Fragment {


    public A22Kap22Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a22_kap22, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView2975);
        String first = "<font color='#EE0000'>Seit(dem)</font> sie dort wohnt,";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView2976);
        String first1 = "<font color='#EE0000'>Bis</font> man einen Parkplatz findet,";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView2983);
        String first2 = "<font color='#EE0000'>bis</font> ich gemerkt habe: Das lohnt sich nicht.";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView2984);
        String first3 = "<font color='#EE0000'>seit(dem)</font> ich als Firmenberaterin arbeite.";
        t3.setText(Html.fromHtml(first3));

        return myInflatedView;
    }


}