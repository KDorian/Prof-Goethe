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
public class A11Kap05Fragment extends Fragment {


        public A11Kap05Fragment() {
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // -- inflate the layout for this fragment
            View myInflatedView = inflater.inflate(R.layout.fragment_a11_kap05, container, false);

            // Set the Text to try this out
            TextView t = (TextView) myInflatedView.findViewById(R.id.textView269);
            String first = "<font color='#EE0000'>ein</font> Shl&#252;ssel";
            t.setText(Html.fromHtml(first));

            TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView270);
            String first1 = "<font color='#EE0000'>ein</font> Buch";
            t1.setText(Html.fromHtml(first1));

            TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView271);
            String first2 = "<font color='#EE0000'>ein<b>e</b></font> Brille";
            t2.setText(Html.fromHtml(first2));

            TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView273);
            String first3 = "<font color='#EE0000'>kein</font> Shl&#252;ssel";
            t3.setText(Html.fromHtml(first3));

            TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView274);
            String first4 = "<font color='#EE0000'>kein</font> Buch";
            t4.setText(Html.fromHtml(first4));

            TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView275);
            String first5 = "<font color='#EE0000'>kein<b>e</b></font> Brille";
            t5.setText(Html.fromHtml(first5));

            return myInflatedView;
        }
}

