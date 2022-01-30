package com.example.flyhigh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class HomeFragment extends Fragment {

    private RequestQueue queue;
    Button btnGetQuote;
    private List<String> quotes;
    TextView txtquote;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View mv= inflater.inflate(R.layout.fragment_home, container, false);

        btnGetQuote = mv.findViewById(R.id.quoteBtn);
        txtquote = mv.findViewById(R.id.txtQuote);

        queue = VolleySingleton.getmInstance(getContext()).getRequestQueue();
        btnGetQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchQuote();
            }
        });




        return mv;
    }

    private void fetchQuote() {
        String url = "https://zenquotes.io/api/quotes";

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++){
                    try {
                        JSONObject jsonObject = response.getJSONObject(i);
                        String q = (String) jsonObject.getString("q");
                        txtquote.setText(q);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(), error.getMessage(), Toast.LENGTH_SHORT ).show();
            }
        });

        queue.add(jsonArrayRequest);
    }

    private void jsonParse() {
        String url = "https://zenquotes.io/api/quotes";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONObject quote = (JSONObject) response;

                    String q = (String) quote.getString("q");
                    System.out.println("TEst test test");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
    }


}
