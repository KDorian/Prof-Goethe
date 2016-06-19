package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-19.
 */
public class A11Kap12Fragment extends Fragment {


    public A11Kap12Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a11_kap12, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView634);
        String first = "<font color='#EE0000'>im</font> + Monat / Jahreszeiten: <font color='#EE0000'>im</font> Oktober / Herbst";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView643);
        String first1 = "er / sie <font color='#EE0000'>ist</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView644);
        String first2 = "er / sie <font color='#EE0000'>ist</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView646);
        String first3 = "<font color='#EE0000'>gegangen</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView647);
        String first4 = "an<font color='#EE0000'>ge</font>komm<font color='#EE0000'>en</font>";
        t4.setText(Html.fromHtml(first4));

        return myInflatedView;
    }


}