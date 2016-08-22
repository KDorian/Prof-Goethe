package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 22.08.2016.
 */
public class B11Kap10Fragment extends Fragment {


    public B11Kap10Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b11_kap10, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3664);
        String first = "<font color='#EE0000'>H&#228;tten</font> wir doch die erste Wohnung <font color='#EE0000'>genommen</font>!";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3677);
        String first1 = "<font color='#EE0000'>W&#228;re</font> sie doch nur rechtzeitig <font color='#EE0000'>losgegangen</font>!";
        t1.setText(Html.fromHtml(first1));

        return myInflatedView;
    }


}
