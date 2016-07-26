package com.aaacpl.bo.request.lots;

public class BidRequestBO {

	private Integer lotId;

	private Integer userId;
	private Long bidAmount;
	private String ipAddress;
	private String localSystemTime;
	private String bidType;

	public BidRequestBO(Integer lotId, Integer userId, Long bidAmount,
			String ipAddress, String localSystemTime, String bidType) {
		this.lotId = lotId;
		this.userId = userId;
		this.bidAmount = bidAmount;
		this.ipAddress = ipAddress;
		this.localSystemTime = localSystemTime;
		this.bidType = bidType;

	}

	public Integer getLotId() {
		return lotId;
	}

	public Integer getUserId() {
		return userId;
	}

	public Long getBidAmount() {
		return bidAmount;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public String getLocalSystemTime() {
		return localSystemTime;
	}

	public String getBidType() {
		return bidType;
	}


	@Override
	public String toString() {
		return "BidRequestBO{" +
				"lotId=" + lotId +
				", userId=" + userId +
				", bidAmount=" + bidAmount +
				", ipAddress='" + ipAddress + '\'' +
				", localSystemTime='" + localSystemTime + '\'' +
				", bidType='" + bidType + '\'' +
				'}';
	}
}
