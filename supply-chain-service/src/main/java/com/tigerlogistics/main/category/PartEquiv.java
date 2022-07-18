package com.tigerlogistics.main.category;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import com.tigerlogistics.main.category.PartEquiv.PartEquivKey;
import com.tigerlogistics.main.model.Model;



@Entity
@Table(name = "equiv_parts")
public class PartEquiv implements Model<PartEquivKey>{
	private static final long	serialVersionUID	= 1L;
	private PartEquivKey		id;
	private BigDecimal			rateAtoB;
	
	
	@Override
	@EmbeddedId
	public PartEquivKey getId() {
		return id;
	}
	
	
	public void setId(PartEquivKey key) {
		this.id = key;
	}
	
	
	@Column(nullable = false, precision = 18, scale = 6)
	@ColumnDefault(value = "1")
	public BigDecimal getRateAtoB() {
		return rateAtoB;
	}
	
	
	public void setRateAtoB(BigDecimal rateAtoB) {
		this.rateAtoB = rateAtoB;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof PartEquiv)) return false;
		PartEquiv other = (PartEquiv) obj;
		if (id == null) {
			if (other.id != null) return false;
		} else if (!id.equals(other.id)) return false;
		return true;
	}
	
	
	@Embeddable
	public static class PartEquivKey implements Serializable {
		private static final long	serialVersionUID	= 1L;
		private Part				partA;
		private Part				partB;
		
		
		@ManyToOne(	fetch = FetchType.LAZY, optional = false)
		@JoinColumn(name = "part_id_a")
		public Part getPartA() {
			return partA;
		}
		
		
		public void setPartA(Part partA) {
			this.partA = partA;
		}
		
		
		@ManyToOne(	fetch = FetchType.LAZY, optional = false)
		@JoinColumn(name = "part_id_b")
		public Part getPartB() {
			return partB;
		}
		
		
		public void setPartB(Part partB) {
			this.partB = partB;
		}

		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((partA == null) ? 0 : partA.hashCode());
			result = prime * result + ((partB == null) ? 0 : partB.hashCode());
			return result;
		}

		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			PartEquivKey other = (PartEquivKey) obj;
			if (partA == null) {
				if (other.partA != null)
					return false;
			} else if (!partA.equals(other.partA))
				return false;
			if (partB == null) {
				if (other.partB != null)
					return false;
			} else if (!partB.equals(other.partB))
				return false;
			return true;
		}
	}

}
