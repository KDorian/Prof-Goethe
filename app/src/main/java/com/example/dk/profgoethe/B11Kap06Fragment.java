package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 20.08.2016.
 */
public class B11Kap06Fragment extends Fragment {


    public B11Kap06Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b11_kap06, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3456);
        String first = "<font color='#EE0000'>Falls</font> Sie das Essen bereits beendet haben, legen Sie die Serviette neben den Teller.";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3459);
        String first1 = "Legen Sie die Serviette neben den Teller, <font color='#EE0000'>falls</font> Sie das Essen bereits beendet haben.";
        t1.setText(Html.fromHtml(first1));

        return myInflatedView;
    }


}
