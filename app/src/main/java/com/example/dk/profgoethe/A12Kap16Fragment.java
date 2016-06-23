package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-23.
 */
public class A12Kap16Fragment extends Fragment {


    public A12Kap16Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a12_kap16, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView832);
        String first = "<font color='#EE0000'>vor, nach, in</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView833);
        String first1 = "<font color='#EE0000'>vor, nach, in</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView834);
        String first2 = "<font color='#EE0000'>vor, nach, in</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView835);
        String first3 = "<font color='#EE0000'>vor, nach, in</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView836);
        String first4 = "ein<font color='#EE0000'>em</font> Monat";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView837);
        String first5 = "ein<font color='#EE0000'>em</font> Jahr";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView838);
        String first6 = "ein<font color='#EE0000'>er</font> Stunde";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView841);
        String first7 = "<font color='#EE0000'>f&#252;r</font>";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView842);
        String first8 = "<font color='#EE0000'>f&#252;r</font>";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView843);
        String first9 = "<font color='#EE0000'>f&#252;r</font>";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView844);
        String first10 = "<font color='#EE0000'>f&#252;r</font>";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView845);
        String first11 = "ein<font color='#EE0000'>en</font> Tag";
        t11.setText(Html.fromHtml(first11));

        return myInflatedView;
    }


}
