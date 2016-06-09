package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-09.
 */
public class A11Kap04Fragment extends Fragment {



        public A11Kap04Fragment() {
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // -- inflate the layout for this fragment
            View myInflatedView = inflater.inflate(R.layout.fragment_a11_kap04, container, false);

            // Set the Text to try this out
            TextView t = (TextView) myInflatedView.findViewById(R.id.textView228);
            String first = "<font color='#EE0000'>der</font> Tisch";
            t.setText(Html.fromHtml(first));

            TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView229);
            String first1 = "<font color='#EE0000'>das</font> Bett";
            t1.setText(Html.fromHtml(first1));

            TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView230);
            String first2 = "<font color='#EE0000'>die</font> Lampe";
            t2.setText(Html.fromHtml(first2));

            TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView233);
            String first3 = "<font color='#EE0000'>der</font> Tisch";
            t3.setText(Html.fromHtml(first3));

            TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView235);
            String first4 = "<font color='#EE0000'>das</font> Bett";
            t4.setText(Html.fromHtml(first4));

            TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView237);
            String first5 = "<font color='#EE0000'>die</font> Lampe";
            t5.setText(Html.fromHtml(first5));

            TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView238);
            String first6 = "<font color='#EE0000'>Er</font> kostet &#8230;";
            t6.setText(Html.fromHtml(first6));

            TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView239);
            String first7 = "<font color='#EE0000'>Es</font> kostet &#8230;";
            t7.setText(Html.fromHtml(first7));

            TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView259);
            String first8 = "<font color='#EE0000'>Sie</font> kostet &#8230;";
            t8.setText(Html.fromHtml(first8));

            return myInflatedView;
        }


    }
