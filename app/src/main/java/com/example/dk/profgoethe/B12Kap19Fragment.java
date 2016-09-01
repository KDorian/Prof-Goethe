package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 01.09.2016.
 */
public class B12Kap19Fragment extends Fragment {


    public B12Kap19Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b12_kap19, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView4210);
        String first = "<font color='#EE0000'>Je</font> mehr Menschen sich engagieren,";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView4212);
        String first1 = "<font color='#EE0000'>desto / umso</font> besser kann der Verein seine Arbeit machen.";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView4218);
        String first2 = "Gibt es <font color='#EE0000'>denn / eigentlich</font> auch ein Heimatmuseum?";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView4219);
        String first3 = "Auch Sie k&#246;nnten <font color='#EE0000'>doch</font> zum Beispiel eine Petenschaft &#252;bernehmen.";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView4220);
        String first4 = "Ich habe Ihnen <font color='#EE0000'>ja</font> vorhin vom Naturschutzverein erz&#228;hlt.";
        t4.setText(Html.fromHtml(first4));

        return myInflatedView;
    }


}
