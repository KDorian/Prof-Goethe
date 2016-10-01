package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Brodull on 14.09.2016.
 */
public class B12Kap24Fragment extends Fragment {


    public B12Kap24Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b12_kap24, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView4417);
        String first = "Drei Familien haben den Betrieb wieder aufgebaut, <font color='#EE0000'>damit</font> wir die Nachfrage nach Obst und Gem&#252;se bedienen k&#246;nnen.";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView4418);
        String first1 = "Wir hatten uns zusammengeschlossen, <font color='#EE0000'>damit</font> wir gemeinsam ein Dorf ba&#252;n.";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView4419);
        String first2 = "Wir hatten uns zusammengeschlossen, <font color='#EE0000'>um</font> gemeinsam ein Dorf <font color='#EE0000'>zu</font> bauen.";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView4420);
        String first3 = "Das Subjekt in Haupt- und Nebensatz ist gleich: Man kann <font color='#EE0000'>damit</font> oder <font color='#EE0000'>um &#8230; zu</font> verwenden.";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView4421);
        String first4 = "Die Subjekte in Haupt- und Nebensatz sind verschieden: Man kann nur <font color='#EE0000'>damit</font> vervenden.";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView4425);
        String first5 = "Wir, tun so, <font color='#EE0000'>als ob</font> wir in Sachen Klimaschutz ewig Zeit f&#252;r Ver&#228;nderungen <font color='#EE0000'>h&#228;tten</font>.";
        t5.setText(Html.fromHtml(first5));

        return myInflatedView;
    }


}