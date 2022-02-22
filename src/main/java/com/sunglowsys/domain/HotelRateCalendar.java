package com.sunglowsys.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

@Entity
public class HotelRateCalendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    private Double singleOccupancy;

    @NotEmpty
    private Double doubleOccupancy;

    @NotEmpty
    private Double extraAdultPrice;

    @NotEmpty
    private Double extraChildPrice;

    @NotEmpty
    private Integer applicableDays;

    @NotEmpty
    private Integer hotelId;

    @NotEmpty
    private Integer ratePlan;

    public HotelRateCalendar() {
    }

    public HotelRateCalendar(Double singleOccupancy, Double doubleOccupancy, Double extraAdultPrice, Double extraChildPrice, Integer applicableDays, Integer hotelId, Integer ratePlan) {
        this.singleOccupancy = singleOccupancy;
        this.doubleOccupancy = doubleOccupancy;
        this.extraAdultPrice = extraAdultPrice;
        this.extraChildPrice = extraChildPrice;
        this.applicableDays = applicableDays;
        this.hotelId = hotelId;
        this.ratePlan = ratePlan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSingleOccupancy() {
        return singleOccupancy;
    }

    public void setSingleOccupancy(Double singleOccupancy) {
        this.singleOccupancy = singleOccupancy;
    }

    public Double getDoubleOccupancy() {
        return doubleOccupancy;
    }

    public void setDoubleOccupancy(Double doubleOccupancy) {
        this.doubleOccupancy = doubleOccupancy;
    }

    public Double getExtraAdultPrice() {
        return extraAdultPrice;
    }

    public void setExtraAdultPrice(Double extraAdultPrice) {
        this.extraAdultPrice = extraAdultPrice;
    }

    public Double getExtraChildPrice() {
        return extraChildPrice;
    }

    public void setExtraChildPrice(Double extraChildPrice) {
        this.extraChildPrice = extraChildPrice;
    }

    public Integer getApplicableDays() {
        return applicableDays;
    }

    public void setApplicableDays(Integer applicableDays) {
        this.applicableDays = applicableDays;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getRatePlan() {
        return ratePlan;
    }

    public void setRatePlan(Integer ratePlan) {
        this.ratePlan = ratePlan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelRateCalendar that = (HotelRateCalendar) o;
        return Objects.equals(id, that.id) && Objects.equals(singleOccupancy, that.singleOccupancy) && Objects.equals(doubleOccupancy, that.doubleOccupancy) && Objects.equals(extraAdultPrice, that.extraAdultPrice) && Objects.equals(extraChildPrice, that.extraChildPrice) && Objects.equals(applicableDays, that.applicableDays) && Objects.equals(hotelId, that.hotelId) && Objects.equals(ratePlan, that.ratePlan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, singleOccupancy, doubleOccupancy, extraAdultPrice, extraChildPrice, applicableDays, hotelId, ratePlan);
    }

    @Override
    public String toString() {
        return "HotelRateCalendar{" +
                "id=" + id +
                ", singleOccupancy=" + singleOccupancy +
                ", doubleOccupancy=" + doubleOccupancy +
                ", extraAdultPrice=" + extraAdultPrice +
                ", extraChildPrice=" + extraChildPrice +
                ", applicableDays=" + applicableDays +
                ", hotelId=" + hotelId +
                ", ratePlan=" + ratePlan +
                '}';
    }
}
