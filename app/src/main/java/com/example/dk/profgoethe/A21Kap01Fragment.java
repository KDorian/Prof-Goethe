package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-07-09.
 */
public class A21Kap01Fragment extends Fragment {


    public A21Kap01Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a21_kap01, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView1711);
        String first = "<font color='#EE0000'>unser</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView1712);
        String first1 = "<font color='#EE0000'>unser</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView1713);
        String first2 = "<font color='#EE0000'>unsere</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView1714);
        String first3 = "<font color='#EE0000'>unsere</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView1718);
        String first4 = "<font color='#EE0000'>euer</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView1719);
        String first5 = "<font color='#EE0000'>euer</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView1720);
        String first6 = "<font color='#EE0000'>eure</font>";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView1721);
        String first7 = "<font color='#EE0000'>eure</font>";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView1743);
        String first8 = "<font color='#EE0000'>ihr</font>";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView1744);
        String first9 = "<font color='#EE0000'>ihr</font>";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView1745);
        String first10 = "<font color='#EE0000'>ihre</font>";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView1746);
        String first11 = "<font color='#EE0000'>ihre</font>";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView1752);
        String first12 = "<font color='#EE0000'>Ihr</font> Opa";
        t12.setText(Html.fromHtml(first12));

        TextView t13 = (TextView) myInflatedView.findViewById(R.id.textView1753);
        String first13 = "<font color='#EE0000'>Ihr</font> Baby";
        t13.setText(Html.fromHtml(first13));

        TextView t14 = (TextView) myInflatedView.findViewById(R.id.textView1754);
        String first14 = "<font color='#EE0000'>Ihre</font> Tante";
        t14.setText(Html.fromHtml(first14));

        TextView t15 = (TextView) myInflatedView.findViewById(R.id.textView1761);
        String first15 = "<font color='#EE0000'>Ihre</font> Neffen";
        t15.setText(Html.fromHtml(first15));

        TextView t16 = (TextView) myInflatedView.findViewById(R.id.textView1764);
        String first16 = "<font color='#EE0000'>mein</font> Opa";
        t16.setText(Html.fromHtml(first15));

        TextView t17 = (TextView) myInflatedView.findViewById(R.id.textView1769);
        String first17 = "<font color='#EE0000'>mein</font> Baby";
        t17.setText(Html.fromHtml(first17));

        TextView t18 = (TextView) myInflatedView.findViewById(R.id.textView1770);
        String first18 = "<font color='#EE0000'>meine</font> Tante";
        t18.setText(Html.fromHtml(first18));

        TextView t19 = (TextView) myInflatedView.findViewById(R.id.textView1771);
        String first19 = "<font color='#EE0000'>meine</font> Neffen";
        t19.setText(Html.fromHtml(first19));

        TextView t20 = (TextView) myInflatedView.findViewById(R.id.textView1789);
        String first20 = "<font color='#EE0000'>mein<b>en</b></font> Opa";
        t20.setText(Html.fromHtml(first20));

        TextView t21 = (TextView) myInflatedView.findViewById(R.id.textView1790);
        String first21 = "<font color='#EE0000'>mein</font> Baby";
        t21.setText(Html.fromHtml(first21));

        TextView t22 = (TextView) myInflatedView.findViewById(R.id.textView1799);
        String first22 = "<font color='#EE0000'>meine</font> Tante";
        t22.setText(Html.fromHtml(first22));

        TextView t23 = (TextView) myInflatedView.findViewById(R.id.textView1800);
        String first23 = "<font color='#EE0000'>meine</font> Neffen";
        t23.setText(Html.fromHtml(first23));

        TextView t24 = (TextView) myInflatedView.findViewById(R.id.textView1806);
        String first24 = "<font color='#EE0000'>mein<b>em</b></font> Opa";
        t24.setText(Html.fromHtml(first24));

        TextView t25 = (TextView) myInflatedView.findViewById(R.id.textView1808);
        String first25 = "<font color='#EE0000'>mein<b>em</b></font> Baby";
        t25.setText(Html.fromHtml(first25));

        TextView t26 = (TextView) myInflatedView.findViewById(R.id.textView1809);
        String first26 = "<font color='#EE0000'>mein<b>er</b></font> Tante";
        t26.setText(Html.fromHtml(first26));

        TextView t27 = (TextView) myInflatedView.findViewById(R.id.textView1810);
        String first27 = "<font color='#EE0000'>mein<b>er</b></font> Neffen";
        t27.setText(Html.fromHtml(first27));

        return myInflatedView;
    }


}