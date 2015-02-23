package com.rynkowsw.project.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

/**
 * The persistent class for the plans database table.
 * 
 */
@Entity
@Table(name = "plans")
public class Plan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "plan_id", insertable = false, updatable = false, unique = true, nullable = false)
	private Integer planId;

	@Temporal(TemporalType.DATE)
	@Column(name = "finish_work")
	private Date finishWork;

	@Temporal(TemporalType.DATE)
	@Column(name = "start_work")
	private Date startWork;

	
	@Column(nullable = false, length = 50)
	private String name;

	@Column(length = 400)
	private String description;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "training_id")
	private List<Training> trainings;


	public Integer getPlanId() {
		return planId;
	}


	public void setPlanId(Integer planId) {
		this.planId = planId;
	}


	public Date getFinishWork() {
		return finishWork;
	}


	public void setFinishWork(Date finishWork) {
		this.finishWork = finishWork;
	}


	public Date getStartWork() {
		return startWork;
	}


	public void setStartWork(Date startWork) {
		this.startWork = startWork;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public List<Training> getTrainings() {
		return trainings;
	}


	public void setTrainings(List<Training> trainings) {
		this.trainings = trainings;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}