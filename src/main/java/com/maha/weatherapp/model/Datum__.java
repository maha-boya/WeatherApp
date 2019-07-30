
package com.maha.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "time",
    "summary",
    "icon",
    "sunriseTime",
    "sunsetTime",
    "moonPhase",
    "precipIntensity",
    "precipIntensityMax",
    "precipIntensityMaxTime",
    "precipProbability",
    "temperatureHigh",
    "temperatureHighTime",
    "temperatureLow",
    "temperatureLowTime",
    "apparentTemperatureHigh",
    "apparentTemperatureHighTime",
    "apparentTemperatureLow",
    "apparentTemperatureLowTime",
    "dewPoint",
    "humidity",
    "pressure",
    "windSpeed",
    "windGust",
    "windGustTime",
    "windBearing",
    "cloudCover",
    "uvIndex",
    "uvIndexTime",
    "visibility",
    "ozone",
    "temperatureMin",
    "temperatureMinTime",
    "temperatureMax",
    "temperatureMaxTime",
    "apparentTemperatureMin",
    "apparentTemperatureMinTime",
    "apparentTemperatureMax",
    "apparentTemperatureMaxTime",
    "precipType"
})
public class Datum__ {

    @JsonProperty("time")
    private Integer time;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("sunriseTime")
    private Integer sunriseTime;
    @JsonProperty("sunsetTime")
    private Integer sunsetTime;
    @JsonProperty("moonPhase")
    private Float moonPhase;
    @JsonProperty("precipIntensity")
    private Integer precipIntensity;
    @JsonProperty("precipIntensityMax")
    private Float precipIntensityMax;
    @JsonProperty("precipIntensityMaxTime")
    private Integer precipIntensityMaxTime;
    @JsonProperty("precipProbability")
    private Float precipProbability;
    @JsonProperty("temperatureHigh")
    private Float temperatureHigh;
    @JsonProperty("temperatureHighTime")
    private Integer temperatureHighTime;
    @JsonProperty("temperatureLow")
    private Float temperatureLow;
    @JsonProperty("temperatureLowTime")
    private Integer temperatureLowTime;
    @JsonProperty("apparentTemperatureHigh")
    private Float apparentTemperatureHigh;
    @JsonProperty("apparentTemperatureHighTime")
    private Integer apparentTemperatureHighTime;
    @JsonProperty("apparentTemperatureLow")
    private Float apparentTemperatureLow;
    @JsonProperty("apparentTemperatureLowTime")
    private Integer apparentTemperatureLowTime;
    @JsonProperty("dewPoint")
    private Float dewPoint;
    @JsonProperty("humidity")
    private Float humidity;
    @JsonProperty("pressure")
    private Float pressure;
    @JsonProperty("windSpeed")
    private Float windSpeed;
    @JsonProperty("windGust")
    private Float windGust;
    @JsonProperty("windGustTime")
    private Integer windGustTime;
    @JsonProperty("windBearing")
    private Integer windBearing;
    @JsonProperty("cloudCover")
    private Float cloudCover;
    @JsonProperty("uvIndex")
    private Integer uvIndex;
    @JsonProperty("uvIndexTime")
    private Integer uvIndexTime;
    @JsonProperty("visibility")
    private Integer visibility;
    @JsonProperty("ozone")
    private Float ozone;
    @JsonProperty("temperatureMin")
    private Float temperatureMin;
    @JsonProperty("temperatureMinTime")
    private Integer temperatureMinTime;
    @JsonProperty("temperatureMax")
    private Float temperatureMax;
    @JsonProperty("temperatureMaxTime")
    private Integer temperatureMaxTime;
    @JsonProperty("apparentTemperatureMin")
    private Float apparentTemperatureMin;
    @JsonProperty("apparentTemperatureMinTime")
    private Integer apparentTemperatureMinTime;
    @JsonProperty("apparentTemperatureMax")
    private Float apparentTemperatureMax;
    @JsonProperty("apparentTemperatureMaxTime")
    private Integer apparentTemperatureMaxTime;
    @JsonProperty("precipType")
    private String precipType;

