package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 18.08.2016.
 */
public class B11Kap03Fragment extends Fragment {


    public B11Kap03Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b11_kap03, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3336);
        String first = "Das ist der Mann, <font color='#EE0000'>dem</font> ich geholfen habe.";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3337);
        String first1 = "Das ist das M&#228;dchen, <font color='#EE0000'>dem</font> ich geholfen habe.";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView3338);
        String first2 = "Das ist die Dame, <font color='#EE0000'>der</font> ich geholfen habe.";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView3339);
        String first3 = "Das sind die Kunden, <font color='#EE0000'>denen</font> ich geholfen habe.";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView3343);
        String first4 = "<font color='#EE0000'>Durch die</font> Fenster blickt man ins Gr&#252;ne.";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView3344);
        String first5 = "Hier sind die Fenster, <font color='#EE0000'>durch die man</font> ins Gr&#252;ne blickt.";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView3347);
        String first6 = "Ich sa&#223; <font color='#EE0000'>an dem</font> Ofen.";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView3348);
        String first7 = "Das ist der Ofen, <font color='#EE0000'>an dem</font> ich sa&#223;.";
        t7.setText(Html.fromHtml(first7));

        return myInflatedView;
    }


}
