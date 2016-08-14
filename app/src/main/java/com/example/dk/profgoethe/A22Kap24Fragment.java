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
public class A22Kap24Fragment extends Fragment {


    public A22Kap24Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a22_kap24, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3058);
        String first = "sag<font color='#EE0000'>te</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3059);
        String first1 = "sag<font color='#EE0000'>te</font>st";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView3060);
        String first2 = "sag<font color='#EE0000'>te</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView3061);
        String first3 = "sag<font color='#EE0000'>te</font>n";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView3062);
        String first4 = "sag<font color='#EE0000'>te</font>t";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView3063);
        String first5 = "sag<font color='#EE0000'>te</font>n";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView3066);
        String first6 = "k<font color='#EE0000'>a</font>m";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView3067);
        String first7 = "k<font color='#EE0000'>a</font>mst";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView3068);
        String first8 = "k<font color='#EE0000'>a</font>m";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView3069);
        String first9 = "k<font color='#EE0000'>a</font>men";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView3070);
        String first10 = "k<font color='#EE0000'>a</font>mt";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView3071);
        String first11 = "k<font color='#EE0000'>a</font>men";
        t11.setText(Html.fromHtml(first11));

        return myInflatedView;
    }


}
