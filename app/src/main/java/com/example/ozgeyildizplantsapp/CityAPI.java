
package com.example.ozgeyildizplantsapp;

import java.util.List;


public class CityAPI {

    @com.squareup.moshi.Json(name = "count")
    private String count;
    @com.squareup.moshi.Json(name = "data")
    private List<Datum> data = null;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}