    @JsonProperty("time")
    public Integer getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Integer time) {
        this.time = time;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("sunriseTime")
    public Integer getSunriseTime() {
        return sunriseTime;
    }

    @JsonProperty("sunriseTime")
    public void setSunriseTime(Integer sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    @JsonProperty("sunsetTime")
    public Integer getSunsetTime() {
        return sunsetTime;
    }

    @JsonProperty("sunsetTime")
    public void setSunsetTime(Integer sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    @JsonProperty("moonPhase")
    public Float getMoonPhase() {
        return moonPhase;
    }

    @JsonProperty("moonPhase")
    public void setMoonPhase(Float moonPhase) {
        this.moonPhase = moonPhase;
    }

    @JsonProperty("precipIntensity")
    public Integer getPrecipIntensity() {
        return precipIntensity;
    }

    @JsonProperty("precipIntensity")
    public void setPrecipIntensity(Integer precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    @JsonProperty("precipIntensityMax")
    public Float getPrecipIntensityMax() {
        return precipIntensityMax;
    }

    @JsonProperty("precipIntensityMax")
    public void setPrecipIntensityMax(Float precipIntensityMax) {
        this.precipIntensityMax = precipIntensityMax;
    }

    @JsonProperty("precipIntensityMaxTime")
    public Integer getPrecipIntensityMaxTime() {
        return precipIntensityMaxTime;
    }

    @JsonProperty("precipIntensityMaxTime")
    public void setPrecipIntensityMaxTime(Integer precipIntensityMaxTime) {
        this.precipIntensityMaxTime = precipIntensityMaxTime;
    }

    @JsonProperty("precipProbability")
    public Float getPrecipProbability() {
        return precipProbability;
    }

    @JsonProperty("precipProbability")
    public void setPrecipProbability(Float precipProbability) {
        this.precipProbability = precipProbability;
    }

    @JsonProperty("temperatureHigh")
    public Float getTemperatureHigh() {
        return temperatureHigh;
    }

    @JsonProperty("temperatureHigh")
    public void setTemperatureHigh(Float temperatureHigh) {
        this.temperatureHigh = temperatureHigh;
    }

    @JsonProperty("temperatureHighTime")
    public Integer getTemperatureHighTime() {
        return temperatureHighTime;
    }

    @JsonProperty("temperatureHighTime")
    public void setTemperatureHighTime(Integer temperatureHighTime) {
        this.temperatureHighTime = temperatureHighTime;
    }

    @JsonProperty("temperatureLow")
    public Float getTemperatureLow() {
        return temperatureLow;
    }

    @JsonProperty("temperatureLow")
    public void setTemperatureLow(Float temperatureLow) {
        this.temperatureLow = temperatureLow;
    }

    @JsonProperty("temperatureLowTime")
    public Integer getTemperatureLowTime() {
        return temperatureLowTime;
    }

    @JsonProperty("temperatureLowTime")
    public void setTemperatureLowTime(Integer temperatureLowTime) {
        this.temperatureLowTime = temperatureLowTime;
    }

    @JsonProperty("apparentTemperatureHigh")
    public Float getApparentTemperatureHigh() {
        return apparentTemperatureHigh;
    }

    @JsonProperty("apparentTemperatureHigh")
    public void setApparentTemperatureHigh(Float apparentTemperatureHigh) {
        this.apparentTemperatureHigh = apparentTemperatureHigh;
    }

    @JsonProperty("apparentTemperatureHighTime")
    public Integer getApparentTemperatureHighTime() {
        return apparentTemperatureHighTime;
    }

    @JsonProperty("apparentTemperatureHighTime")
    public void setApparentTemperatureHighTime(Integer apparentTemperatureHighTime) {
        this.apparentTemperatureHighTime = apparentTemperatureHighTime;
    }

    @JsonProperty("apparentTemperatureLow")
    public Float getApparentTemperatureLow() {
        return apparentTemperatureLow;
    }

    @JsonProperty("apparentTemperatureLow")
    public void setApparentTemperatureLow(Float apparentTemperatureLow) {
        this.apparentTemperatureLow = apparentTemperatureLow;
    }

    @JsonProperty("apparentTemperatureLowTime")
    public Integer getApparentTemperatureLowTime() {
        return apparentTemperatureLowTime;
    }

    @JsonProperty("apparentTemperatureLowTime")
    public void setApparentTemperatureLowTime(Integer apparentTemperatureLowTime) {
        this.apparentTemperatureLowTime = apparentTemperatureLowTime;
    }

    @JsonProperty("dewPoint")
    public Float getDewPoint() {
        return dewPoint;
    }

    @JsonProperty("dewPoint")
    public void setDewPoint(Float dewPoint) {
        this.dewPoint = dewPoint;
    }

    @JsonProperty("humidity")
    public Float getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("pressure")
    public Float getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("windSpeed")
    public Float getWindSpeed() {
        return windSpeed;
    }

    @JsonProperty("windSpeed")
    public void setWindSpeed(Float windSpeed) {
        this.windSpeed = windSpeed;
    }

    @JsonProperty("windGust")
    public Float getWindGust() {
        return windGust;
    }

    @JsonProperty("windGust")
    public void setWindGust(Float windGust) {
        this.windGust = windGust;
    }

    @JsonProperty("windGustTime")
    public Integer getWindGustTime() {
        return windGustTime;
    }

    @JsonProperty("windGustTime")
    public void setWindGustTime(Integer windGustTime) {
        this.windGustTime = windGustTime;
    }

    @JsonProperty("windBearing")
    public Integer getWindBearing() {
        return windBearing;
    }

    @JsonProperty("windBearing")
    public void setWindBearing(Integer windBearing) {
        this.windBearing = windBearing;
    }

    @JsonProperty("cloudCover")
    public Float getCloudCover() {
        return cloudCover;
    }

    @JsonProperty("cloudCover")
    public void setCloudCover(Float cloudCover) {
        this.cloudCover = cloudCover;
    }

    @JsonProperty("uvIndex")
    public Integer getUvIndex() {
        return uvIndex;
    }

    @JsonProperty("uvIndex")
    public void setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
    }

    @JsonProperty("uvIndexTime")
    public Integer getUvIndexTime() {
        return uvIndexTime;
    }

    @JsonProperty("uvIndexTime")
    public void setUvIndexTime(Integer uvIndexTime) {
        this.uvIndexTime = uvIndexTime;
    }

    @JsonProperty("visibility")
    public Integer getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("ozone")
    public Float getOzone() {
        return ozone;
    }

    @JsonProperty("ozone")
    public void setOzone(Float ozone) {
        this.ozone = ozone;
    }

    @JsonProperty("temperatureMin")
    public Float getTemperatureMin() {
        return temperatureMin;
    }

    @JsonProperty("temperatureMin")
    public void setTemperatureMin(Float temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    @JsonProperty("temperatureMinTime")
    public Integer getTemperatureMinTime() {
        return temperatureMinTime;
    }

    @JsonProperty("temperatureMinTime")
    public void setTemperatureMinTime(Integer temperatureMinTime) {
        this.temperatureMinTime = temperatureMinTime;
    }

    @JsonProperty("temperatureMax")
    public Float getTemperatureMax() {
        return temperatureMax;
    }

    @JsonProperty("temperatureMax")
    public void setTemperatureMax(Float temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    @JsonProperty("temperatureMaxTime")
    public Integer getTemperatureMaxTime() {
        return temperatureMaxTime;
    }

    @JsonProperty("temperatureMaxTime")
    public void setTemperatureMaxTime(Integer temperatureMaxTime) {
        this.temperatureMaxTime = temperatureMaxTime;
    }

    @JsonProperty("apparentTemperatureMin")
    public Float getApparentTemperatureMin() {
        return apparentTemperatureMin;
    }

    @JsonProperty("apparentTemperatureMin")
    public void setApparentTemperatureMin(Float apparentTemperatureMin) {
        this.apparentTemperatureMin = apparentTemperatureMin;
    }

    @JsonProperty("apparentTemperatureMinTime")
    public Integer getApparentTemperatureMinTime() {
        return apparentTemperatureMinTime;
    }

    @JsonProperty("apparentTemperatureMinTime")
    public void setApparentTemperatureMinTime(Integer apparentTemperatureMinTime) {
        this.apparentTemperatureMinTime = apparentTemperatureMinTime;
    }

    @JsonProperty("apparentTemperatureMax")
    public Float getApparentTemperatureMax() {
        return apparentTemperatureMax;
    }

    @JsonProperty("apparentTemperatureMax")
    public void setApparentTemperatureMax(Float apparentTemperatureMax) {
        this.apparentTemperatureMax = apparentTemperatureMax;
    }

    @JsonProperty("apparentTemperatureMaxTime")
    public Integer getApparentTemperatureMaxTime() {
        return apparentTemperatureMaxTime;
    }

    @JsonProperty("apparentTemperatureMaxTime")
    public void setApparentTemperatureMaxTime(Integer apparentTemperatureMaxTime) {
        this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
    }

    @JsonProperty("precipType")
    public String getPrecipType() {
        return precipType;
    }

    @JsonProperty("precipType")
    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

}
