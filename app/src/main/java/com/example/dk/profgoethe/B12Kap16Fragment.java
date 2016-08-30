package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 28.08.2016.
 */
public class B12Kap16Fragment extends Fragment {


    public B12Kap16Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b12_kap16, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView4073);
        String first = "Im Haushalt <font color='#EE0000'>brauchte</font> ich in den Jahren vor dem Abitur <font color='#EE0000'>nicht zu</font> helfen.";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView4074);
        String first1 = "Ich <font color='#EE0000'>brauchte nur</font> mein Zimmer in Ordnung <font color='#EE0000'>zu</font> halten.";
        t1.setText(Html.fromHtml(first1));

        return myInflatedView;
    }


}
