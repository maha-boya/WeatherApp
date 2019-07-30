
package com.maha.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "time",
    "summary",
    "icon",
    "nearestStormDistance",
    "nearestStormBearing",
    "precipIntensity",
    "precipProbability",
    "temperature",
    "apparentTemperature",
    "dewPoint",
    "humidity",
    "pressure",
    "windSpeed",
    "windGust",
    "windBearing",
    "cloudCover",
    "uvIndex",
    "visibility",
    "ozone"
})
public class Currently {

    @JsonProperty("time")
    private Integer time;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("nearestStormDistance")
    private Integer nearestStormDistance;
    @JsonProperty("nearestStormBearing")
    private Integer nearestStormBearing;
    @JsonProperty("precipIntensity")
    private Integer precipIntensity;
    @JsonProperty("precipProbability")
    private Integer precipProbability;
    @JsonProperty("temperature")
    private Float temperature;
    @JsonProperty("apparentTemperature")
    private Float apparentTemperature;
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
    @JsonProperty("windBearing")
    private Integer windBearing;
    @JsonProperty("cloudCover")
    private Float cloudCover;
    @JsonProperty("uvIndex")
    private Integer uvIndex;
    @JsonProperty("visibility")
    private Float visibility;
    @JsonProperty("ozone")
    private Float ozone;

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

    @JsonProperty("nearestStormDistance")
    public Integer getNearestStormDistance() {
        return nearestStormDistance;
    }

    @JsonProperty("nearestStormDistance")
    public void setNearestStormDistance(Integer nearestStormDistance) {
        this.nearestStormDistance = nearestStormDistance;
    }

    @JsonProperty("nearestStormBearing")
    public Integer getNearestStormBearing() {
        return nearestStormBearing;
    }

    @JsonProperty("nearestStormBearing")
    public void setNearestStormBearing(Integer nearestStormBearing) {
        this.nearestStormBearing = nearestStormBearing;
    }

    @JsonProperty("precipIntensity")
    public Integer getPrecipIntensity() {
        return precipIntensity;
    }

    @JsonProperty("precipIntensity")
    public void setPrecipIntensity(Integer precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    @JsonProperty("precipProbability")
    public Integer getPrecipProbability() {
        return precipProbability;
    }

    @JsonProperty("precipProbability")
    public void setPrecipProbability(Integer precipProbability) {
        this.precipProbability = precipProbability;
    }

    @JsonProperty("temperature")
    public Float getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("apparentTemperature")
    public Float getApparentTemperature() {
        return apparentTemperature;
    }

    @JsonProperty("apparentTemperature")
    public void setApparentTemperature(Float apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
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

    @JsonProperty("visibility")
    public Float getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Float visibility) {
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

}
