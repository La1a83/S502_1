package com.demo.S502.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="Players")
public class PlayerResponseDto extends ResponseDto implements  Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2888065863883269402L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @PrePersist
    public void prePerssist() {
    	this.createdAt = new Date();
    }
    
    @OneToMany(mappedBy="player")
   
    private List<RoundResponseDto> rounds;
    private double success;
    
   
    
    
    //Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isEmpty()) {
			this.name = "Anònim";
		} else {
			this.name = name;
		}
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public List<RoundResponseDto> getRounds() {
		return rounds;
	}

	public void setRounds(List<RoundResponseDto> rounds) {
		this.rounds = rounds;
	}
	
	
	public double getSuccess() {
		return success;
	}


	public void setSuccess(double success) {
		this.success = success;
	}


    //Mètode ToString
	@Override
	public String toString() {
		return "PlayerResponseDto [id=" + id + ", name=" + name + ", createdAt=" + createdAt + ", rounds=" + rounds
				+ ", success=" + success + "%]";
	}
}