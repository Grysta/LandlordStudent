package com.grysta.crud.bean;

public class House {
    private Integer houseId;

    private String houseAddress;

    private String houseType;

    private Integer housePeople;

    private Integer housePrice;

    private Integer houseLandlordId;

    private String houseCanlive;

    private Landlord landlord;
    
    public Landlord getLandlord() {
		return landlord;
	}

	public void setLandlord(Landlord landlord) {
		this.landlord = landlord;
	}

	public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress == null ? null : houseAddress.trim();
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType == null ? null : houseType.trim();
    }

    public Integer getHousePeople() {
        return housePeople;
    }

    public void setHousePeople(Integer housePeople) {
        this.housePeople = housePeople;
    }

    public Integer getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(Integer housePrice) {
        this.housePrice = housePrice;
    }

    public Integer getHouseLandlordId() {
        return houseLandlordId;
    }

    public void setHouseLandlordId(Integer houseLandlordId) {
        this.houseLandlordId = houseLandlordId;
    }

    public String getHouseCanlive() {
        return houseCanlive;
    }

    public void setHouseCanlive(String houseCanlive) {
        this.houseCanlive = houseCanlive == null ? null : houseCanlive.trim();
    }

	public House() {
		super();
		// TODO Auto-generated constructor stub
	}

	public House(Integer houseId, String houseAddress, String houseType, Integer housePeople, Integer housePrice,
			Integer houseLandlordId, String houseCanlive) {
		super();
		this.houseId = houseId;
		this.houseAddress = houseAddress;
		this.houseType = houseType;
		this.housePeople = housePeople;
		this.housePrice = housePrice;
		this.houseLandlordId = houseLandlordId;
		this.houseCanlive = houseCanlive;
	}

	
}