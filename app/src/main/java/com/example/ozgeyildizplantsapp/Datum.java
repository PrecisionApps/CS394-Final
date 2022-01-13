
package com.example.ozgeyildizplantsapp;


public class Datum {

    @com.squareup.moshi.Json(name = "city_name")
    private String cityName;
    @com.squareup.moshi.Json(name = "state_code")
    private String stateCode;
    @com.squareup.moshi.Json(name = "country_code")
    private String countryCode;
    @com.squareup.moshi.Json(name = "timezone")
    private String timezone;
    @com.squareup.moshi.Json(name = "lat")
    private Integer lat;
    @com.squareup.moshi.Json(name = "lon")
    private Double lon;
    @com.squareup.moshi.Json(name = "station")
    private String station;
    @com.squareup.moshi.Json(name = "vis")
    private Integer vis;
    @com.squareup.moshi.Json(name = "rh")
    private Integer rh;
    @com.squareup.moshi.Json(name = "dewpt")
    private Integer dewpt;
    @com.squareup.moshi.Json(name = "wind_dir")
    private Integer windDir;
    @com.squareup.moshi.Json(name = "wind_cdir")
    private String windCdir;
    @com.squareup.moshi.Json(name = "wind_cdir_full")
    private String windCdirFull;
    @com.squareup.moshi.Json(name = "wind_speed")
    private Double windSpeed;
    @com.squareup.moshi.Json(name = "temp")
    private Double temp;
    @com.squareup.moshi.Json(name = "app_temp")
    private Double appTemp;
    @com.squareup.moshi.Json(name = "clouds")
    private Integer clouds;
    @com.squareup.moshi.Json(name = "weather")
    private Weather weather;
    @com.squareup.moshi.Json(name = "datetime")
    private String datetime;
    @com.squareup.moshi.Json(name = "ob_time")
    private String obTime;
    @com.squareup.moshi.Json(name = "ts")
    private Integer ts;
    @com.squareup.moshi.Json(name = "sunrise")
    private String sunrise;
    @com.squareup.moshi.Json(name = "sunset")
    private String sunset;
    @com.squareup.moshi.Json(name = "slp")
    private Double slp;
    @com.squareup.moshi.Json(name = "pres")
    private Integer pres;
    @com.squareup.moshi.Json(name = "aqi")
    private Integer aqi;
    @com.squareup.moshi.Json(name = "uv")
    private Double uv;
    @com.squareup.moshi.Json(name = "solar_rad")
    private Double solarRad;
    @com.squareup.moshi.Json(name = "ghi")
    private Double ghi;
    @com.squareup.moshi.Json(name = "dni")
    private Double dni;
    @com.squareup.moshi.Json(name = "dhi")
    private Double dhi;
    @com.squareup.moshi.Json(name = "elev_angle")
    private Integer elevAngle;
    @com.squareup.moshi.Json(name = "hour_angle")
    private Integer hourAngle;
    @com.squareup.moshi.Json(name = "pod")
    private String pod;
    @com.squareup.moshi.Json(name = "precip")
    private Integer precip;
    @com.squareup.moshi.Json(name = "snow")
    private Integer snow;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Integer getLat() {
        return lat;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Integer getVis() {
        return vis;
    }

    public void setVis(Integer vis) {
        this.vis = vis;
    }

    public Integer getRh() {
        return rh;
    }

    public void setRh(Integer rh) {
        this.rh = rh;
    }

    public Integer getDewpt() {
        return dewpt;
    }

    public void setDewpt(Integer dewpt) {
        this.dewpt = dewpt;
    }

    public Integer getWindDir() {
        return windDir;
    }

    public void setWindDir(Integer windDir) {
        this.windDir = windDir;
    }

    public String getWindCdir() {
        return windCdir;
    }

    public void setWindCdir(String windCdir) {
        this.windCdir = windCdir;
    }

    public String getWindCdirFull() {
        return windCdirFull;
    }

    public void setWindCdirFull(String windCdirFull) {
        this.windCdirFull = windCdirFull;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getAppTemp() {
        return appTemp;
    }

    public void setAppTemp(Double appTemp) {
        this.appTemp = appTemp;
    }

    public Integer getClouds() {
        return clouds;
    }

    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getObTime() {
        return obTime;
    }

    public void setObTime(String obTime) {
        this.obTime = obTime;
    }

    public Integer getTs() {
        return ts;
    }

    public void setTs(Integer ts) {
        this.ts = ts;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Double getSlp() {
        return slp;
    }

    public void setSlp(Double slp) {
        this.slp = slp;
    }

    public Integer getPres() {
        return pres;
    }

    public void setPres(Integer pres) {
        this.pres = pres;
    }

    public Integer getAqi() {
        return aqi;
    }

    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    public Double getUv() {
        return uv;
    }

    public void setUv(Double uv) {
        this.uv = uv;
    }

    public Double getSolarRad() {
        return solarRad;
    }

    public void setSolarRad(Double solarRad) {
        this.solarRad = solarRad;
    }

    public Double getGhi() {
        return ghi;
    }

    public void setGhi(Double ghi) {
        this.ghi = ghi;
    }

    public Double getDni() {
        return dni;
    }

    public void setDni(Double dni) {
        this.dni = dni;
    }

    public Double getDhi() {
        return dhi;
    }

    public void setDhi(Double dhi) {
        this.dhi = dhi;
    }

    public Integer getElevAngle() {
        return elevAngle;
    }

    public void setElevAngle(Integer elevAngle) {
        this.elevAngle = elevAngle;
    }

    public Integer getHourAngle() {
        return hourAngle;
    }

    public void setHourAngle(Integer hourAngle) {
        this.hourAngle = hourAngle;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    public Integer getPrecip() {
        return precip;
    }

    public void setPrecip(Integer precip) {
        this.precip = precip;
    }

    public Integer getSnow() {
        return snow;
    }

    public void setSnow(Integer snow) {
        this.snow = snow;
    }

}
