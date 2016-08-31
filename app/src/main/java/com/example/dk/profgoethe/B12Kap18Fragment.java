package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 31.08.2016.
 */
public class B12Kap18Fragment extends Fragment {


    public B12Kap18Fragment() {
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
        String first = "Die Gr&#252;nde waren <font color='#EE0000'>entweder</font> nicht eingehaltene Wahlversprechen <font color='#EE0000'>oder</font> die Skandale einiger Minister.";
        t.setText(Html.fromHtml(first));

        TextView t = (TextView) myInflatedView.findViewById(R.id.textView4073);
        String first = "<font color='#EE0000'>Weder</font> waren den jungen Leuten die Volksvertretervolksnah genug, <font color='#EE0000'>noch</font> konnten sie die Parteien gut genug voneinander unterscheiden.";
        t.setText(Html.fromHtml(first));

        TextView t = (TextView) myInflatedView.findViewById(R.id.textView4073);
        String first = "<font color='#EE0000'>Zwar</font> h&#228;lt die Mehrheit der Jugendlichen die Demokratie f&#252;r die beste Staatsform, <font color='#EE0000'>aber</font> die etablierten Parteien profitieren kaum davon.";
        t.setText(Html.fromHtml(first));

        return myInflatedView;
    }


}
