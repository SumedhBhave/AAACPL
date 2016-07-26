package com.aaacpl.bo.request.auction;

public class CreateAuctionRequestBO {

	private String name;
	private int auctionTypeId;
	private String description;
	private Integer deptId;
	private String startDate;
	private String endDate;
	private String tenderStartDate;
	private String tenderEndDate;
	private String catalog;
	private Integer createdBy;
	private Integer updatedBy;
	private Integer isTender;
	private Integer autoBidCount;

	public CreateAuctionRequestBO(String name, int auctionTypeId,
			String description, Integer deptId, String startDate,
			String endDate, String catalog, Integer createdBy, Integer updatedBy, Integer isTender,
								  String tenderStartDate, String tenderEndDate, Integer autoBidCount) {
		this.name = name;
		this.auctionTypeId = auctionTypeId;
		this.description = description;
		this.deptId = deptId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.catalog = catalog;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.isTender = isTender;
		this.tenderStartDate = tenderStartDate;
		this.tenderEndDate = tenderEndDate;
		this.autoBidCount = autoBidCount;

	}

	public String getName() {
		return name;
	}

	public int getAuctionTypeId() {
		return auctionTypeId;
	}

	public String getDescription() {
		return description;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public String getCatalog() {
		return catalog;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public Integer getIsTender() {
		return isTender;
	}

	public String getTenderStartDate() {
		return tenderStartDate;
	}

	public String getTenderEndDate() {
		return tenderEndDate;
	}


	public Integer getAutoBidCount() {
		return autoBidCount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		CreateAuctionRequestBO that = (CreateAuctionRequestBO) o;

		if (auctionTypeId != that.auctionTypeId) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (description != null ? !description.equals(that.description) : that.description != null) return false;
		if (deptId != null ? !deptId.equals(that.deptId) : that.deptId != null) return false;
		if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
		if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
		if (tenderStartDate != null ? !tenderStartDate.equals(that.tenderStartDate) : that.tenderStartDate != null)
			return false;
		if (tenderEndDate != null ? !tenderEndDate.equals(that.tenderEndDate) : that.tenderEndDate != null)
			return false;
		if (catalog != null ? !catalog.equals(that.catalog) : that.catalog != null) return false;
		if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
		if (updatedBy != null ? !updatedBy.equals(that.updatedBy) : that.updatedBy != null) return false;
		if (isTender != null ? !isTender.equals(that.isTender) : that.isTender != null) return false;
		return autoBidCount != null ? autoBidCount.equals(that.autoBidCount) : that.autoBidCount == null;

	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + auctionTypeId;
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (deptId != null ? deptId.hashCode() : 0);
		result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
		result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
		result = 31 * result + (tenderStartDate != null ? tenderStartDate.hashCode() : 0);
		result = 31 * result + (tenderEndDate != null ? tenderEndDate.hashCode() : 0);
		result = 31 * result + (catalog != null ? catalog.hashCode() : 0);
		result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
		result = 31 * result + (updatedBy != null ? updatedBy.hashCode() : 0);
		result = 31 * result + (isTender != null ? isTender.hashCode() : 0);
		result = 31 * result + (autoBidCount != null ? autoBidCount.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "CreateAuctionRequestBO{" +
				"name='" + name + '\'' +
				", auctionTypeId=" + auctionTypeId +
				", description='" + description + '\'' +
				", deptId=" + deptId +
				", startDate='" + startDate + '\'' +
				", endDate='" + endDate + '\'' +
				", tenderStartDate='" + tenderStartDate + '\'' +
				", tenderEndDate='" + tenderEndDate + '\'' +
				", catalog='" + catalog + '\'' +
				", createdBy=" + createdBy +
				", updatedBy=" + updatedBy +
				", isTender=" + isTender +
				", autoBidCount=" + autoBidCount +
				'}';
	}
}
