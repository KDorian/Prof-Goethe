package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 05.09.2016.
 */
public class B12Kap23Fragment extends Fragment {


    public B12Kap23Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b12_kap21, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView4380);
        String first = "<font color='#EE0000'>ohne dass</font> ich auf Komfort verzichte.";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView4381);
        String first1 = "<font color='#EE0000'>ohne</font> auf Komfort <font color='#EE0000'>zu</font> verzichten.";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView4382);
        String first2 = "<font color='#EE0000'>statt dass</font> ich im Stau stehe.";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView4383);
        String first3 = "<font color='#EE0000'>statt</font> im Stau <font color='#EE0000'>zu</font> stehen.";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView4384);
        String first4 = "Gibt es verschiedene Subjekte, verwendet man immer (an)statt / ohne dass: Die B&#252;rger demonstrieren f&#252;r bessere Radwege, <font color='#EE0000'>ohne dass</font> die Politik etwas &#228;ndert. Nur wenn das Subjekt in Haupt- und Nebensatz gleich ist, kann man auch (an)statt / ohne &#8230; zu verwenden.<font color='#EE0000'>um &#8230; herum</font> + Akkusativ";
        t4.setText(Html.fromHtml(first4));

        return myInflatedView;
    }


}
