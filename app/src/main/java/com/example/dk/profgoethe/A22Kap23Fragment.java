package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 14.08.2016.
 */
public class A22Kap23Fragment extends Fragment {


    public A22Kap23Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a22_kap23, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3010);
        String first = "<font color='#EE0000'>der</font> zu mir passt.";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3011);
        String first1 = "<font color='#EE0000'>das</font> so empfehlenswert ist.";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView3012);
        String first2 = "<font color='#EE0000'>die</font> zu mir passt.";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView3013);
        String first3 = "<font color='#EE0000'>die</font> zu uns passen.";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView3014);
        String first4 = "<font color='#EE0000'>den</font> ich liebe.";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView3015);
        String first5 = "<font color='#EE0000'>das</font> ich so gern gelesen habe.";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView3016);
        String first6 = "<font color='#EE0000'>die</font> ich liebe.";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView3017);
        String first7 = "<font color='#EE0000'>die</font> ich machen k&#246;nnte.";
        t7.setText(Html.fromHtml(first7));

        return myInflatedView;
    }


}