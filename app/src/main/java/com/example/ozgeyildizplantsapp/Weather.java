
package com.example.ozgeyildizplantsapp;


public class Weather {

    @com.squareup.moshi.Json(name = "icon")
    private String icon;
    @com.squareup.moshi.Json(name = "code")
    private String code;
    @com.squareup.moshi.Json(name = "description")
    private String description;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
