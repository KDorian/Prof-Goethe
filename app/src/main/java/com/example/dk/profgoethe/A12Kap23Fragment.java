package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-07-01.
 */
public class A12Kap23Fragment extends Fragment {


    public A12Kap23Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a12_kap23, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView1256);
        String first = "Nomen + <font color='#EE0000'>-los</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView1260);
        String first1 = "wolken<font color='#EE0000'>los</font> (= ohne Wolken)";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView1263);
        String first2 = "Es war wunderbar, <font color='#EE0000'>denn</font> wir hatten ein Traumwetter.";
        t2.setText(Html.fromHtml(first2));

        return myInflatedView;
    }


}
