/**
 * 
 */
package com.sm.backend.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author user
 *
 */
@XmlRootElement
public class StoreDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 00075L;
	private String storeId;
	private String storeName;
	private String storeAddress;
	private String storeType;
	private String storeLocality;
	private String storeCity;
	private String storeMobNo;
	private String ownerName;
	private String emailAddress;
	private String storePincode;
	private String serviceArea;
	
	/**
	 * @return the storeId
	 */
	public String getStoreId() {
		return storeId;
	}
	/**
	 * @param storeId the storeId to set
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	/**
	 * @return the storeName
	 */
	public String getStoreName() {
		return storeName;
	}
	/**
	 * @param storeName the storeName to set
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	/**
	 * @return the storeAddress
	 */
	public String getStoreAddress() {
		return storeAddress;
	}
	/**
	 * @param storeAddress the storeAddress to set
	 */
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	/**
	 * @return the storeType
	 */
	public String getStoreType() {
		return storeType;
	}
	/**
	 * @param storeType the storeType to set
	 */
	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}
	/**
	 * @return the storeLocality
	 */
	public String getStoreLocality() {
		return storeLocality;
	}
	/**
	 * @param storeLocality the storeLocality to set
	 */
	public void setStoreLocality(String storeLocality) {
		this.storeLocality = storeLocality;
	}
	/**
	 * @return the storeCity
	 */
	public String getStoreCity() {
		return storeCity;
	}
	/**
	 * @param storeCity the storeCity to set
	 */
	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}
	/**
	 * @return the storeMobNo
	 */
	public String getStoreMobNo() {
		return storeMobNo;
	}
	/**
	 * @param storeMobNo the storeMobNo to set
	 */
	public void setStoreMobNo(String storeMobNo) {
		this.storeMobNo = storeMobNo;
	}
	
	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	
	/**
	 * set the store ownerName
	 * @param ownerName
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * set the emailAddress
	 * @param emailAddress
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return store pincode
	 */
	public String getStorePincode() {
		return storePincode;
	}
	/**set the store pincode
	 * @param storePincode
	 */
	public void setStorePincode(String storePincode) {
		this.storePincode = storePincode;
	}
	/**
	 * @return store service area
	 */
	public String getServiceArea() {
		return serviceArea;
	}
	/**set the store service area
	 * @param serviceArea
	 */
	public void setServiceArea(String serviceArea) {
		this.serviceArea = serviceArea;
	}
		

}
