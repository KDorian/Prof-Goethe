package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 29.07.2016.
 */
public class A22Kap13Fragment extends Fragment {


    public A22Kap13Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a22_kap13, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView2432);
        String first = "<font color='#EE0000'>Als</font> ich im vierten Semester <font color='#EE0000'>war</font>,";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView2434);
        String first1 = "<font color='#EE0000'>habe ich</font> das Stipendium bekommen.";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView2445);
        String first2 = "<font color='#EE0000'>Ich habe</font> das Stipendium bekommen,";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView2447);
        String first3 = "<font color='#EE0000'>als</font> ich im vierten Semester <font color='#EE0000'>war</font>.";
        t3.setText(Html.fromHtml(first3));

        return myInflatedView;
    }


}
