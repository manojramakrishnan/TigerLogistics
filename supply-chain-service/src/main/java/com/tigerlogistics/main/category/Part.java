package com.tigerlogistics.main.category;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.ColumnDefault;

import com.tigerlogistics.main.model.BaseGenericModel;





@Entity
@Table(name = "category_part", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "part_number", "company_id" }, name = "ux_company_part_number") })
public class Part extends BaseGenericModel{
	private static final long	serialVersionUID	= 1L;
	private String				partNumber;
	private String				description;
	private Company				company;
	private BigDecimal			weight				= BigDecimal.ZERO;
	private BigDecimal			height				= BigDecimal.ZERO;
	private BigDecimal			width				= BigDecimal.ZERO;
	private BigDecimal			length				= BigDecimal.ZERO;
	private Boolean				blocked;
	private String				handlingInstructions;
	private String				otherDimensions;
	
	
	public Part() {
	}
	
	
	@Column(name = "part_number", length = 20, nullable = false)
	public String getPartNumber() {
		return partNumber;
	}
	
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	
	@Column(length = 512)
	public String getDescription() {
		return description;
	}
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "company_id")
	public Company getCompany() {
		return company;
	}
	
	
	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	@Column(nullable = false, precision = 18, scale = 6)
	@ColumnDefault(value = "0")
	public BigDecimal getWeight() {
		return weight;
	}
	
	
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	
	/**
	 * @return the height
	 */
	@Column(nullable = false, precision = 18, scale = 6)
	@ColumnDefault(value = "0")
	public BigDecimal getHeight() {
		return height;
	}
	
	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(BigDecimal height) {
		this.height = height;
	}
	
	/**
	 * @return the width
	 */
	@Column(nullable = false, precision = 18, scale = 6)
	@ColumnDefault(value = "0")
	public BigDecimal getWidth() {
		return width;
	}
	
	
	public void setWidth(BigDecimal width) {
		this.width = width;
	}
	
	
	@Column(nullable = false, precision = 18, scale = 6)
	@ColumnDefault(value = "0")
	public BigDecimal getLength() {
		return length;
	}
	
	
	public void setLength(BigDecimal length) {
		this.length = length;
	}
	
	
	@Column(length = 250)
	public String getHandlingInstructions() {
		return handlingInstructions;
	}
	
	
	public void setHandlingInstructions(String handlingInstructions) {
		this.handlingInstructions = handlingInstructions;
	}
	
	
	@Column(length = 250)
	public String getOtherDimensions() {
		return otherDimensions;
	}
	
	
	public void setOtherDimensions(String otherDimensions) {
		this.otherDimensions = otherDimensions;
	}
	
	
	public Boolean getBlocked() {
		return blocked;
	}
	
	
	public void setBlocked(Boolean blocked) {
		this.blocked = blocked;
	}

}
