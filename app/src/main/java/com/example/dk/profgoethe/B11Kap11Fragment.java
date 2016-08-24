package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 23.08.2016.
 */
public class B11Kap11Fragment extends Fragment {


    public B11Kap11Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b11_kap11, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3735);
        String first = "Wir <font color='#EE0000'>hatten</font> tats&#228;chlich sechs Kilo Pilze <font color='#EE0000'>gesammelt</font>.";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3739);
        String first1 = "<font color='#EE0000'>Nachdem</font> mir mein Chef das erz&#228;hlt hatte,";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView3745);
        String first2 = "<font color='#EE0000'>nachdem</font> mir mein Chef das erz&#228;hlt hatte.";
        t2.setText(Html.fromHtml(first2));

        return myInflatedView;
    }


}
