package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-07-13.
 */
public class A21Kap05Fragment extends Fragment {


    public A21Kap05Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a21_kap05, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView1982);
        String first = "der ber&#252;hmt<font color='#EE0000'>e</font> Dom";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView1983);
        String first1 = "das bunt<font color='#EE0000'>e</font> Fenster";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView1984);
        String first2 = "die neu<font color='#EE0000'>e</font> Kamera";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView1985);
        String first3 = "die nett<font color='#EE0000'>en</font> Leute";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView1987);
        String first4 = "den alt<font color='#EE0000'>en</font> Dom";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView1988);
        String first5 = "das bunt<font color='#EE0000'>e</font> Fenster";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView1989);
        String first6 = "die neu<font color='#EE0000'>e</font> Kamera";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView1990);
        String first7 = "die nett<font color='#EE0000'>en</font> Leute";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView1992);
        String first8 = "dem nett<font color='#EE0000'>en</font> Reisef&#252;hrer";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView1993);
        String first9 = "das bunt<font color='#EE0000'>en</font> Fenster";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView1994);
        String first10 = "die neu<font color='#EE0000'>en</font> Kamera";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView1995);
        String first11 = "die nett<font color='#EE0000'>en</font> Leuten";
        t11.setText(Html.fromHtml(first11));

        return myInflatedView;
    }


}
