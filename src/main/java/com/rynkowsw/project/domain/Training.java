package com.rynkowsw.project.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

/**
 * The persistent class for the trainings database table.
 * 
 */
@Entity
@Table(name = "trainings")
public class Training implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "training_id", insertable = false, updatable = false, unique = true, nullable = false)
	private Integer trainingId;

	@Column(nullable = false, length = 50)
	private String name;
	
	@Column(length = 50)
	private String day;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Date date;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "excercise_id")
	private List<Excercis> excercis;

	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "plan_id", nullable = false)
	private List <Plan> plan;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	public Integer getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Excercis> getExcercis() {
		return excercis;
	}

	public void setExcercis(List<Excercis> excercis) {
		this.excercis = excercis;
	}
	
	public List<Plan> getPlan() {
		return plan;
	}

	public void setPlan(List<Plan> plan) {
		this.plan = plan;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}