package com.aaacpl.rest.response.lots;

public class LotStatusResponse {

    private Integer highestBid;
    private Integer higestBidUser;
    private String currentServerTime;
    private Boolean hasHigestBidChanged;
    private String currentLotStatus;
    private String autoBidCount;

    public LotStatusResponse(Boolean hasHigestBidChanged, Integer highestBid, Integer higestBidUser, String currentServerTime, String currentLotStatus
    ,String autoBidCount) {
        this.hasHigestBidChanged = hasHigestBidChanged;
        this.highestBid = highestBid;
        this.higestBidUser = higestBidUser;
        this.currentServerTime = currentServerTime;
        this.currentLotStatus = currentLotStatus;
        this.autoBidCount = autoBidCount;
    }

    public Integer getHighestBid() {
        return highestBid;
    }

    public Integer getHigestBidUser() {
        return higestBidUser;
    }

    public String getCurrentServerTime() {
        return currentServerTime;
    }

    public Boolean getHasHigestBidChanged() {
        return hasHigestBidChanged;
    }

    public String getCurrentLotStatus() {
        return currentLotStatus;
    }

    public String getAutoBidCount() {
        return autoBidCount;
    }

    @Override
    public String toString() {
        return "LotStatusResponse{" +
                "highestBid=" + highestBid +
                ", higestBidUser=" + higestBidUser +
                ", currentServerTime='" + currentServerTime + '\'' +
                ", hasHigestBidChanged=" + hasHigestBidChanged +
                ", currentLotStatus='" + currentLotStatus + '\'' +
                ", autoBidCount='" + autoBidCount + '\'' +
                '}';
    }
}
