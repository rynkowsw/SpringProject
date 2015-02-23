package com.rynkowsw.project.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "user_status")
public class UserStatus {

	@Id
	@GeneratedValue
	@Column(name = "USERSTATUS_ID", unique = true)
	private Long userId;

	@Column(name = "WEIGHT")
	private String weight;

	@Column(name = "DATE")
	private Date date;

	@Column(name = "BONE_WEIGHT", unique = true)
	private String bone_weight;

	@Column(name = "FAT_WEIGHT")
	private String fat_weight;

	@Column(name = "MUSCLES_WEIGHT")
	private String muscles_weight;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id", nullable=false)
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBone_weight() {
		return bone_weight;
	}

	public void setBone_weight(String bone_weight) {
		this.bone_weight = bone_weight;
	}

	public String getFat_weight() {
		return fat_weight;
	}

	public void setFat_weight(String fat_weight) {
		this.fat_weight = fat_weight;
	}

	public String getMuscles_weight() {
		return muscles_weight;
	}

	public void setMuscles_weight(String muscles_weight) {
		this.muscles_weight = muscles_weight;
	}

}
