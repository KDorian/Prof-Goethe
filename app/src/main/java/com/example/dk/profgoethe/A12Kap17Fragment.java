package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-24.
 */
public class A12Kap17Fragment extends Fragment {


    public A12Kap17Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a12_kap17, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView908);
        String first = "<font color='#EE0000'>ohne</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView909);
        String first1 = "<font color='#EE0000'>mit</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView912);
        String first2 = "<font color='#EE0000'>ohne das / mein</font> Handy";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView913);
        String first3 = "<font color='#EE0000'>mit dem / meinem</font> Handy";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView921);
        String first4 = "<font color='#EE0000'>will</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView922);
        String first5 = "<font color='#EE0000'>willst</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView923);
        String first6 = "<font color='#EE0000'>will</font>";
        t6.setText(Html.fromHtml(first6));

        return myInflatedView;
    }


}
