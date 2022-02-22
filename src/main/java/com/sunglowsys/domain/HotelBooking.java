package com.sunglowsys.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

@Entity
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    private String checkInDate;

    @NotEmpty
    private String checkOutDate;

    @NotEmpty
    private Integer totalGuest;

    @NotEmpty
    private Integer no_ofGuest;

    @NotEmpty
    private Integer no_ofNight;

    @NotEmpty
    private Integer no_ofRooms;

    @NotEmpty
    private Double bookingAmount;

    @NotEmpty
    private Integer customerId;

    @NotEmpty
    private Integer hotelId;

    @NotEmpty
    private Integer roomTypeId;

    @NotEmpty
    private Integer ratePlan;

    public HotelBooking() {
    }

    public HotelBooking(String checkInDate, String checkOutDate, Integer totalGuest, Integer no_ofGuest, Integer no_ofNight, Integer no_ofRooms, Double bookingAmount, Integer customerId, Integer hotelId, Integer roomTypeId, Integer ratePlan) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalGuest = totalGuest;
        this.no_ofGuest = no_ofGuest;
        this.no_ofNight = no_ofNight;
        this.no_ofRooms = no_ofRooms;
        this.bookingAmount = bookingAmount;
        this.customerId = customerId;
        this.hotelId = hotelId;
        this.roomTypeId = roomTypeId;
        this.ratePlan = ratePlan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Integer getTotalGuest() {
        return totalGuest;
    }

    public void setTotalGuest(Integer totalGuest) {
        this.totalGuest = totalGuest;
    }

    public Integer getNo_ofGuest() {
        return no_ofGuest;
    }

    public void setNo_ofGuest(Integer no_ofGuest) {
        this.no_ofGuest = no_ofGuest;
    }

    public Integer getNo_ofNight() {
        return no_ofNight;
    }

    public void setNo_ofNight(Integer no_ofNight) {
        this.no_ofNight = no_ofNight;
    }

    public Integer getNo_ofRooms() {
        return no_ofRooms;
    }

    public void setNo_ofRooms(Integer no_ofRooms) {
        this.no_ofRooms = no_ofRooms;
    }

    public Double getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(Double bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
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
        HotelBooking that = (HotelBooking) o;
        return Objects.equals(id, that.id) && Objects.equals(checkInDate, that.checkInDate) && Objects.equals(checkOutDate, that.checkOutDate) && Objects.equals(totalGuest, that.totalGuest) && Objects.equals(no_ofGuest, that.no_ofGuest) && Objects.equals(no_ofNight, that.no_ofNight) && Objects.equals(no_ofRooms, that.no_ofRooms) && Objects.equals(bookingAmount, that.bookingAmount) && Objects.equals(customerId, that.customerId) && Objects.equals(hotelId, that.hotelId) && Objects.equals(roomTypeId, that.roomTypeId) && Objects.equals(ratePlan, that.ratePlan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, checkInDate, checkOutDate, totalGuest, no_ofGuest, no_ofNight, no_ofRooms, bookingAmount, customerId, hotelId, roomTypeId, ratePlan);
    }

    @Override
    public String toString() {
        return "HotelBooking{" +
                "id=" + id +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", totalGuest=" + totalGuest +
                ", no_ofGuest=" + no_ofGuest +
                ", no_ofNight=" + no_ofNight +
                ", no_ofRooms=" + no_ofRooms +
                ", bookingAmount=" + bookingAmount +
                ", customerId=" + customerId +
                ", hotelId=" + hotelId +
                ", roomTypeId=" + roomTypeId +
                ", ratePlan=" + ratePlan +
                '}';
    }
}
