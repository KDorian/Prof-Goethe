package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 17.08.2016.
 */
public class B11Kap02Fragment extends Fragment {


    public B11Kap02Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b11_kap02, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3264);
        String first = "f&#252;hr<font color='#EE0000'>te</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3265);
        String first1 = "f&#252;hr<font color='#EE0000'>test</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView3266);
        String first2 = "f&#252;hr<font color='#EE0000'>te</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView3267);
        String first3 = "f&#252;hr<font color='#EE0000'>ten</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView3268);
        String first4 = "f&#252;hr<font color='#EE0000'>tet</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView3269);
        String first5 = "f&#252;hr<font color='#EE0000'>ten</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView3279);
        String first6 = "g<font color='#EE0000'>ab</font>";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView3280);
        String first7 = "g<font color='#EE0000'>abst</font>";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView3281);
        String first8 = "g<font color='#EE0000'>ab</font>";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView3282);
        String first9 = "g<font color='#EE0000'>aben</font>";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView3283);
        String first10 = "g<font color='#EE0000'>abt</font>";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView3284);
        String first11 = "g<font color='#EE0000'>aben</font>";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView3294);
        String first12 = "br<font color='#EE0000'>achte</font>";
        t12.setText(Html.fromHtml(first12));

        TextView t13 = (TextView) myInflatedView.findViewById(R.id.textView3295);
        String first13 = "br<font color='#EE0000'>achtest</font>";
        t13.setText(Html.fromHtml(first13));

        TextView t14 = (TextView) myInflatedView.findViewById(R.id.textView3296);
        String first14 = "br<font color='#EE0000'>achte</font>";
        t14.setText(Html.fromHtml(first14));

        TextView t15 = (TextView) myInflatedView.findViewById(R.id.textView3297);
        String first15 = "br<font color='#EE0000'>achten</font>";
        t15.setText(Html.fromHtml(first15));

        TextView t16 = (TextView) myInflatedView.findViewById(R.id.textView3298);
        String first16 = "br<font color='#EE0000'>achtet</font>";
        t16.setText(Html.fromHtml(first16));

        TextView t17 = (TextView) myInflatedView.findViewById(R.id.textView3299);
        String first17 = "br<font color='#EE0000'>achten</font>";
        t17.setText(Html.fromHtml(first17));

        return myInflatedView;
    }


}
