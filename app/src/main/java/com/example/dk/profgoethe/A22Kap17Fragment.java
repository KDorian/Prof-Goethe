package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 05.08.2016.
 */
public class A22Kap17Fragment extends Fragment {


    public A22Kap17Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a22_kap17, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView2675);
        String first = "<font color='#EE0000'>ans</font> Meer";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView2676);
        String first1 = "<font color='#EE0000'>an</font> die K&#252;ste";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView2677);
        String first2 = "<font color='#EE0000'>an</font> den Bodensee / Strand";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView2678);
        String first3 = "<font color='#EE0000'>auf</font> eine Insel";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView2679);
        String first4 = "<font color='#EE0000'>aufs</font> Land";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView2680);
        String first5 = "<font color='#EE0000'>in</font> die W&#252;ste / die Berge / den S&#252;den / Wald";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView2681);
        String first6 = "<font color='#EE0000'>ins</font> Gebirge";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView2682);
        String first7 = "<font color='#EE0000'>nach</font> Rum&#228;nien / Berlin";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView2683);
        String first8 = "! <font color='#EE0000'>in</font> die Schweiz";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView2684);
        String first9 = "<font color='#EE0000'>am</font> Meer";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView2685);
        String first10 = "<font color='#EE0000'>an</font> der K&#252;ste";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView2686);
        String first11 = "<font color='#EE0000'>am</font> Bodensee / Strand";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView2687);
        String first12 = "<font color='#EE0000'>auf</font> einer Insel";
        t12.setText(Html.fromHtml(first12));

        TextView t13 = (TextView) myInflatedView.findViewById(R.id.textView2688);
        String first13 = "<font color='#EE0000'>auf</font> dem Land";
        t13.setText(Html.fromHtml(first13));

        TextView t14 = (TextView) myInflatedView.findViewById(R.id.textView2689);
        String first14 = "<font color='#EE0000'>in</font> der W&#252;ste / den Berge";
        t14.setText(Html.fromHtml(first14));

        TextView t15 = (TextView) myInflatedView.findViewById(R.id.textView2690);
        String first15 = "<font color='#EE0000'>im</font> Wald / Gebirge / S&#252;den";
        t15.setText(Html.fromHtml(first15));

        TextView t16 = (TextView) myInflatedView.findViewById(R.id.textView2691);
        String first16 = "<font color='#EE0000'>nach</font> Rum&#228;nien / Berlin";
        t16.setText(Html.fromHtml(first16));

        TextView t17 = (TextView) myInflatedView.findViewById(R.id.textView2692);
        String first17 = "! <font color='#EE0000'>in</font> die Schweiz";
        t17.setText(Html.fromHtml(first17));

        return myInflatedView;
    }


}