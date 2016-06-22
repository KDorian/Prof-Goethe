package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-22.
 */
public class A12Kap15Fragment extends Fragment {


    public A12Kap15Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a12_kap15, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView797);
        String first = "<font color='#EE0000'>mir</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView798);
        String first1 = "<font color='#EE0000'>dir</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView799);
        String first2 = "<font color='#EE0000'>ihm</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView800);
        String first3 = "<font color='#EE0000'>ihr</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView801);
        String first4 = "<font color='#EE0000'>uns</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView802);
        String first5 = "<font color='#EE0000'>euch</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView803);
        String first6 = "<font color='#EE0000'>ihnen / Ihnen</font>";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView810);
        String first7 = "Das <font color='#EE0000'>geh&#246;rt</font>  mir.";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView811);
        String first8 = "Das <font color='#EE0000'>gef&#228;llt</font>  dir.";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView812);
        String first9 = "Das <font color='#EE0000'>hilft</font> ihm.";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView813);
        String first10 = "Ich <font color='#EE0000'>danke</font> ihr.";
        t10.setText(Html.fromHtml(first10));

        return myInflatedView;
    }


}