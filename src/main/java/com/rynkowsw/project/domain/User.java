package com.rynkowsw.project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", insertable = false, updatable = false, unique = true, nullable = false)
	private Integer userId;

	@Column(length = 50)
	private String email;

	@Column(length = 50)
	private String role;

	@Column(insertable = false, nullable = false, length = 1)
	private String isactive;

	@Temporal(TemporalType.DATE)
	@Column(insertable = false, updatable = false, nullable = false)
	private Date joined;

	@Column(nullable = false, length = 20)
	private String login;

	@Column(length = 32)
	private String name;

	@Column(nullable = false, length = 50)
	private String password;

	@Column(name = "second_name", length = 32)
	private String secondName;

	// bi-directional many-to-one association to Plan
	@OneToMany(mappedBy = "user")
	private List<Plan> plans;

	@OneToMany(mappedBy = "user")
	private List<Training> training;

	@OneToMany(mappedBy = "user")
	private List<Excercis> exercis;

	@OneToMany(mappedBy = "user")
	private List<UserStatus> userStatus;

	public List<Training> getTraining() {
		return training;
	}

	public void setTraining(List<Training> training) {
		this.training = training;
	}

	public List<Excercis> getExercis() {
		return exercis;
	}

	public void setExercis(List<Excercis> exercis) {
		this.exercis = exercis;
	}

	public List<UserStatus> getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(List<UserStatus> userStatus) {
		this.userStatus = userStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<UserStatus> getUser_status() {
		return userStatus;
	}

	public void setUser_status(List<UserStatus> user_status) {
		this.userStatus = user_status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User() {
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public Date getJoined() {
		return this.joined;
	}

	public void setJoined(Date joined) {
		this.joined = joined;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecondName() {
		return this.secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public List<Plan> getPlans() {
		return this.plans;
	}

	public void setPlans(List<Plan> plans) {
		this.plans = plans;
	}

}