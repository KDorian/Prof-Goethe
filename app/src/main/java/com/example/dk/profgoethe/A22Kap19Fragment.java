package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 07.08.2016.
 */
public class A22Kap19Fragment extends Fragment {


    public A22Kap19Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a22_kap19, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView2772);
        String first = "<font color='#EE0000'>aus dem</font> Kino / Caf&#233;";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView2773);
        String first1 = "<font color='#EE0000'>vom</font> Sport / Essen";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView2774);
        String first2 = "<font color='#EE0000'>vom</font> Arzt / <font color='#EE0000'>von</font> Jana";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView2776);
        String first3 = "<font color='#EE0000'>im</font> Kino / Caf&#233;";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView2777);
        String first4 = "<font color='#EE0000'>beim</font> Sport / Essen";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView2778);
        String first5 = "<font color='#EE0000'>beim</font> Arzt / <font color='#EE0000'>bei</font> Jana";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView2780);
        String first6 = "<font color='#EE0000'>ins</font> Kino / Caf&#233;";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView2781);
        String first7 = "<font color='#EE0000'>zum</font> Sport / Essen";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView2782);
        String first8 = "<font color='#EE0000'>zum</font> Arzt / <font color='#EE0000'>zu</font> Jana";
        t8.setText(Html.fromHtml(first8));

        return myInflatedView;
    }


}