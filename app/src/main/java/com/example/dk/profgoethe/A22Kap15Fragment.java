package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 02.08.2016.
 */
public class A22Kap15Fragment extends Fragment {


    public A22Kap15Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a22_kap15, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView2559);
        String first = "<font color='#00FF00'>Wem? (Person)</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView2560);
        String first1 = "<font color='#00FF00'>Ihren Freuden</font> auch";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView2563);
        String first2 = "<font color='#EE0000'>Was? (Sache)</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView2564);
        String first3 = "<font color='#EE0000'>Tatortsendungen</font> kaufen.";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView2572);
        String first4 = "<font color='#00FF00'>Wem? (Person) Dativ</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView2573);
        String first5 = "<font color='#00FF00'>den Zuschauern / ihnen</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView2576);
        String first6 = "<font color='#EE0000'>Was? (Sache) Akkusativ</font>";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView2577);
        String first7 = "<font color='#EE0000'>Abwechslung</font>.";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView2574);
        String first8 = "<font color='#EE0000'>Was? (Sache) Akkusativpronomen</font>";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView2575);
        String first9 = "<font color='#EE0000'>sie</font>";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView2578);
        String first10 = "<font color='#00FF00'>Wem? (Person) Dativ</font>";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView2579);
        String first11 = "<font color='#00FF00'>den Zuschauern. / ihnen.</font>";
        t11.setText(Html.fromHtml(first11));

        return myInflatedView;
    }


}
