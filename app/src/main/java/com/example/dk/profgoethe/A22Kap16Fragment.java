package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 03.08.2016.
 */
public class A22Kap16Fragment extends Fragment {


    public A22Kap16Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a22_kap16, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView2583);
        String first = "Ich w&#252;rde gern wissen, <font color='#00FF00'>ob</font> Sie noch ein Zimmer frei <font color='#00FF00'>haben</font>?";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView2609);
        String first1 = "Darf ich fragen, <font color='#00FF00'>wie lange</font> Sie bleiben <font color='#00FF00'>m&#246;chten</font>?";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView2613);
        String first2 = "<font color='#00FF00'>gegen&#252;ber von / an &#8230; vorbei</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView2614);
        String first3 = "ein<font color='#00FF00'>em</font> / <font color='#00FF00'>dem</font> Fr&#252;hst&#252;cksraum";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView2615);
        String first4 = "ein<font color='#00FF00'>em</font> / <font color='#00FF00'>dem</font> Restaurant";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView2616);
        String first5 = "ein<font color='#00FF00'>er</font> / <font color='#00FF00'>der</font> Bar";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView2617);
        String first6 = "zwei Konferenzr&#228;um<font color='#00FF00'>en</font>";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView2620);
        String first7 = "<font color='#00FF00'>durch</font>";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView2621);
        String first8 = "ein<font color='#00FF00'>en</font> / <font color='#00FF00'>den</font> Fr&#252;hst&#252;cksraum";
        t8.setText(Html.fromHtml(first8));

        return myInflatedView;
    }


}
