package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-15.
 */
public class A11Kap08Fragment extends Fragment {


    public A11Kap08Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a11_kap08, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView429);
        String first = "<font color='#EE0000'>am</font> + Wochentage / Tageszeiten";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView430);
        String first1 = "<font color='#EE0000'>um</font> + Uhrzeiten";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView431);
        String first2 = "<font color='#EE0000'>am</font> Dienstag / <font color='#EE0000'>am</font> Abend";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView432);
        String first3 = "<font color='#EE0000'>um</font> drei Uhr";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView433);
        String first4 = "! <font color='#EE0000'>in</font> der Nacht";
        t4.setText(Html.fromHtml(first4));

        return myInflatedView;
    }


}
