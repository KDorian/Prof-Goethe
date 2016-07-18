package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-07-17.
 */
public class A21Kap09Fragment extends Fragment {


    public A21Kap09Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a21_kap09, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView2189);
        String first = "gut<font color='#EE0000'>er</font> Lohn";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView2190);
        String first1 = "gro&#223;<font color='#EE0000'>es</font> Lager";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView2191);
        String first2 = "flexibl<font color='#EE0000'>e</font> Arbeitszeit";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView2192);
        String first3 = "klein<font color='#EE0000'>e</font> B&#252;ros";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView2194);
        String first4 = "gut<font color='#EE0000'>en</font> Lohn";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView2195);
        String first5 = "gro&#223;<font color='#EE0000'>es</font> Lager";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView2196);
        String first6 = "flexibl<font color='#EE0000'>e</font> Arbeitszeit";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView2197);
        String first7 = "klein<font color='#EE0000'>e</font> B&#252;ros";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView2199);
        String first8 = "gut<font color='#EE0000'>em</font> Lohn";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView2200);
        String first9 = "gro&#223;<font color='#EE0000'>em</font> Lager";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView2201);
        String first10 = "flexibl<font color='#EE0000'>er</font> Arbeitszeit";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView2202);
        String first11 = "klein<font color='#EE0000'>en</font> B&#252;ros";
        t11.setText(Html.fromHtml(first11));

        return myInflatedView;
    }


}
