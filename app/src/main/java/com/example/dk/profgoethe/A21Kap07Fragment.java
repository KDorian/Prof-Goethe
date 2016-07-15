package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-07-15.
 */
public class A21Kap07Fragment extends Fragment {


    public A21Kap07Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a21_kap07, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView2093);
        String first = "abend<font color='#EE0000'><b>s</b></font> = <font color='#EE0000'>jeden</font>  Abend";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView2094);
        String first1 = "auch so: nacht<font color='#EE0000'>s</font>, morgen<font color='#EE0000'>s</font>, &#8230;, montag<font color='#EE0000'>s</font>, dienstag<font color='#EE0000'>s</font>, &#8230;";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView2098);
        String first2 = "<font color='#EE0000'>zwischen</font> 7:00 und 7:15 Uhr";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView2109);
        String first3 = "k&#246;nn<font color='#EE0000'>te</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView2110);
        String first4 = "k&#246;nn<font color='#EE0000'>test</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView2111);
        String first5 = "k&#246;nn<font color='#EE0000'>te</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView2112);
        String first6 = "k&#246;nn<font color='#EE0000'>ten</font>";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView2113);
        String first7 = "k&#246;nn<font color='#EE0000'>tet</font>";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView2114);
        String first8 = "k&#246;nn<font color='#EE0000'>ten</font>";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView2116);
        String first9 = "soll<font color='#EE0000'>te</font>";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView2117);
        String first10 = "soll<font color='#EE0000'>test</font>";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView2118);
        String first11 = "soll<font color='#EE0000'>te</font>";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView2119);
        String first12 = "soll<font color='#EE0000'>ten</font>";
        t12.setText(Html.fromHtml(first12));

        TextView t13 = (TextView) myInflatedView.findViewById(R.id.textView2120);
        String first13 = "soll<font color='#EE0000'>tet</font>";
        t13.setText(Html.fromHtml(first13));

        TextView t14 = (TextView) myInflatedView.findViewById(R.id.textView2121);
        String first14 = "soll<font color='#EE0000'>ten</font>";
        t14.setText(Html.fromHtml(first14));

        return myInflatedView;
    }


}
