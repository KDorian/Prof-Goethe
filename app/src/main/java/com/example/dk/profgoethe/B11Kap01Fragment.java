package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 16.08.2016.
 */
public class B11Kap01Fragment extends Fragment {


    public B11Kap01Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b11_kap01, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3121);
        String first = "der H&#252;bsch<font color='#EE0000'>e</font><br/>ein H&#252;bsch<font color='#EE0000'>er</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3124);
        String first1 = "die H&#252;bsch<font color='#EE0000'>e</font><br/>eine H&#252;bsch<font color='#EE0000'>e</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView3125);
        String first2 = "die H&#252;bsch<font color='#EE0000'>en</font><br/>- H&#252;bsch<font color='#EE0000'>e</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView3127);
        String first3 = "den H&#252;bsch<font color='#EE0000'>en</font><br/>einen H&#252;bsch<font color='#EE0000'>en</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView3136);
        String first4 = "die H&#252;bsch<font color='#EE0000'>e</font><br/>eine H&#252;bsch<font color='#EE0000'>e</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView3137);
        String first5 = "die H&#252;bsch<font color='#EE0000'>en</font><br/>- H&#252;bsch<font color='#EE0000'>e</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView3139);
        String first6 = "dem H&#252;bsch<font color='#EE0000'>en</font><br/>einem H&#252;bsch<font color='#EE0000'>en</font>";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView3156);
        String first7 = "der H&#252;bsch<font color='#EE0000'>en</font><br/>einer H&#252;bsch<font color='#EE0000'>en</font>";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView3157);
        String first8 = "den H&#252;bsch<font color='#EE0000'>en</font><br/>- H&#252;bsch<font color='#EE0000'>en</font>";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView3180);
        String first9 = "die / - Kollege<font color='#EE0000'>n</font>";
        t9.setText(Html.fromHtml(first9)); //

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView3192);
        String first10 = "den / einen Kollege<font color='#EE0000'>n</font>";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView3193);
        String first11 = "die / - Kollege<font color='#EE0000'>n</font>";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView3197);
        String first12 = "dem / einem Kollege<font color='#EE0000'>n</font>";
        t12.setText(Html.fromHtml(first12));

        TextView t13 = (TextView) myInflatedView.findViewById(R.id.textView3198);
        String first13 = "den / - Kollege<font color='#EE0000'>n</font>";
        t13.setText(Html.fromHtml(first13));

        TextView t14 = (TextView) myInflatedView.findViewById(R.id.textView3199);
        String first14 = "auch so: der / die Klug<font color='#EE0000'>e</font>, Erwachsen<font color='#EE0000'>e</font>, Gl&#252;cklich<font color='#EE0000'>e</font>";
        t14.setText(Html.fromHtml(first14));

        TextView t15 = (TextView) myInflatedView.findViewById(R.id.textView3210);
        String first15 = "auch so: maskuline Nomen auf: <font color='#EE0000'>-e</font>, <font color='#EE0000'>-ent</font>, <font color='#EE0000'>-ant</font>, Mensch, Nachbar, Herr";
        t15.setText(Html.fromHtml(first15));

        return myInflatedView;
    }


}